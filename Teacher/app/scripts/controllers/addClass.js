'use strict';

angular.module('eduApp')
  .controller('AddclassCtrl', function ($scope,$http,$cookieStore) {
    $scope.items = [
/*      {title:"课时",content:"3"}*/
    ];

    $scope.addTodo = function () {
       $scope.items.push($scope.new);
       $scope.new='';/*必须得清空，否则底下的值会跟着变化*/
     };
     $scope.removeTodo = function (index) {
        $scope.items.splice(index, 1);
    };
         
    $scope.activities =
    [
        "课程名称",
        "课时",
        "课程介绍",
        "学分"
    ];
    /*判断是否输入正确*/
    $scope.save = function() {
      var myclass={};
      var obj = $scope.items;
      var i;
      var j;
      console.log(obj.length);
      if(obj.length!=4){
        alert("请输入正确课程内容");
        return;
      }

      for(i=0;i<obj.length;i++)
        for(j=i+1;j<obj.length;j++)
          if(obj[i].title==obj[j].title){
            alert("请输入正确课程内容");
            return;
          }


      for(i=0;i<obj.length;i++){
        if(obj[i].title=="课程名称"){
          myclass.cname=obj[i].content;
        }else if(obj[i].title=="课时"){
          myclass.ctime=obj[i].content;
        }else if(obj[i].title=="课程介绍"){
          myclass.cinfo=obj[i].content;
        }else if(obj[i].title=="学分"){
          if(isNaN(obj[i].content)){
            alert("请输入数字型学分");
            return;
          }
          myclass.credit=parseFloat(obj[i].content);
        }
      }
      myclass.tno=$cookieStore.get("userId");
      console.log(JSON.stringify(myclass));


      $http.post('http://localhost:8080/EduMaster/addCourse.do', JSON.stringify(myclass))
            .success(function(){
                console.info("添加成功");
                location.reload();
            })
            .error(function(){
                console.info("添加成功");
                location.reload();
            });
	};

  });
