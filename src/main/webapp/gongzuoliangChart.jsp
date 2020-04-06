<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
  <base href="<%=basePath%>">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>临床路径</title>
  <link rel="icon" href="" type="image/x-icon">
  <link rel="stylesheet" href="css/index.css" type="text/css">
  <!--icon 库链接-->
  <link href="css/font_604727_vlyfqr9fzj.css" rel="stylesheet" type="text/css">
  <meta name="keywords" content="" />
  <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
  <!-- Custom Theme files -->
  <link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
  <link href="css/style.css" type="text/css" rel="stylesheet" media="all"> 
  <link rel="stylesheet" href="css/swipebox.css">   
  <link href="css/chart.css" rel="stylesheet" type="text/css" />
  <link href="css/animate.css" rel="stylesheet" type="text/css" media="all"> <!-- animation -->
  <link href="css/font-awesome.css" rel="stylesheet"> <!-- font-awesome icons -->
  <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css"/>
  <!-- //Custom Theme files --> 
  <script src="js/adapter.js"></script> <!--rem适配js-->
  <link rel="stylesheet" href="css/base.css"> <!--初始化文件-->
  <link rel="stylesheet" href="css/menu.css"> <!--主样式-->
  <!-- js -->
  <script src="js/jquery-2.2.3.min.js"></script> 
  <script src="js/jquery.js"></script>
  <script src="js/jquery.min.js"></script>
  <script src="js/jquery.swipebox.min.js"></script>
  <script src="js/chart.js"></script>
  <!-- //js -->
  <!-- web-fonts --> 
  <link href="http://fonts.googleapis.com/css?family=Enriqueta:400,700" rel="stylesheet">
  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
  <!-- //web-fonts -->
  </head>
  <style>
  	.container___1I4jN undefined{
    text-align: center;
    background-color: #fff;
    border-radius: 20px;
    width: 300px;
    height: 350px;
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%,-50%);
}
  </style>
<body>
	<div id="page">
		<div id="left">
				<jsp:include page="left.jsp" />  
		</div>
		
		<div class="ant-layout">
			<div id="header">
				<jsp:include page="header.jsp" />      
       		</div>
       		
       		<div id="center">
			<div class="ant-layout-content">
    		<div class="content___2wEMm">
     		<div id="container">
  		   <canvas id="chart" width="600" height="500"></canvas>
  			<div>
			<td id="lujing1" style="font-size:14px;">
			路径：过敏性紫癜
			</td>
			</div>
  			<div style="float:right;margin:0 0 10px 0;">
  			<a href="gongzuoliangtongji.jsp">
    		<button type="button" id = "add-btn">图表</button>
    		</a>
    		</div>
			<div id="search" style="font-size:12px;margin-bottom:20px;">
         		选择路径ID查询：<!-- <input  type="text" style="border:0.5px solid gray;height:20px;"> -->
         					<select name="searchcontent" id="searchcontentId" style="border:0.5px solid gray;height:20px;">
         					<option value="原发性肺癌内科治疗">原发性肺癌内科治疗</option><option value="自发性气胸">自发性气胸</option><option value="1型糖尿病">1型糖尿病</option>
         					<option value="支原体肺炎">支原体肺炎</option><option value="过敏性紫癜">过敏性紫癜</option><option value="踝关节骨折">踝关节骨折</option>
         					<option value="慢性扁桃体炎">慢性扁桃体炎</option>
         					</select>
			<input type="button" name="submit" id="searchid" value="搜索">
			</div>
  <table id="chartData">

    <tr style="color: #0DA068">
      <td>收治病人</td><td id="ljtjId">21</td>
    </tr>

    <tr style="color: #082E54">
      <td>死亡病人</td><td id="pathId">2</td>
    </tr>

    <tr style="color: #292421">
      <td>痊愈病人</td><td id="cname">1</td>
    </tr>

    <tr style="color: #D2691E">
      <td>好转病人</td><td id="rjbr">3</td>
    </tr>
  </table>
	</div>
     </div>
    </div>
			</div>
		</div>
	</div>
<script src="js/menu.js"></script>
<script src="js/hm.js"></script>
<script src="js/index.js"></script>
<!-- Bootstrap的所有插件都依赖于jQuery，必须在引入bootstrap.min.js前引入jQuery -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 压缩版的bootstrap.min.js包含了所有的Bootstrap数据API插件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $('.delete').on('click',function () {
    if(confirm("确定要删除吗？")){
        //alert("确定");
        var str1=$(this).attr("name"); // jQuery attr() 方法用于获取属性值
        var str2="/organization/OrganizationManager_delete.do?param="+str1;
        window.location.href = str2;
    }else{
        //alert("取消");
    }
  })
</script>
</body>
</html>
<script type="text/javascript">
$(window).load(function() {
	var inputvalue="过敏性紫癜";
	 $("#center > div > div:nth-child(3)").text(inputvalue);
	getgongzuoliang(inputvalue);
});
//查询
$(document).on("click","#searchid",function(){
	  //获取输入框的值
	  var inputvalue = document.getElementsByName("searchcontent")[0].value;
	  $("#center > div > div:nth-child(3)").text(inputvalue);
	  getgongzuoliang(inputvalue);
});
function  getgongzuoliang(inputvalue){
	$.ajax({
		url:"http://localhost:8080/path/getgongzuoliang",
		type:"get",
		data:"inputvalue="+inputvalue,
		success:function(result){
   		 var item=result.extend.pageInfo.list;
   		 $("#ljtjId").text(item[0].gzltjId);
   		 $("#pathId").text(item[0].pathId);
   		 $("#cname").text(item[0].cname);
   		 $("#rjbr").text(item[0].szbr);
		}
	});
}
</script>