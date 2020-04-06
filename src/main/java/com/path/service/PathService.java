package com.path.service;


import java.util.List;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.path.bean.CaseMedicalnew;
import com.path.bean.Casemedical;
import com.path.bean.Causenew;
import com.path.bean.Chujingnew;
import com.path.bean.Departfeenew;
import com.path.bean.Doctor;
import com.path.bean.Gzltj;
import com.path.bean.Hospfeenew;
import com.path.bean.Ljtj;
import com.path.bean.Path;
import com.path.bean.Pathcountnew;
import com.path.bean.Pathtimeoutnew;
import com.path.bean.Patient;
import com.path.bean.Rujing;
import com.path.bean.Rujingnew;
import com.path.bean.Sinpathfeenew;
import com.path.dao.DoctorMapper;
import com.path.dao.HospfeeMapper;
import com.path.dao.PathMapper;
import com.path.dao.PathcountMapper;
import com.path.dao.PathtimeoutMapper;
import com.path.dao.PatientMapper;
import com.path.dao.RujingMapper;
import com.path.dao.SinpathfeeMapper;
import com.path.dao.CasemedicalMapper;
import com.path.dao.CauseMapper;
import com.path.dao.ChujingMapper;
import com.path.dao.DepartfeeMapper;


@Service
public class PathService {
	

	@Autowired
	private DoctorMapper doctorMapper;
	
	@Autowired
	private PatientMapper patientMapper;
	
	@Autowired
	private PathMapper pathMapper;
	
	@Autowired
	private RujingMapper rujingMapper;
	
	@Autowired
	private ChujingMapper chujingMapper;
	
	@Autowired
	private PathcountMapper pathcountMapper;
	
	@Autowired
	private PathtimeoutMapper pathtimeoutMapper;
	
	@Autowired
	private CasemedicalMapper casemedicalMapper;
	
	@Autowired
	private SinpathfeeMapper sinpathfeeMapper;
	
	@Autowired
	private DepartfeeMapper departfeeMapper;
	
	@Autowired
	private HospfeeMapper hospfeeMapper;
	
	@Autowired
	private CauseMapper causeMapper;
	
	public List<Causenew> getcause(){
		return causeMapper.getcause();
	}
	
	public Causenew checkCause(Causenew causenew){
		return causeMapper.checkCause(causenew);
	}
	
	public List<Causenew> getEveryCause(Integer id){
		return causeMapper.selectByKey(id);
	}
	
	public List<Pathtimeoutnew> getljchaoshi(){
		return pathtimeoutMapper.getljchaoshi();
	}
	
	public Pathtimeoutnew checkLjchaoshi(Pathtimeoutnew pathtimeoutnew){
		return pathtimeoutMapper.checkLjchaoshi(pathtimeoutnew);
	}
	
	public List<Pathtimeoutnew> getEveryLjchaoshi(Integer id){
		return pathtimeoutMapper.selectByKey(id);
	}
	
	public List<Pathcountnew> getpathcountnew(){
		return pathcountMapper.getpathcountnew();
	}
	
	public Pathcountnew checkPathcountnew(Pathcountnew pathcountnew){
		return pathcountMapper.checkpathcountnew(pathcountnew);
	}
	
	public List<Pathcountnew> getEveryPathcountnew(Integer id){
		return pathcountMapper.selectByKey(id);
	}
	
	public List<Rujingnew> getrujingnew(){
		return rujingMapper.getrujingnew();
	}
	
	public List<Rujingnew> getEveryRujingnew(Integer id){
		return rujingMapper.selectByKey(id);
	}
	
	public void updateRujingnew(Rujing rujing){
		rujingMapper.updateByPrimaryKey(rujing);
	}
	
	public void saveRujingnew(Rujing rujing){
		rujingMapper.insert(rujing);
	}
	
	public Rujingnew checkRujingnew(Rujingnew rujing){
		return rujingMapper.checkRujingnew(rujing);
	}
	
	public List<Chujingnew> getchujingnew(){
		return chujingMapper.getchujingnew();
	}
	
	public List<Chujingnew> getEveryChujing(Integer id) {
		return chujingMapper.selectByKey(id);
	}
	
	public Chujingnew checkChujingnew(Chujingnew chujingnew){
		return chujingMapper.checkChujingnew(chujingnew);
	}
	
	public void updateDoctor(Doctor doctor){
		doctorMapper.updateByPrimaryKey(doctor);
	}
	
	public void dellujing(Integer id){
		pathMapper.deleteByPrimaryKey(id);
	}
	
	public List<Path> getlujing(){
		return pathMapper.selectAlllujing();
	}
	
	public List<Path> getEveryPath(Integer id){
		return pathMapper.selectByKey(id);
	}
	
	public void updatePath(Path path){
		pathMapper.updateByPrimaryKey(path);
	}
	
	public void savePath(Path path){
		pathMapper.insert(path);
	}
	
	
	public void delpatient(Integer id){
		patientMapper.deleteByPrimaryKey(id);
	}
	
	public List<Patient> getAllPatient(){
		return	 patientMapper.selectByPrimaryKey();
		}
	
	public List<Patient> getEveryPatient(Integer id){
		return patientMapper.selectByKey(id);
	}
	
	public void savePatient(Patient patient){
		patientMapper.insert(patient);
	}
	
	public Patient checkPatient(Patient patient){
		return patientMapper.checkPatient(patient);
	}
	
	public void updatePatient(Patient patient){
		patientMapper.updateByPrimaryKey(patient);
	}
	
	public Path checkPath(Path path){
		return pathMapper.checkPath(path);
	}
	
	//验证登录信息
		public Doctor checkLogin(Doctor doctor){
			return doctorMapper.selectByuser(doctor);
		}
		
		public void saveDoctor(Doctor doctor){
			doctorMapper.insert(doctor);
		}
		
		public List<Doctor> getAllDoctor(){
		return	 doctorMapper.selectByPrimaryKey(null);
		}
		
		public void delDoctor(Integer id){
			doctorMapper.deleteByPrimaryKey(id);
		}
		
		public List<Doctor> getEveryData(Integer id){
			return doctorMapper.selectByKey(id);
		}
		
		public Doctor checkDoctor(Doctor doctor){
			
			return doctorMapper.checkDoctor(doctor);
			
		}

		public List<Doctor> getInputValue(String inputvalue) {
			return doctorMapper.selectByInputValue(inputvalue);
		}
		
		public List<Patient> getInputValuePa(String inputvalue) {
			return patientMapper.selectByInputValuePa(inputvalue);
		}
		
		public List<Path> getInputValuePath(String inputvalue) {
			return pathMapper.selectByInputValuePath(inputvalue);
		}
		
		public List<Rujingnew> getInputValueRuj(String inputvalue) {
			return rujingMapper.selectByInputValueRuj(inputvalue);
		}
		
		public List<Chujingnew> getInputValueChuj(String inputvalue) {
			return chujingMapper.selectByInputValueChuj(inputvalue);
		}
		
		public List<Pathcountnew> getInputValuePac(String inputvalue) {
			return pathcountMapper.selectByInputValuePac(inputvalue);
		}
		
		public List<Pathtimeoutnew> getInputValuePat(String inputvalue) {
			return pathtimeoutMapper.selectByInputValuePat(inputvalue);
		}
		
		public List<Causenew> getInputValueCau(String inputvalue) {
			return causeMapper.selectByInputValueCau(inputvalue);
		}
		
		public List<CaseMedicalnew> getMedicalSimple(Integer mid){
			return casemedicalMapper.getMedicalSimple(mid);
		}
		
		public List<Sinpathfeenew> getSinPathFee(Integer mid){
			return sinpathfeeMapper.getSinPathFee(mid);
		}
		
		public List<Departfeenew> getDepartmentFee(Integer mid){
			return departfeeMapper.getDepartmentFee(mid);
		}
		
		public List<Hospfeenew> getHospFee(Integer mid){
			return hospfeeMapper.getHospFee(mid);
		}
		
		public List<Ljtj> getlujingtongji(String newinputvalue){
			return casemedicalMapper.getlujingtongji(newinputvalue);
		}

		public List<Gzltj> getgongzuoliang(String newinputvalue) {
			// TODO Auto-generated method stub
			return casemedicalMapper.getgongzuoliang(newinputvalue);
		}
		
		public List<Pathcountnew> getfeiyong(String newinputvalue) {
			// TODO Auto-generated method stub
			return pathcountMapper.getfeiyong(newinputvalue);
		}
		

}
