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
  
  <!-- 引入bootstrap的js,用于分页条样式 -->
 <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
 <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
 
  <!-- //js -->
  <!-- web-fonts -->
  <link href="http://fonts.googleapis.com/css?family=Enriqueta:400,700" rel="stylesheet">
  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
  <!-- //web-fonts -->
</head>
<script>
</script>
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
      <div class="container___1I4jN undefined" style="height: 89vh;">
       <div class="containerHeader___1Lcq6">
         	<div id="search" style="float:right;font-size:12px;">
         	输入医生ID或者姓名查询：<input type="text" name="searchcontent" id="searchcontentId" style="border:0.5px solid gray;height:20px;">
			<input type="button" name="submit" id="searchid" value="搜索">
			</div>
        	<div class="container">
   			 	<form action="/path/addToDoctor" method="post" class="form-horizontal" role="form" id="myForm" onsubmit="return ">
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
                        <form >
                                                                           医生ID： <input type="text"  name="did" style="width: 120px;height: 25px;border: 1px solid gainsboro;"/>
                                                                           姓名： <input type="text"  name="dname" style="width: 120px;height: 25px;border: 1px solid gainsboro;"/>
                                                                           性别：<input type="text" name="dsex" style="width: 100px;height: 25px;border: 1px solid gainsboro;"/><br />                             
                                                                           职称： <input type="text" name="djob" style="width: 120px;height: 25px;border: 1px solid gainsboro;"/>
                                                                           科室： <input type="text"  name="ddepartment" style="width: 120px;height: 25px;border: 1px solid gainsboro;"/>
                                             <br />
                                                                           坐诊时间： <input type="date"  name="zuozhenshijian" style="width: 150px;height: 30px;border: 1px solid gainsboro;"/>   
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
                  <col style="width: 250px; min-width: 250px;" />
                 </colgroup>
                 <thead class="ant-table-thead">
                  <tr>
                   <th class="wpColumn"><span>医生ID</span></th>
                   <th class="wpColumn"><span>姓名</span></th>
                   <th class="wpColumn"><span>性别</span></th>
                   <th class="wpColumn"><span>职称</span></th>
                   <th class="wpColumn"><span>科室</span></th>
                   <th class="wpColumn"><span>坐诊时间</span></th>
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
                  <col style="width: 250px; min-width: 250px;" />
                 </colgroup>
                 <tbody class="ant-table-tbody" id="databody">
                  <!-- react-empty: 1870 -->
                 </tbody>
                </table>
               </div>
               
  				 <!-- 显示分页信息 -->
				<div class="row">
				<!-- 分页文字信息 -->
				<div class="col-md-6" id="page_info_area">
			
				</div>
				<!-- 分页条 -->
				<div class="col-md-6" id="page_nav_area">
   
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

//查询--主load方法

$(window).load(function() {

	to_page(1);
});

//跳转到第几页
function to_page(pn){
	getAll(pn)
		} 

function getAll(pn){
	$.ajax({
	
		url:"http://localhost:8080/path/getDoctor",
		type:"get",
		data:"pn="+pn,
		success:function(result){
			 $("#databody").empty();
			 var emps=result.extend.pageInfo.list;
			 $.each(emps,function(index,item){
			 //alert(item.dname+" "+item.did);
			 	var s="<tr class=\"ant-table-row  ant-table-row-level-0\">"+
                  " <td class=\"wpColumn\">"+item.did+"</td>"+
                  " <td class=\"wpColumn\">"+item.dname+"</td>"+
                  " <td class=\"wpColumn\">"+item.dsex+"</td>"+
                  " <td class=\"wpColumn\">"+item.djob+"</td>"+
                  " <td class=\"wpColumn\">"+item.ddepartment+"</td>"+
                  " <td class=\"wpColumn\">"+item.zuozhenshijian+"</td>"+
                  " <td class=\"wpColumn\">"+
                  "  <div>"+
                  "   <button class=\"btn btn-primary\" id=\"look-data\" look-id="+item.did+" data-toggle=\"modal\" data-target=\"#myModal\" style=\"background: #FFFFFF;color: #558aff;border:0px solid #FFFFFF;padding: 0px;\"><span style=\"margin-left: 7px; margin-right: 7px; cursor: pointer;\"><i class=\"iconfont undefined icon-chakan1\" style=\"color: rgb(19, 216, 149); font-size: 18px;\"><span></span></i></span></button>"+
                  "  </div></td>"+
                "  </tr>";
			 $("#databody").append(s);
			 
			 });
			 //调用函数显示分页条
			 build_page_info(result);
			//解析显示分页条
			build_page_nav(result);
		}
		});
	
}

	//解析显示分页信息
		function build_page_info(result){
			$("#page_info_area").empty();
			$("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,共"+
							result.extend.pageInfo.pages+"页,总共"+
							result.extend.pageInfo.total+"条记录");
							totalRecord=result.extend.pageInfo.total;
		}
		//解析显示分页条,点击时有动作
		function build_page_nav(result){
			$("#page_nav_area").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","ysxx.jsp"));
			var perPageLi =  $("<li></li>").append($("<a></a>").append("&laquo;"));
			if(result.extend.pageInfo.hasPreviousPage==false){
				firstPageLi.addClass("disabled");
				perPageLi.addClass("disabled");
			}else{
				//为元素添加点击事件
				firstPageLi.click(function(){
					to_page(1);
				});
				perPageLi.click(function(){
					to_page(result.extend.pageInfo.pageNum-1);
				});
			}
			var nextPageLi =  $("<li></li>").append($("<a></a>").append("&raquo;"));
			var lastPageLi =  $("<li></li>").append($("<a></a>").append("末页"));
			if(result.extend.pageInfo.hasNextPage==false){
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			}else{
				//为元素添加点击事件
				nextPageLi.click(function(){
					to_page(result.extend.pageInfo.pageNum+1);
			});
				lastPageLi.click(function(){
					to_page(result.extend.pageInfo.pages);
			});
			}
			ul.append(firstPageLi).append(perPageLi);
			$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if(result.extend.pageInfo.pageNum==item){
					numLi.addClass("active");
				}
				numLi.click(function(){
					to_page(item);
				});
				ul.append(numLi);
			});
			ul.append(nextPageLi).append(lastPageLi);
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav_area");
		}
	
//提交时校验
 $("form").submit(function () {
   var myname=$("#modal-data > input[type=\"text\"]:nth-child(1)").attr("myname");
   if(myname=="look"){
		alert("只能查看不能修改");
			return false;
		
	}
 });

//查看数据
$(document).on("click","#look-data",function(){
	var id=$(this).attr("look-id");
	//查询出要修改的数据
	$.ajax({
		url:"http://localhost:8080/path/getEveryData/"+id,
    		type:"get",
    		success:function(result){
    		 var item=result.extend.pageInfo.list;
    		 alert(item[0].did);
     		document.getElementsByName("did")[0].value = item[0].did;
     		document.getElementsByName("dname")[0].value = item[0].dname;
    		document.getElementsByName("dsex")[0].value = item[0].dsex;
    		document.getElementsByName("djob")[0].value = item[0].djob;
    		document.getElementsByName("ddepartment")[0].value = item[0].ddepartment;
    		document.getElementsByName("zuozhenshijian")[0].value = item[0].zuozhenshijian;
    		$("#modal-data > input[type=\"text\"]:nth-child(1)").attr("myname","look");
    		
    		}
	    });
	});

  //查询
  $(document).on("click","#searchid",function(){
	  //获取输入框的值
	  var inputvalue = document.getElementsByName("searchcontent")[0].value;
	    	$.ajax({
	    		url:"http://localhost:8080/path/searchcontent/"+inputvalue,
	    		type:"GET",
	    		success:function(result){
	    			 $("#databody").empty();
	    			 var emps=result.extend.pageInfo.list;
	    			 $.each(emps,function(index,item){
	    			 	var s="<tr class=\"ant-table-row  ant-table-row-level-0\">"+
	                      " <td class=\"wpColumn\">"+item.did+"</td>"+
	                      " <td class=\"wpColumn\">"+item.dname+"</td>"+
	                      " <td class=\"wpColumn\">"+item.dsex+"</td>"+
	                      " <td class=\"wpColumn\">"+item.djob+"</td>"+
	                      " <td class=\"wpColumn\">"+item.ddepartment+"</td>"+
	                      " <td class=\"wpColumn\">"+item.zuozhenshijian+"</td>"+
	                      " <td class=\"wpColumn\">"+
	                      "  <div>"+
	                      "   <button class=\"btn btn-primary\" id=\"look-data\" look-id="+item.did+" data-toggle=\"modal\" data-target=\"#myModal\" style=\"background: #FFFFFF;color: #558aff;border:0px solid #FFFFFF;padding: 0px;\"><span style=\"margin-left: 7px; margin-right: 7px; cursor: pointer;\"><i class=\"iconfont undefined icon-chakan1\" style=\"color: rgb(19, 216, 149); font-size: 18px;\"><span></span></i></span></button>"+
	                      "  </div></td>"+
	                    "  </tr>";
	    			 $("#databody").append(s);
	    			 
	    			 });
	    			
	    		}
	    	
	    	});
	        
	  });
  
</script>

<div>
</div>
</body>
</html>