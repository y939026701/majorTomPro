//切换标签自动获得焦点
var $inputs = $("input[type=text]");
$inputs[0].focus(event);
$("#loadLI").click(function () {
  $("#registerForm")[0].reset();
  setTimeout(function () {
    $("#tel1").focus();
  })
},1000);
$("#registerLi").click(function () {
  $("#loadForm")[0].reset();
  setTimeout(function () {
    $("#tel2").focus();
  },1000);
});

//登录失去焦点事件
$("#tel1").blur(function () {
  function callAjax() {
    alert("2");
    $.ajax({
      "url":"",
      "method":"POST",
      "data": "name="+$(".loadName").val(),
      "dataType":"text",
      "success":function f(data) {
        if(data.trim() == true){
          $('.err').html("该手机/邮箱已被使用！");
          $('.err').css("color","red");
        }else {
          $('.err').html("可用的手机/邮箱。");
          $('.err').css("color","green");
        }
      },
    });
  }
});

//注册失去焦点事件
$("#tel2").blur(function () {
  function callAjax() {
    alert("2");
    $.ajax({
      "url":"",
      "method":"POST",
      "data": "name="+$(".loadName").val(),
      "dataType":"text",
      "success":function f(data) {
        if(data.trim() == true){
          $('.err').html("该手机/邮箱已被使用！");
          $('.err').css("color","red");
        }else {
          $('.err').html("可用的手机/邮箱。");
          $('.err').css("color","green");
        }
      },
    });
  }
});
