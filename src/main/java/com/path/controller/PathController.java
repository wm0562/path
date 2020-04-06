package com.path.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.print.Doc;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.path.bean.Doctor;
import com.path.bean.Gzltj;
import com.path.bean.Hospfeenew;
import com.path.bean.Ljtj;
import com.path.bean.Msg;
import com.path.bean.Path;
import com.path.bean.Pathcountnew;
import com.path.bean.Pathtimeoutnew;
import com.path.bean.Patient;
import com.path.bean.Rujingnew;
import com.path.bean.Sinpathfeenew;
import com.path.bean.CaseMedicalnew;
import com.path.bean.Casemedical;
import com.path.bean.Causenew;
import com.path.bean.Chujingnew;
import com.path.bean.Departfeenew;
import com.path.service.PathService;

@Controller
public class PathController {
	
	@Resource
	private PathService pathService;
	
	
	
	
	/*变异原因*/
	//getcause
	@RequestMapping("/getcause")
	@ResponseBody
	public Msg getcause(@RequestParam(value="pn",defaultValue="1")Integer pn){
			//引入PageHelper分页插件
			//在查询之前只需要调用,传入页码，以及每页的大小
			PageHelper.startPage(pn,10);
			//startPage后面紧跟的这个查询就是一个分页查询
			List<Causenew> emps=pathService.getcause();
		
			//将PageInfo交给页面，查询出的数据和要显示的页数
			PageInfo page = new PageInfo(emps,10);
			return Msg.success().add("pageInfo", page);
		
		}

	//查询出变异原因数据
			@RequestMapping(value="/getEveryCause/{id}",method=RequestMethod.GET)
			@ResponseBody
			public Msg getEveryCause(@PathVariable("id")Integer id){
				List<Causenew> r = pathService.getEveryCause(id);
				PageInfo page = new PageInfo(r,1);
				return Msg.success().add("pageInfo", page);
			}
			
			//查看路径变异原因信息
				@RequestMapping("/checkCause")
				@ResponseBody
				public void checkCause(@Valid Causenew causenew,javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{
					//保存前先校验一下数据是否存在
					Causenew checkCau = pathService.checkCause(causenew);
					response.sendRedirect("cause.jsp");
					
				}
				//路径变异原因信息查询
				@RequestMapping(value="/searchcontentCau/{inputvalue}",method=RequestMethod.GET)
				@ResponseBody
				public Msg getEveryCause(@PathVariable("inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
					String newinputvalue=new String(inputvalue.getBytes("iso-8859-1"),"utf-8");
					List<Causenew> dValue = pathService.getInputValueCau(newinputvalue);
					PageInfo page = new PageInfo(dValue,1);
					return Msg.success().add("pageInfo", page);
				}
	
	/*路径超时*/
	//getljchaoshi
	@RequestMapping("/getljchaoshi")
	@ResponseBody
	public Msg getljchaoshi(@RequestParam(value="pn",defaultValue="1")Integer pn){
			//引入PageHelper分页插件
			//在查询之前只需要调用,传入页码，以及每页的大小
			PageHelper.startPage(pn,10);
			//startPage后面紧跟的这个查询就是一个分页查询
			List<Pathtimeoutnew> emps=pathService.getljchaoshi();
		
			//将PageInfo交给页面，查询出的数据和要显示的页数
			PageInfo page = new PageInfo(emps,10);
			return Msg.success().add("pageInfo", page);
		
		}

	//查询出要修改的路径超时数据
			@RequestMapping(value="/getEveryLjchaoshi/{id}",method=RequestMethod.GET)
			@ResponseBody
			public Msg getEveryLjchaoshi(@PathVariable("id")Integer id){
				List<Pathtimeoutnew> r = pathService.getEveryLjchaoshi(id);
				PageInfo page = new PageInfo(r,1);
				return Msg.success().add("pageInfo", page);
			}
			
			//查看路径超时信息
				@RequestMapping("/checkLjchaoshi")
				@ResponseBody
				public void checkLjchaoshi(@Valid Pathtimeoutnew pathtimeoutnew,javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{
					//保存前先校验一下数据是否存在
					Pathtimeoutnew checkTime = pathService.checkLjchaoshi(pathtimeoutnew);
					response.sendRedirect("lujingchaoshi.jsp");
					
				}
				//路径超时信息查询
				@RequestMapping(value="/searchcontentPat/{inputvalue}",method=RequestMethod.GET)
				@ResponseBody
				public Msg getEveryLjchaoshi(@PathVariable("inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
					String newinputvalue=new String(inputvalue.getBytes("iso-8859-1"),"utf-8");
					List<Pathtimeoutnew> dValue = pathService.getInputValuePat(newinputvalue);
					PageInfo page = new PageInfo(dValue,1);
					return Msg.success().add("pageInfo", page);
				}
				
	
	/*路径费用*/
	//getpathcountnew
		@RequestMapping("/getpathcountnew")
		@ResponseBody
		public Msg getpathcountnew(@RequestParam(value="pn",defaultValue="1")Integer pn){
				//引入PageHelper分页插件
				//在查询之前只需要调用,传入页码，以及每页的大小
				PageHelper.startPage(pn,10);
				//startPage后面紧跟的这个查询就是一个分页查询
				List<Pathcountnew> emps=pathService.getpathcountnew();
			
				//将PageInfo交给页面，查询出的数据和要显示的页数
				PageInfo page = new PageInfo(emps,10);
				return Msg.success().add("pageInfo", page);
			
			}
	
		//查询出要修改的路径费用数据
				@RequestMapping(value="/getEveryPathcountnew/{id}",method=RequestMethod.GET)
				@ResponseBody
				public Msg getEveryPathcountnew(@PathVariable("id")Integer id){
					List<Pathcountnew> r = pathService.getEveryPathcountnew(id);
					PageInfo page = new PageInfo(r,1);
					return Msg.success().add("pageInfo", page);
				}
				
				//查看路径费用信息
					@RequestMapping("/checkPathcountnew")
					@ResponseBody
					public void checkPathcountnew(@Valid Pathcountnew pathcountnew,javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{
						//保存前先校验一下数据是否存在
						Pathcountnew checkCount = pathService.checkPathcountnew(pathcountnew);
						response.sendRedirect("lujingfeiyong.jsp");
						
					}
					//路径费用信息查询
					@RequestMapping(value="/searchcontentPac/{inputvalue}",method=RequestMethod.GET)
					@ResponseBody
					public Msg getEveryPathcountnew(@PathVariable("inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
						String newinputvalue=new String(inputvalue.getBytes("iso-8859-1"),"utf-8");
						List<Pathcountnew> dValue = pathService.getInputValuePac(newinputvalue);
						PageInfo page = new PageInfo(dValue,1);
						return Msg.success().add("pageInfo", page);
					}
	/*出径病人*/
	//getchujingnew
		@RequestMapping("/getchujingnew")
		@ResponseBody
		public Msg getchujingnew(@RequestParam(value="pn",defaultValue="1")Integer pn){
				//引入PageHelper分页插件
				//在查询之前只需要调用,传入页码，以及每页的大小
				PageHelper.startPage(pn,10);
				//startPage后面紧跟的这个查询就是一个分页查询
				List<Chujingnew> emps=pathService.getchujingnew();
				
				//将PageInfo交给页面，查询出的数据和要显示的页数
				PageInfo page = new PageInfo(emps,10);
				return Msg.success().add("pageInfo", page);
				
			}
		
		//查询出要修改的出径病人数据
				@RequestMapping(value="/getEveryChujing/{id}",method=RequestMethod.GET)
				@ResponseBody
				public Msg getEveryChujing(@PathVariable("id")Integer id){
					List<Chujingnew> r = pathService.getEveryChujing(id);
					PageInfo page = new PageInfo(r,1);
					return Msg.success().add("pageInfo", page);
				}
				
				//查看出径病人信息
					@RequestMapping("/checkChujingnew")
					@ResponseBody
					public void checkChujingnew(@Valid Chujingnew chujingnew,javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{
						//保存前先校验一下数据是否存在
						Chujingnew checkCj = pathService.checkChujingnew(chujingnew);
						response.sendRedirect("chujingbingren.jsp");
						
					}
				//出径病人信息查询
				@RequestMapping(value="/searchcontentChuj/{inputvalue}",method=RequestMethod.GET)
				@ResponseBody
				public Msg getEveryChujing(@PathVariable("inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
					String newinputvalue=new String(inputvalue.getBytes("iso-8859-1"),"utf-8");
					List<Chujingnew> dValue = pathService.getInputValueChuj(newinputvalue);
					PageInfo page = new PageInfo(dValue,1);
					return Msg.success().add("pageInfo", page);
				}
	
	/*入径病人*/
	//getrujingnew
	@RequestMapping("/getrujingnew")
	@ResponseBody
	public Msg getrujingnew(@RequestParam(value="pn",defaultValue="1")Integer pn){
			//引入PageHelper分页插件
			//在查询之前只需要调用,传入页码，以及每页的大小
			PageHelper.startPage(pn,10);
			//startPage后面紧跟的这个查询就是一个分页查询
			List<Rujingnew> emps=pathService.getrujingnew();
			
			//将PageInfo交给页面，查询出的数据和要显示的页数
			PageInfo page = new PageInfo(emps,10);
			return Msg.success().add("pageInfo", page);
			
		}
	
	//查询出要修改的入径病人数据
		@RequestMapping(value="/getEveryRujingnew/{id}",method=RequestMethod.GET)
		@ResponseBody
		public Msg getEveryRujing(@PathVariable("id")Integer id){
			List<Rujingnew> r = pathService.getEveryRujingnew(id);
			PageInfo page = new PageInfo(r,1);
			return Msg.success().add("pageInfo", page);
		}
		
		//查看入径病人信息
			@RequestMapping("/addToRujing")
			@ResponseBody
			public void addToRujingnew(@Valid Rujingnew rujingnew,javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{
				//保存前先校验一下数据是否存在
				Rujingnew checkRuj = pathService.checkRujingnew(rujingnew);
				response.sendRedirect("rujingbingren.jsp");
				
			}
			//入径病人信息查询
			@RequestMapping(value="/searchcontentRuj/{inputvalue}",method=RequestMethod.GET)
			@ResponseBody
			public Msg getEveryRujingnew(@PathVariable("inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
				String newinputvalue=new String(inputvalue.getBytes("iso-8859-1"),"utf-8");
				List<Rujingnew> dValue = pathService.getInputValueRuj(newinputvalue);
				PageInfo page = new PageInfo(dValue,1);
				return Msg.success().add("pageInfo", page);
			}
	
     /* 路径信息	*/
	//删除路径 dellujing
	@RequestMapping(value="/dellujing/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg dellujing(@PathVariable("id")Integer id){
		pathService.dellujing(id);
		return null;
	}
	
	//获取路径信息
	@RequestMapping("/getlujing")
	@ResponseBody
	public Msg getlujing(@RequestParam(value="pn",defaultValue="1")Integer pn){
			//引入PageHelper分页插件
			//在查询之前只需要调用,传入页码，以及每页的大小
			PageHelper.startPage(pn,10);
			//startPage后面紧跟的这个查询就是一个分页查询
			List<Path> emps=pathService.getlujing();
			
			//将PageInfo交给页面，查询出的数据和要显示的页数
			PageInfo page = new PageInfo(emps,10);
			return Msg.success().add("pageInfo", page);
			
		}
	
	//查询出要修改的路径数据
	@RequestMapping(value="/getEveryPath/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getEveryPath(@PathVariable("id")Integer id){
		List<Path> p = pathService.getEveryPath(id);
		PageInfo page = new PageInfo(p,1);
		return Msg.success().add("pageInfo", page);
	}
	
	//新增路径信息
		@RequestMapping("/addToPath")
		@ResponseBody
		public void addToPath(@Valid Path path,javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{
			//保存前先校验一下数据是否存在
			Path checkPat = pathService.checkPath(path);
			if(checkPat==null){
				pathService.savePath(path);
			}else{
				pathService.updatePath(path);
			}
			response.sendRedirect("lujing.jsp");
			
		}
		//路径信息查询
				@RequestMapping(value="/searchcontentPath/{inputvalue}",method=RequestMethod.GET)
				@ResponseBody
				public Msg getEveryPath(@PathVariable("inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
					String newinputvalue=new String(inputvalue.getBytes("iso-8859-1"),"utf-8");
					List<Path> dValue = pathService.getInputValuePath(newinputvalue);
					PageInfo page = new PageInfo(dValue,1);
					return Msg.success().add("pageInfo", page);
				}
	
	
    /*	病人信息*/
	//删除病人信息 delpatient
	@RequestMapping(value="/delpatient/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg delpatient(@PathVariable("id")Integer id){
		pathService.delpatient(id);
		return null;
	}
	
	//查询出要修改的病人数据
	@RequestMapping(value="/getEveryPatient/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getEveryPatient(@PathVariable("id")Integer id){
		List<Patient> p = pathService.getEveryPatient(id);
		PageInfo page = new PageInfo(p,1);
		return Msg.success().add("pageInfo", page);
	}
	
	//查询出所有的病人信息
	@RequestMapping("/getPatient")
	@ResponseBody
	public Msg getPatient(@RequestParam(value="pn",defaultValue="1")Integer pn){
			//引入PageHelper分页插件
			//在查询之前只需要调用,传入页码，以及每页的大小
			PageHelper.startPage(pn,10);
			//startPage后面紧跟的这个查询就是一个分页查询
			List<Patient> emps=pathService.getAllPatient();
			
			//将PageInfo交给页面，查询出的数据和要显示的页数
			PageInfo page = new PageInfo(emps,10);
			return Msg.success().add("pageInfo", page);
			
		}
	
	//新增病人信息
	@RequestMapping("/addToPatient")
	@ResponseBody
	public void addToPatient(@Valid Patient patient,javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{
		//保存前先校验一下数据是否存在
		Patient checkPat = pathService.checkPatient(patient);
		if(checkPat==null){
			pathService.savePatient(patient);
		}else{
			pathService.updatePatient(patient);
		}
		response.sendRedirect("brxx.jsp");
		
	}
	//病人信息查询
		@RequestMapping(value="/searchcontentPa/{inputvalue}",method=RequestMethod.GET)
		@ResponseBody
		public Msg getEveryPatient(@PathVariable("inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
			String newinputvalue=new String(inputvalue.getBytes("iso-8859-1"),"utf-8");
			List<Patient> dValue = pathService.getInputValuePa(newinputvalue);
			PageInfo page = new PageInfo(dValue,1);
			return Msg.success().add("pageInfo", page);
		}
	
	/*医生信息*/
	//查询出要修改的医生数据
	@RequestMapping(value="/getEveryData/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getEveryData(@PathVariable("id")Integer id){
		List<Doctor> d = pathService.getEveryData(id);
		PageInfo page = new PageInfo(d,1);
		return Msg.success().add("pageInfo", page);
	}
	
	//删除医生信息
	@RequestMapping(value="/delDoctor/{id}",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg delDoctor(@PathVariable("id")Integer id){
		pathService.delDoctor(id);
		return null;
	}
	
	//查询出所有的医生信息
	@RequestMapping("/getDoctor")
	@ResponseBody
	public Msg getDoctor(@RequestParam(value="pn",defaultValue="1")Integer pn){
			//引入PageHelper分页插件
			//在查询之前只需要调用,传入页码，以及每页的大小
			PageHelper.startPage(pn,10);
			//startPage后面紧跟的这个查询就是一个分页查询
			List<Doctor> emps=pathService.getAllDoctor();
			
			//将PageInfo交给页面，查询出的数据和要显示的页数
			PageInfo page = new PageInfo(emps,10);
			return Msg.success().add("pageInfo", page);
			
		}
	
	//新增医生信息
	
	@RequestMapping("/addToDoctor")
	@ResponseBody
	public void addToDoctor(@Valid Doctor doctor,javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{
		//保存前先校验一下数据是否存在
		Doctor checkDoc = pathService.checkDoctor(doctor);
		if(checkDoc==null){
			pathService.saveDoctor(doctor);
		}else{
			pathService.updateDoctor(doctor);
		}
		response.sendRedirect("ysxx.jsp");
		
	}
	
	//医生信息查询
	@RequestMapping(value="/searchcontent/{inputvalue}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getEveryData(@PathVariable("inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
		String newinputvalue=new String(inputvalue.getBytes("iso-8859-1"),"utf-8");
		List<Doctor> dValue = pathService.getInputValue(newinputvalue);
		PageInfo page = new PageInfo(dValue,1);
		return Msg.success().add("pageInfo", page);
	}
		
	
	
	

	//* 登录
	 
	@RequestMapping("/log")
	public void saveLogin(javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{
		   String strName = request.getParameter("username");
	       strName=new String(strName.getBytes("iso-8859-1"),"utf-8");
	       String strPwd = request.getParameter("password");
	       strPwd=new String(strPwd.getBytes("iso-8859-1"),"utf-8");
	       //验证用户名和密码是否正确
	       Doctor doctor=new Doctor();
	       doctor.setDname(strName);
	       doctor.setDpwd(strPwd);
	       Doctor re=pathService.checkLogin(doctor);
		   javax.servlet.http.HttpSession session=request.getSession();
	       if(re!=null){
	   		session.setAttribute("user", strName);
			response.sendRedirect("ysxx.jsp");
	       }else{
			   response.sendRedirect("login.jsp");
	       }
	}
	
	//注销
	@RequestMapping("/logout")
	public void loginoutServlet(javax.servlet.http.HttpServletRequest request,javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException{

	javax.servlet.http.HttpSession session = request.getSession();
	session.invalidate();
	response.sendRedirect("login.jsp");
	}
	
	//病例信息查询
	@RequestMapping("/getMedicalSimple")
	@ResponseBody
	public Msg getMedicalSimple(@RequestParam(value="mid",defaultValue="1")Integer mid){
			//引入PageHelper分页插件
			//在查询之前只需要调用,传入页码，以及每页的大小
			PageHelper.startPage(mid,1);
			//startPage后面紧跟的这个查询就是一个分页查询
			List<CaseMedicalnew> msimple=pathService.getMedicalSimple(mid);
		
			//将PageInfo交给页面，查询出的数据和要显示的页数
			PageInfo page = new PageInfo(msimple,1);
			return Msg.success().add("pageInfo", page);
		
		}
	//单路径费用信息查询
		@RequestMapping("/getSinPathFee")
		@ResponseBody
		public Msg getSinPathFee(@RequestParam(value="mid",defaultValue="1")Integer mid){
				//引入PageHelper分页插件
				//在查询之前只需要调用,传入页码，以及每页的大小
				PageHelper.startPage(mid,1);
				//startPage后面紧跟的这个查询就是一个分页查询
				List<Sinpathfeenew> msimple=pathService.getSinPathFee(mid);
			
				//将PageInfo交给页面，查询出的数据和要显示的页数
				PageInfo page = new PageInfo(msimple,1);
				return Msg.success().add("pageInfo", page);
			}
		//科室费用信息查询
		@RequestMapping("/getDepartmentFee")
		@ResponseBody
		public Msg getDepartmentFee(@RequestParam(value="mid",defaultValue="1")Integer mid){
				//引入PageHelper分页插件
				//在查询之前只需要调用,传入页码，以及每页的大小
				PageHelper.startPage(mid,1);
				//startPage后面紧跟的这个查询就是一个分页查询
				List<Departfeenew> msimple=pathService.getDepartmentFee(mid);
			
				//将PageInfo交给页面，查询出的数据和要显示的页数
				PageInfo page = new PageInfo(msimple,1);
				return Msg.success().add("pageInfo", page);
			}
		//医院费用信息查询
		@RequestMapping("/getHospFee")
		@ResponseBody
		public Msg getHospFee(@RequestParam(value="mid",defaultValue="1")Integer mid){
				//引入PageHelper分页插件
				//在查询之前只需要调用,传入页码，以及每页的大小
				PageHelper.startPage(mid,1);
				//startPage后面紧跟的这个查询就是一个分页查询
				List<Hospfeenew> msimple=pathService.getHospFee(mid);
			
				//将PageInfo交给页面，查询出的数据和要显示的页数
				PageInfo page = new PageInfo(msimple,1);
				return Msg.success().add("pageInfo", page);
			}
	//路径统计查询
		@RequestMapping(value="/getlujingtongji",method=RequestMethod.GET)
		@ResponseBody
		public Msg getlujingtongji(@RequestParam(value="inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
			
				//在查询之前只需要调用,传入页码
				List<Ljtj> msimple=pathService.getlujingtongji(inputvalue);

				//将PageInfo交给页面，查询出的数据和要显示的页数
				PageInfo page = new PageInfo(msimple,1);
				return Msg.success().add("pageInfo", page);
			
			}
		//工作量查询
		@RequestMapping(value="/getgongzuoliang",method=RequestMethod.GET)
		@ResponseBody
		public Msg getgongzuoliang(@RequestParam(value="inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
				String newinputvalue=new String(inputvalue.getBytes("iso-8859-1"),"utf-8");
			
				//在查询之前只需要调用,传入页码
				List<Gzltj> msimple=pathService.getgongzuoliang(newinputvalue);

				//将PageInfo交给页面，查询出的数据和要显示的页数
				PageInfo page = new PageInfo(msimple,1);
				return Msg.success().add("pageInfo", page);
			
			}
		//费用统计查询
				@RequestMapping(value="/getfeiyong",method=RequestMethod.GET)
				@ResponseBody
				public Msg getfeiyong(@RequestParam(value="inputvalue")String inputvalue) throws javax.servlet.ServletException, IOException{
						String newinputvalue=new String(inputvalue.getBytes("iso-8859-1"),"utf-8");
					
						//在查询之前只需要调用,传入页码
						List<Pathcountnew> msimple=pathService.getfeiyong(inputvalue);

						//将PageInfo交给页面，查询出的数据和要显示的页数
						PageInfo page = new PageInfo(msimple,1);
						return Msg.success().add("pageInfo", page);
					}
		
}
