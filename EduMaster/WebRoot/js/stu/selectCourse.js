function addClass(obj,cno){
	var s=$(obj).html();
	if(s=="加入"){	
		$.ajax({  
            type:'post',  
            traditional :true,  
            url:'./SelectCourse.do',  
            dataType:'json',
            data:{'cno':cno},                         
            error:function(data){  
                alert("error"+data.message.error);  
            },  
            success:function(data){  
            	console.log(data);
                alert(data.message.success); 
                $(obj).addClass("btn-warning").removeClass("btn-success");
        		$(obj).html('退选');
            } 
        }); 
	}else{
		$.ajax({  
            type:'post',  
            traditional :true,  
            url:'./DeSelectCourse.do',  
            dataType:'json',
            data:{'cno':cno},                         
            error:function(data){  
                alert("error"+data.message.error);  
            },  
            success:function(data){  
            	console.log(data);
                alert(data.message.success); 
                $(obj).removeClass("btn-warning").addClass("btn-success");
        		$(obj).html('加入');
            } 
        }); 
	}

	

}

function ClassDetail(cno){
	/*alert("详情");*/
	$.ajax({  
        type:'post',  
        traditional :true,  
        url:'./queryCourseDetail.do',  
        dataType:'json',
        data:{'cno':cno},                         
        error:function(data){  
            alert("获取失败");  
        },  
        success:function(data){  
        	$('#myModalLabel').html("课表详情");
        	$('.modal-body').html(
        			"<p>授课老师："+data.course.teacher.tname+"</p>"+
        			"<p>性别："+data.course.teacher.tsex+"</p>"+
        			"<p>年龄："+data.course.teacher.tage+"</p>"+
        			"<p>职称："+data.course.teacher.pro+"</p>"+
        			"<p>简介："+data.course.teacher.tinfo+"</p>"+
        			"<p>教学日历："+data.course.course.cinfo+"</p>"
        			);
        	$('.modal-footer').html("");
        } 
    });
}

/*点击按钮和页码，传搜索条件*/
function SearchParam(currentPage){
	var weekday=$("#weekday  option:selected").val();
	var majorInfo=$("#majorInfo  option:selected").val();
	var cname=$("#cname").val();
	var tname=$("#tname").val();
	$.post('queryCourse.do', {
		weekday: weekday,
		cname: cname ,
		tname:tname,
		currentPage:currentPage,
		majorInfo:majorInfo,
		pageSize:9
			},function(data){
				$("body").html(data);
			     } );
}

