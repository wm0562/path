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
        <div class="wp-content___1AXIT" style="height: 90vh;">
         <img class="back___W15R5" src="images/fanhui.jpg" style="height: 18px;width: 18px;" onclick="javascript:window.history.back(-1);" title="返回上一页" alt="返回点击图片" />
         <div style="display: flex; align-items: center; margin-bottom: 10px; margin-left: -10px;">
          <div style="width: 5px; height: 16px; background: rgb(57, 150, 255); margin-right: 10px;"></div>
          <span>单路径费用详细信息</span>
         </div>
         <div class="ant-tabs ant-tabs-top myTab___1qrc4 ant-tabs-line">
          <div role="tablist" class="ant-tabs-bar" tabindex="0">
           <div class="ant-tabs-nav-container">
            <span unselectable="unselectable" class="ant-tabs-tab-prev ant-tabs-tab-btn-disabled"><span class="ant-tabs-tab-prev-icon"></span></span>
            <span unselectable="unselectable" class="ant-tabs-tab-next ant-tabs-tab-btn-disabled"><span class="ant-tabs-tab-next-icon"></span></span>
            <div class="ant-tabs-nav-wrap">
             <div class="ant-tabs-nav-scroll">
             </div>
            </div>
           </div>
          </div>
          <div class="ant-tabs-content ant-tabs-content-animated" style="margin-left: 0%;">
           <div role="tabpanel" aria-hidden="false" class="ant-tabs-tabpane ant-tabs-tabpane-active">
            <div>
             <div style="box-shadow: 0px 0px 0px 0px; height: 100%;">
              <div style="margin-top: 10px; margin-bottom: 10px;">
              </div>
              <form class="ant-form ant-form-inline">
               <div class="zcBox___3_N9p" style="border-bottom-color: rgb(225, 233, 245); margin-bottom: 0px;">
                <span class="zcTitle___21te8" style="background-color: rgb(225, 233, 245); color: rgb(51, 51, 51);">信息</span>
                <span class="subTitle___4d4k0"></span>
                <div id="search" style="float:right;font-size:12px;">
         		选择路径ID查询：<!-- <input  type="text" style="border:0.5px solid gray;height:20px;"> -->
         					<select name="searchcontent" id="searchcontentId" style="border:0.5px solid gray;height:20px;">
         					<option value="11">11</option><option value="12">12</option><option value="25">25</option>
         					<option value="28">28</option><option value="33">33</option><option value="44">44</option>
         					<option value="74">74</option>
         					</select>
				<input type="button" name="submit" id="searchid" value="搜索">
			</div>
               </div>
               <div class="text-show___3oERO" style="display: flex; flex-wrap: wrap;">       
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="path_id" class="" title="路径ID">路径ID</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control has-success">
                    <span class="ant-form-item-children">
                     <div value="ID" id="path_id" name="path_id" data-__meta="[object Object]" data-__field="[object Object]">
                      
                     </div></span>
                    <!-- react-empty: 4532 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="cname" class="" title="路径名称">路径名称</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control has-success">
                    <span class="ant-form-item-children">
                     <div value="cname" id="cname" name="cname" data-__meta="[object Object]" data-__field="[object Object]">
                      
                     </div></span>
                    <!-- react-empty: 4532 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="hosp_exp" class="" title="住院费用">住院费用</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control">
                    <span class="ant-form-item-children">
                     <div value="住院费用" id="hosp_exp" name="hosp_exp" data-__meta="[object Object]" data-__field="[object Object]">
                     	
                     </div></span>
                    <!-- react-empty: 4568 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="med_exp" class="" title="病种医疗费用">病种医疗费用</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control has-success">
                    <span class="ant-form-item-children">
                     <div value="病种医疗费用" id="med_exp" name="med_exp" data-__meta="[object Object]" data-__field="[object Object]">
                      	
                     </div></span>
                    <!-- react-empty: 4577 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="drug_exp" class="" title="病种药品费用">病种药品费用</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control">
                    <span class="ant-form-item-children">
                     <div value="病种药品费用" id="drug_exp" name="drug_exp" data-__meta="[object Object]" data-__field="[object Object]">
                     	
                     </div></span>
                    <!-- react-empty: 4586 -->
                   </div>
                  </div>
                 </div>
                </div>
               </div>
               </div>
              </form>
             </div>
            </div>
           </div>
           
          </div>
         </div>
        </div>
       </div>
      </div>
			</div>
		</div>
	</div>
  <script src="js/menu.js"></script>
  <script src="js/hm.js"></script>
  <script src="js/index.js"></script> 
</body>
</html>
<script type="text/javascript">
$(window).load(function() {
	getSinPathFee(11);
});  
 //查询
  $(document).on("click","#searchid",function(){
	  //获取输入框的值
	  var mid = document.getElementsByName("searchcontent")[0].value;
	  getSinPathFee(mid);
  });
//获取收藏加载的数据
function getSinPathFee(mid){
	$.ajax({
		url:"http://localhost:8080/path/getSinPathFee",
		type:"get",
		data:"mid="+mid,
		success:function(result){
			 var item=result.extend.pageInfo.list;
				$("#path_id").html(item[0].path_id);
				$("#cname").html(item[0].cname);
				$("#hosp_exp").html(item[0].hosp_exp);
				$("#med_exp").html(item[0].med_exp);
				$("#drug_exp").html(item[0].drug_exp);
		}
		});
	
}
</script>