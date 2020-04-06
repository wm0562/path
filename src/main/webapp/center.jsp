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
   <div class="ant-layout-content">
    <div class="content___2wEMm">
     <div>
      <div class="container___1I4jN undefined" style="height: 89vh;">
       <div class="containerHeader___1Lcq6">
        	<div class="container">
   			 	<form method="post" action="#" class="form-horizontal" role="form" id="myForm" onsubmit="return ">
        		<div class="modal fade" id="myModal"  tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <!--  定义模态框，过渡效果为淡入，id为myModal,tabindex=-1可以禁用使用tab切换，aria-labelledby用于引用模态框的标题，aria-hidden=true保持模态框在触发前窗口不可见  -->
            	<div class="modal-dialog">
                <!--  显示模态框对话框模型（若不写下一个div则没有颜色）  -->
                <div class="modal-content">
                    <!--  显示模态框白色背景，所有内容都写在这个div里面  -->

                    <div class="btn-info modal-header">
                        <!--  模态框标题  -->
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <!--  关闭按钮  -->
                        <h4>查看</h4>
                        <!--  标题内容  -->
                    </div>

                    <div class="modal-body" id="modal-data">
                        <!--  模态框内容，我在此处添加一个表单 -->
                        <form class="" role="">
                                                                            病人ID： <input type="text" name="brid" style="width: 120px;height: 25px;border: 1px solid gainsboro;"/>
                                                                            姓名： <input type="text" name="name" style="width: 120px;height: 25px;border: 1px solid gainsboro;"/>
                                                                            性别： <input type="text" name="sex" style="width: 120px;height: 25px;border: 1px solid gainsboro;"/>
                                                                            <br />
                                                                            年龄： <input type="text" name="age" style="width: 120px;height: 25px;border: 1px solid gainsboro;"/>
                                                                            地址： <input type="text" name="address" style="width: 120px;height: 25px;border: 1px solid gainsboro;"/>
                                                                            状态： <input type="text" name="status" style="width: 120px;height: 25px;border: 1px solid gainsboro;"/>
                                                                           入院时间： <input type="date" name="ruyuanshijian" style="width: 150px;height: 30px;border: 1px solid gainsboro;"/>   
                                                                            出院时间： <input type="date" name="chuyuanshijian" style="width: 150px;height: 30px;border: 1px solid gainsboro;"/>                                                     
                        </form>
                    </div>

                    <div class="modal-footer">
                        <!--  模态框底部样式，一般是提交或者确定按钮 -->
                        <button type="submit" class="btn btn-info" id="save_data" onclick="formSubmit()" >确定</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                 	   </div>

                		</div><!-- /.modal-content -->
            		</div>
        		</div> <!-- /.modal -->
   	 		</form>
			</div>
        </span></span>
       </div>
       <div>
        <div class="myTable___37LrD">
         <div class="ant-table-wrapper">
          <div class="ant-spin-nested-loading">
           <div class="ant-spin-container">
            <div class="ant-table ant-table-middle ant-table-bordered ant-table-fixed-header ant-table-scroll-position-left">
             <div class="ant-table-content">
              <div class="ant-table-scroll">
               <div class="ant-table-header" style="margin-bottom: -19px; padding-bottom: 0px;">
                <table class="">
                 <colgroup>
                  <col style="width: 150px; min-width: 150px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 250px; min-width: 250px;" />
                 </colgroup>
                 <thead class="ant-table-thead">
                  <tr>
                   <th class="wpColumn"><span>病人ID</span></th>
                   <th class="wpColumn"><span>姓名</span></th>
                   <th class="wpColumn"><span>性别</span></th>
                   <th class="wpColumn"><span>年龄</span></th>
                   <th class="wpColumn"><span>地址</span></th>
                   <th class="wpColumn"><span>状态</span></th>
                   <th class="wpColumn"><span>入院时间</span></th>
                   <th class="wpColumn"><span>出院时间</span></th>
                   
                   <th class="wpColumn"><span>操作</span></th>
                  </tr>
                 </thead>
                </table>
               </div>
               <div class="ant-table-body" style="max-height: 868px; overflow-y: scroll;">
                <table class="">
                 <colgroup>
                  <col style="width: 150px; min-width: 150px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 200px; min-width: 200px;" />
                  <col style="width: 250px; min-width: 250px;" />
                 </colgroup>
                 <tbody class="ant-table-tbody">
                  <tr class="ant-table-row  ant-table-row-level-0">
                   <td class="wpColumn">
                   	<a href="yiru.jsp">1</a>
                  </td>
                   <td class="wpColumn">费谷</td>
                   <td class="wpColumn">男</td>
                   <td class="wpColumn">25</td>
                   <td class="wpColumn">浙江省杭州市滨江区</td>
                   <td class="wpColumn">已入</td>
                   <td class="wpColumn">2018-12-9</td>
                   <td class="wpColumn">2018-12-29</td>
                   <td class="wpColumn">
                    <div>
                     <button class="btn btn-primary" data-toggle="modal" data-target="#myModal" style="background: #FFFFFF;color: #558aff;border:0px solid #FFFFFF;padding: 0px;"><span style="margin-left: 7px; margin-right: 7px; cursor: pointer;"><i class="iconfont undefined icon-chakan1" style="color: rgb(19, 216, 149); font-size: 18px;"><span></span></i></span></button>  
                    </div></td>
                  </tr>

                  <tr class="ant-table-row  ant-table-row-level-0">
                   <td class="wpColumn">
                   	<a href="daijinru.jsp">2</a>
                    </td>
                   <td class="wpColumn">孙菊渠</td>
                   <td class="wpColumn">女</td>
                   <td class="wpColumn">26</td>
                   <td class="wpColumn">浙江省杭州市西湖区</td>
                   <td class="wpColumn">待入</td>
                   <td class="wpColumn">2018-12-3</td>
                   <td class="wpColumn">2019-1-5</td>
                   <td class="wpColumn">
                    <div>
                     <button class="btn btn-primary" data-toggle="modal" data-target="#myModal" style="background: #FFFFFF;color: #558aff;border:0px solid #FFFFFF;padding: 0px;"><span style="margin-left: 7px; margin-right: 7px; cursor: pointer;"><i class="iconfont undefined icon-chakan1" style="color: rgb(19, 216, 149); font-size: 18px;"><span></span></i></span></button>
                     <button class="btn btn-primary" data-toggle="modal" data-target="#myModal" style="background: #FFFFFF;color: #558aff;border:0px solid #FFFFFF;padding: 0px;"><span style="margin-left: 7px; margin-right: 7px; cursor: pointer;"><i class="iconfont undefined icon-xiugai2" style="color: rgb(57, 150, 255); font-size: 18px;"><span></span></i></span></button>
                     <span class="delete" style="margin-left: 7px; margin-right: 7px; cursor: pointer;"><i class="iconfont undefined icon-del" style="color: rgb(255, 61, 58); font-size: 18px;"><span></span></i></span>                     
                    </div></td>
                  </tr>
                  <tr class="ant-table-row  ant-table-row-level-0">
                   <td class="wpColumn">
                   	<a href="blxx_weiru.jsp">3</a>
                  </td>
                   <td class="wpColumn">田荣浪</td>
                   <td class="wpColumn">男</td>
                   <td class="wpColumn">8</td>
                   <td class="wpColumn">浙江省杭州市滨江区</td>
                   <td class="wpColumn">未入</td>
                   <td class="wpColumn">2018-12-9</td>
                   <td class="wpColumn">2018-12-29</td>
                   <td class="wpColumn">
                    <div>
                     <button class="btn btn-primary" data-toggle="modal" data-target="#myModal" style="background: #FFFFFF;color: #558aff;border:0px solid #FFFFFF;padding: 0px;"><span style="margin-left: 7px; margin-right: 7px; cursor: pointer;"><i class="iconfont undefined icon-chakan1" style="color: rgb(19, 216, 149); font-size: 18px;"><span></span></i></span></button>
                    </div></td>
                  </tr>
                  <!-- react-empty: 1870 -->
                 </tbody>
                </table>
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
     <!--  <div style="position: fixed; bottom: 8px; left: 240px; font-size: 14px;">共 41 条</div> -->
     </div>
    </div>
   </div>
  
 <script src="js/menu.js"></script> <!--控制js-->
 <script src="js/hm.js"></script>
 <script src="js/index.js"></script>
 <!-- Bootstrap的所有插件都依赖于jQuery，必须在引入bootstrap.min.js前引入jQuery -->
 <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
 <!-- 压缩版的bootstrap.min.js包含了所有的Bootstrap数据API插件 -->
 <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">

                    function mbar(sobj) {
                    var docurl =sobj.options[sobj.selectedIndex].value;
                    if (docurl != "") {
                       open(docurl,'_blank');
                       sobj.selectedIndex=0;
                       sobj.blur();
                    }
                    }

</script>
<div>
	<!--<div data-reactroot="" class="ant-message">
		<span></span>
	</div>-->
</div>
</body>
</html>