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
<body rlt="1" style="">
   <div class="header___3qcr5 ant-layout-header">
    <div class="trigger___3042h">
     <i class="anticon anticon-menu-fold" style="color: rgb(60, 143, 255); font-size: 18px;"></i>
    </div>
    <div style="display: inline-block;">
     <div class="ant-breadcrumb">
      <span><span class="ant-breadcrumb-link"><a href="#"></a></span><span class="ant-breadcrumb-separator">/</span></span>
      <span><span class="ant-breadcrumb-link"><span>信息</span></span><span class="ant-breadcrumb-separator">/</span></span>
     </div>
    </div>
    <div class="login___XPRSo">
     <span class="task___3jqgv">
     	<button type="button" class="ant-btn ant-btn-primary">
     	<a href="brxx.jsp">
       <i class="iconfont undefined icon-danju-tianchong" style="color: white;">
       	<span></span>
       </i>首页</a>
     	</button>
     </span>
     <% String strName=(String)session.getAttribute("user");
      					if(strName==null){%>
      						<a href="login.jsp" class="ant-dropdown-trigger" style="color: black; text-decoration: none;"><i class="anticon anticon-user"></i>
						               登录
						     </a>&nbsp;&nbsp;
						     <a href="/path/logout" class="ant-dropdown-trigger" style="color: gray; text-decoration: none;">
						      	注销
						     </a>
      					<% }else{%>
      					<a href="ysxx.jsp" class="ant-dropdown-trigger" style="color: black; text-decoration: none;"><i class="anticon anticon-user"></i>
						            <%=strName %>您好!
						     </a>&nbsp;&nbsp;
						     <a href="/path/logout" class="ant-dropdown-trigger" style="color: gray; text-decoration: none;">
						      	注销
						     </a>
      					<% 
      					}
      					%>		
     
    <!--  <a href="login.jsp" class="ant-dropdown-trigger" style="color: black; text-decoration: none;"><i class="anticon anticon-user"></i>
               登录
     </a>&nbsp;&nbsp;
     <a href="" class="ant-dropdown-trigger" style="color: gray; text-decoration: none;">
      	注销
     </a> -->
    </div>
   </div>
</body>
</html>