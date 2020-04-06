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
<body rlt="1">
  <div id="menu" style="height:100%">
    <!--隐藏菜单-->
    <div id="ensconce">
        <h2>
            <img src="images/show.png" alt="">
            	临床路径统计系统
        </h2>
    </div>

    <!--显示菜单-->
    <div id="open">
        <div class="navH">
           	临床路径统计系统
        </div>
        <div class="navBox">
            <ul>
            	<li>
                    <a href="ysxx.jsp"><h2 class="obtain">医生信息</h2></a>
                </li>
                <li>
                   <a href="brxx.jsp"><h2 class="obtain">病人信息</h2></a>
                </li>
                <li>
                    <a href="blxx.jsp"><h2 class="obtain">病例信息</h2></a>
                </li>
                <li>
                    <h2 class="obtain">路径管理<i></i></h2>
                    <div class="secondary">
                        <a href="lujing.jsp"><h3>路径信息</h3></a>
                        <a href="rujingbingren.jsp"><h3>入径病人</h3></a>
                        <a href="chujingbingren.jsp"><h3>出径病人</h3></a>
                        <a href="lujingchaoshi.jsp"><h3>路径超时</h3></a>
                        <a href="lujingfeiyong.jsp"><h3>路径费用</h3></a>
                        <a href="lujingtongji.jsp"><h3>路径统计</h3></a>
                    </div>
                </li>
                <li>
                    <h2 class="obtain">费用管理<i></i></h2>
                    <div class="secondary">
                        <a href="keshifeiyong.jsp"><h3>科室费用</h3></a>
                        <a href="yiyuanfeiyong.jsp"><h3>医院费用</h3></a>
                        <a href="danlujingfeiyong.jsp"><h3>单路经费用</h3></a>
                        <a href="feiyongtongji.jsp"><h3>费用统计</h3></a>
                    </div>
                </li>
                <li>
                    <a href="gongzuoliangtongji.jsp"><h2 class="obtain">工作量统计</h2></a>
                </li>
            </ul>
       	 </div>
    	</div>
	</div>
<script src="js/menu.js"></script>
</body>
</html>