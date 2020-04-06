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
  <link href="css/animate.css" rel="stylesheet" type="text/css" media="all"> <!-- animation -->
  <link href="css/font-awesome.css" rel="stylesheet"> <!-- font-awesome icons -->
  <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css"/>
  <!-- //Custom Theme files --> 
  <script src="js/adapter.js"></script> <!--rem适配js-->
  <link rel="stylesheet" href="css/base.css"> <!--初始化文件-->
  <link rel="stylesheet" href="css/menu.css"> <!--主样式-->
  <!-- js -->
  <script src="js/jquery-2.2.3.min.js"></script> 
  <script src="js/jquery-1.6.2.min.js"></script>
  <script src="js/jquery.js"></script>
  <script src="js/jquery.min.js"></script>
  <script src="js/jquery.swipebox.min.js"></script>
 
  <!-- //js -->
  <!-- web-fonts -->
  <link href="http://fonts.googleapis.com/css?family=Enriqueta:400,700" rel="stylesheet">
  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
  <!-- //web-fonts -->
</head>
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
     <div>
        <h3 class="w3layouts-title wow fadeInDown animated" data-wow-delay=".5s">医生意见</h3>
        <div class="contact-form">
      		<div class="col-md-7 contact-right wow fadeInRight animated" data-wow-delay=".5s" style="height: 100%;width: 100%;">
					<form action="#" method="post">  
						病人ID：<input type="text" name="pid"  required="" style="height: 30px;width: 100px;"><!--以下数据自动获取-->
						病人姓名：<input type="text" name="pname"  required="" style="height: 30px;width: 100px;">
						路径ID：<input type="text" class="path_id" name="path_id" required="" style="height: 30px;width: 100px;">
						路径名称：<input type="text" class="cname" name="cname" required="" style="height: 30px;width: 150px;">
						病种ID：<input type="text" class="cid" name="cid" required="" style="height: 30px;width: 100px;">
						病种名称：<input type="text" class="jname" name="jname" required="" style="height: 30px;width: 100px;"><br />
						路径所在科室：<input type="text" class="cdepartment" name="cdepartment" required="" style="height: 30px;width: 100px;"><!--/*根据所在科室推送到该科室主任名下*/-->
						是否同意进入：是<input type="radio" class="yflag" name="yflag" required="" value="yes" style="height: 12px;width: 12px;">
						                          否<input type="radio" class="nflag" name="nflag" required="" value="no" style="height: 12px;width: 12px;"><br />
						入径时间：<input type="date" class="ttime" name="ttime" required="" style="height: 30px;width: 100px;">
<!--						<textarea name="feedback" placeholder="feedback" required=""></textarea>
-->						<input class="wow zoomIn animated" data-wow-delay=".5s" type="submit" value="提交"> 
					</form>
				</div>                  
                               
        </div>
    
      </div>
      <!--<div style="position: fixed; bottom: 8px; left: 240px; font-size: 14px;">共 xxxx条</div>-->
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

<div>
	<!--<div data-reactroot="" class="ant-message">
		<span></span>
	</div>-->
</div>
</body>
</html>