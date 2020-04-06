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
  <link rel='stylesheet prefetch' href='css/jquery.dataTables.css'>
  <link rel="stylesheet" href="css/table.css">
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
    		<a href="feiyongChart.jsp">
    		<button type="button" id = "add-btn" style="backcolor:blue;">扇形图</button>
    		</a>
    		<div id="search" style="float:right;font-size:12px;margin-bottom:20px;">
         		选择路径ID查询：<!-- <input  type="text" style="border:0.5px solid gray;height:20px;"> -->
         					<select name="searchcontent" id="searchcontentId" style="border:0.5px solid gray;height:20px;">
         					<option value="原发性肺癌内科治疗">原发性肺癌内科治疗</option><option value="自发性气胸">自发性气胸</option><option value="1型糖尿病">1型糖尿病</option>
         					<option value="支原体肺炎">支原体肺炎</option><option value="过敏性紫癜">过敏性紫癜</option><option value="踝关节骨折">踝关节骨折</option>
         					<option value="慢性扁桃体炎">慢性扁桃体炎</option>
         					</select>
			<input type="button" name="submit" id="searchid" value="搜索">
			</div>
			<div>
			<td id="lujing1">
			路径：过敏性紫癜
			</td>
			</div>


		<div class="container">
      		<table id="dt-table" class="display cell-border">
        	<thead>
          	<tr>
            	<th>名称</th>
            	<th>数量 </th>
            	<th>占比 </th>
          	</tr>
        	</thead>
        	<tbody>
          	<tr>
            	<td>科室费用</td>
            	<td id="departFee">112</td>
            	<td id="hospbr">7.53%</td>
          	</tr>
          	<tr>
            	<td>医院费用</td>
            	<td id="hospFee">1221</td>
            	<td id="pathbr">82.11%</td>
          	</tr>
          	<tr>
            	<td>单路经费用</td>
            	<td id="pathFee">154</td>
            	<td id="departbr">12.61%</td>
          	</tr>
        	</tbody>
      		</table>
      		<div id="chart"></div>
     		</div>
    		</div>
			</div>
		</div>
	</div>
<script src='js/jquery-3.3.1.min.js'></script>
<script src='js/jquery.dataTables.js'></script>
<script src='js/highcharts.js'></script>
<script src='js/no-data-to-display.js'></script>
<script  src="js/table.js"></script>
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
	getfeiyong(inputvalue);
});
//查询
$(document).on("click","#searchid",function(){
	  //获取输入框的值
	  var inputvalue = document.getElementsByName("searchcontent")[0].value;
	  $("#center > div > div:nth-child(3)").text(inputvalue);
	  getfeiyong(inputvalue);
});
function  getfeiyong(inputvalue){
	$.ajax({
		url:"http://localhost:8080/path/getfeiyong",
		type:"get",
		data:"inputvalue="+inputvalue,
		success:function(result){
   		 var item=result.extend.pageInfo.list;
   		 $("#hospFee").text(item[0].hospFee);
   		 $("#pathFee").text(item[0].pathFee);
   		 $("#departFee").text(item[0].departFee);
   		 $("#hospbr").text(item[0].hospbr);
   		 $("#pathbr").text(item[0].pathbr);
   		 $("#departbr").text(item[0].departbr);
		}
	});
}
</script>