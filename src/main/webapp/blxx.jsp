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
          <span>病例详细信息</span>
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
              <form class="ant-form ant-form-inline" id="allbody">
               <div class="zcBox___3_N9p" style="border-bottom-color: rgb(225, 233, 245); margin-bottom: 0px;">
                <span class="zcTitle___21te8" style="background-color: rgb(225, 233, 245); color: rgb(51, 51, 51);">信息</span>
                <span class="subTitle___4d4k0"></span>
                <div id="search" style="float:right;font-size:12px;">
         		选择病人ID查询：<!-- <input  type="text" style="border:0.5px solid gray;height:20px;"> -->
         					<select name="searchcontent" id="searchcontentId" style="border:0.5px solid gray;height:20px;">
         					<option value="2">2</option><option value="3">3</option><option value="4">4</option>
         					<option value="5">5</option><option value="6">6</option><option value="7">7</option>
         					<option value="8">8</option><option value="9">9</option><option value="10">10</option>
         					<option value="11">11</option><option value="12">12</option><option value="15">15</option>
         					<option value="21">21</option><option value="22">22</option>
         					</select>
				<input type="button" name="submit" id="searchid" value="搜索">
			</div>
               </div>
               <div class="text-show___3oERO" style="display: flex; flex-wrap: wrap;">       
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="brid" class="" title="病人ID">病人ID</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control has-success">
                    <span class="ant-form-item-children">
                     <div value="ID" id="brid1" name="brid1" class="brid1"  data-__meta="[object Object]" data-__field="[object Object]">
                      
                     </div></span>
                    <!-- react-empty: 4532 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="name" class="" title="病人姓名">病人姓名</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control">
                    <span class="ant-form-item-children">
                     <div value="" id="brid2" name="brid2" data-__meta="[object Object]" data-__field="[object Object]">
                     	
                     </div></span>
                    <!-- react-empty: 4541 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="sex" class="" title="病人性别">病人性别</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control">
                    <span class="ant-form-item-children">
                     <div value="" id="brid3" name="brid3" data-__meta="[object Object]" data-__field="[object Object]">
                     	
                     </div></span>
                    <!-- react-empty: 4550 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="age" class="" title="病人年龄">病人年龄</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control has-success">
                    <span class="ant-form-item-children">
                     <div value="年龄" id="brid4" name="brid4" data-__meta="[object Object]" data-__field="[object Object]">
                                                                   
                     </div></span>
                    <!-- react-empty: 4559 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="keshi" class="" title="就诊科室">就诊科室</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control">
                    <span class="ant-form-item-children">
                     <div value="" id="brid5" name="brid5" data-__meta="[object Object]" data-__field="[object Object]">
                     	
                     </div></span>
                    <!-- react-empty: 4568 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="maindoctor" class="" title="主治医生">主治医生</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control has-success">
                    <span class="ant-form-item-children">
                     <div value="医生" id="brid6" name="brid6" data-__meta="[object Object]" data-__field="[object Object]">
                      	
                     </div></span>
                    <!-- react-empty: 4577 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="time" class="" title="就诊时间">就诊时间</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control">
                    <span class="ant-form-item-children">
                     <div value="" id="brid7" name="brid7" data-__meta="[object Object]" data-__field="[object Object]">
                     	
                     </div></span>
                    <!-- react-empty: 4586 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="history" class="" title="就诊历史">就诊历史</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control has-success">
                    <span class="ant-form-item-children">
                     <div value="历史" id="brid8" name="brid8" data-__meta="[object Object]" data-__field="[object Object]">
                 			   
                     </div></span>
                    <!-- react-empty: 4595 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="result" class="" title="就诊结果">就诊结果</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control has-success">
                    <span class="ant-form-item-children">
                     <div value="就诊结果" id="brid9" name="brid9" data-__meta="[object Object]" data-__field="[object Object]">
                  		   
                     </div></span>
                    <!-- react-empty: 4604 -->
                   </div>
                  </div>
                 </div>
                </div>
                <div class="disableVisble___1_Bdv">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="zresult" class="" title="诊疗结果">诊疗结果</label>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control has-success">
                    <span class="ant-form-item-children">
                     <div value="诊疗结果" id="brid10" name="brid10" data-__meta="[object Object]" data-__field="[object Object]">
                  		   
                     </div></span>
                    <!-- react-empty: 4604 -->
                   </div>
                  </div>
                 </div>
                </div>
               
               </div>
               
                <div class="disableVisble___1_Bdv" style="width: 100%;">
                 <div class="ant-row ant-form-item">
                  <div class="ant-form-item-label">
                   <label for="memo" class="" title="进入路径">进入路径</label>
                   <a href="lujingtuijian.jsp" id="brid11" name="brid11"></a>
                  </div>
                  <div class="ant-form-item-control-wrapper">
                   <div class="ant-form-item-control">
                    <span class="ant-form-item-children">
                     <div value="" id="memo" data-__meta="[object Object]" data-__field="[object Object]" style="width: 76vw;"></div></span>
                    <!-- react-empty: 4693 -->
                   </div>
                  </div>
                 </div>
                </div>
               </div>
              </form>
             </div>
            </div>
           </div>
           <div role="tabpanel" aria-hidden="true" class="ant-tabs-tabpane ant-tabs-tabpane-inactive"></div>
           <div role="tabpanel" aria-hidden="true" class="ant-tabs-tabpane ant-tabs-tabpane-inactive"></div>
           <div role="tabpanel" aria-hidden="true" class="ant-tabs-tabpane ant-tabs-tabpane-inactive"></div>
           <div role="tabpanel" aria-hidden="true" class="ant-tabs-tabpane ant-tabs-tabpane-inactive"></div>
           <div role="tabpanel" aria-hidden="true" class="ant-tabs-tabpane ant-tabs-tabpane-inactive"></div>
          </div>
         </div>
        </div>
       </div>
      </div>
			</div>
		</div>
	</div>
<script src="js/menu.js"></script>
<script src="js/menu1.js"></script>
<script src="js/hm.js"></script>
<script src="js/index.js"></script> 
</body>
</html>
<script type="text/javascript">
$(window).load(function() {
		getMedicalSimple(2);
});  
 //查询
  $(document).on("click","#searchid",function(){
	  //获取输入框的值
	  var mid = document.getElementsByName("searchcontent")[0].value;
	  getMedicalSimple(mid);
  });
//获取收藏加载的数据
function getMedicalSimple(mid){
	$.ajax({
		url:"http://localhost:8080/path/getMedicalSimple",
		type:"get",
		data:"mid="+mid,
		success:function(result){
			// $("#allbody").empty();
			 var item=result.extend.pageInfo.list;
				$("#brid1").html(item[0].pid);
				$("#brid2").html(item[0].pname);
				$("#brid3").html(item[0].psex);
				$("#brid4").html(item[0].page);
				$("#brid5").html(item[0].pdepartment);
				$("#brid6").html(item[0].dname);
				$("#brid7").html(item[0].visit_time);
				$("#brid8").html(item[0].visit_history);
				$("#brid9").html(item[0].treat_result);
				$("#brid10").html(item[0].zresult);
				$("#brid11").html(item[0].recom_pathid);

		}
		});
	
}
</script>