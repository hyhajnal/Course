var flag=0;
function submitForm(){
    var URL;
    if(flag==0){
         URL="./addCourseSubmit.do";
    }else{
        URL="./updateCourseSubmit.do";
    }
    $("#Course").attr("action", URL); 
    $("#Course").submit(); 


}


function Add(){
    flag=0;
    $('#myModalLabel').html("添加课程");
    $("#cno").attr("name","");
    $("#ctime").attr("value","");
    $("#clong").attr("value","");
    $("#weekday").attr("value","");
    $("#cname").attr("value","");
    $("#cadd").attr("value","");
    $("#cinfo").attr("value","");
    $('#AddCourse').modal('show');
}

function Del(){
    var rows = $('#dg').datagrid("getSelections");
    if (rows.length==0){
        alert("请至少选择一行数据!"); 
        return false; 
        } 

    var ids = new Array(); 
    for (var i = 0; i < rows.length; i++) { 
        ids[i]=rows[i].cno;
    }
    $.messager.confirm('Confirm', '确定删除此用户?', function (r) {
        if (r) {
            $.ajax({  
                    type:'post',  
                    traditional :true,  
                    url:'./deleteCourses.do',  
                    dataType:'json',
                    data:{'cnoList':ids},                         
                    error:function(data){  
                        alert("出错了！！:"+data.msg);  
                    },  
                    success:function(data){  
                        alert("success:"+data.msg);  
                        $('#dg').datagrid('reload');  
                    } 
                }); 
        }
    });/*message*/
}

function editrow(index){
    flag=1;
    var row = $('#dg').datagrid('getSelected'); 
    if(!row){
        $.messager.alert('警告', '没有选中记录，请选一条!', 'warning');
        return;
    }
    if(row.cno!=index){
        $.messager.alert('警告', '选了多条记录，请选其中一条!', 'warning');
        return;
    }

    $('#myModalLabel').html("修改课程");
    $("#cno").attr("value",row.cno);
    $("#cno").attr("name","cno");
    $("#cname").attr("value",row.cname);
    $("#ctime").attr("value",row.ctime);
    $("#clong").attr("value",row.clong);
    $("#weekday").attr("value",row.weekday);
    $("#cadd").attr("value",row.cadd);
    $("#cinfo").attr("value",row.cinfo);
    $("#credit").attr("value",row.credit);
    $('#AddCourse').modal('show');
}
function deleterow(index){
    $.messager.confirm('Confirm', '确定删除此用户?', function (r) {
        if (r) {
            $.ajax({  
                    type:'post',  
                    traditional :true,  
                    url:'./deleteCourse.do',  
                    dataType:'json',
                    data:{'cno':index},                         
                    error:function(data){  
                        alert("出错了！！:"+data.msg);  
                    },  
                    success:function(data){  
                        alert("success:"+data.msg);  
                        $('#dg').datagrid('reload');  
                    } 
                });   
        }
    });
}






$(function(){
   $('#dg').datagrid({
    title:'课程管理',
    fit:true,
    toolbar:"#tb",
    width:"auto",
    height:"auto",
    pageSize:15,
    pageList:[5,10,15,20],
    nowrap:false,
    striped: true,
    collapsible:true,
    url:'./queryCourseList.do',
    loadMsg:'数据装载中......',
    remoteSort:false,
    fitColumns:true,
    frozenColumns:[[
     {field:'ck',checkbox:true}
    ]],
    columns:[[
     {title:'编号',field:'cno',width:'10',align:'center'},
     {title:'课程名',field:'cname',width:'10',align:'center'},
     {title:'学分',field:'credit',width:'10',align:'center'},
     {title:'学时',field:'clong',width:'10',align:'center'},
     {title:'上课时间',field:'weekday',width:'10',align:'center'},
     {title:'上课地点',field:'cadd',width:'15',align:'center'},
     {title:'课时',field:'ctime',width:'15',align:'center'},
     {field:'action',title:'Action',width:'10',align:'center',  
         formatter:function(value,row,index){   
                 var e = '<a href="#" onclick="editrow('+row.cno+')"><span class="glyphicon glyphicon-edit">编辑</span></a> ';  
                 var d = '<a href="#" onclick="deleterow('+row.cno+')"><span class="glyphicon glyphicon-trash">删除</span></a>';  
                 return e+d;                  
         }  
     }
    ]],
    pagination:true,
    rownumbers:true
    
    
   });

   var p = $('#dg').datagrid('getPager'); 
   $(p).pagination({ 
       pageSize: 10,//每页显示的记录条数，默认为10 
       pageList: [5,10,15],//可以设置每页记录条数的列表 
       beforePageText: '第',//页数文本框前显示的汉字 
       afterPageText: '页    共 {pages} 页', 
       displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录', 
       onBeforeRefresh:function(){
           $(this).pagination('loading');
           alert('before refresh');
           $(this).pagination('loaded');
       } 
   }); 
   
   $("#dg").datagrid({loadFilter:pagerFilter}); 
   
   function pagerFilter(data)  
   {  
        var opts = $("#dg").datagrid('options');  
        var pager =$("#dg").datagrid('getPager');  
        pager.pagination({  
              onSelectPage:function(pageNum, pageSize){  
                  opts.pageNumber = pageNum;  
                  opts.pageSize = pageSize;  
                  pager.pagination('refresh',{  
                      pageNumber:pageNum,  
                      pageSize:pageSize  
                  });  
                  $('#dg').datagrid('loadData',data);  
              }  
          });  
          if(!data.originalRows){  
              data.originalRows =(data.rows);  
          }  
          var start =(opts.pageNumber-1)*parseInt(opts.pageSize);  
          var end = start + parseInt(opts.pageSize);  
          data.rows =(data.originalRows.slice(start, end));  
          return data;  
      } 
    /*搜索框*/
    $('#ss').searchbox({   
        searcher:function(value,name){   
        		$("#dg").datagrid("load",{
            		"cname":value
            	});
        	 /*alert(value+":"+name);*/

        },   
        menu:'#mm',   
        prompt:'请输入查询值'  
    });

    
  });