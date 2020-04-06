/*package com.path.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lxy.crud.bean.Department;
import com.lxy.crud.bean.Employee;
import com.lxy.crud.dao.DepartmentMapper;
import com.lxy.crud.dao.EmployeeMapper;

*//**
 * ����dao��
 * @author Administrator
 *�Ƽ�spring��Ŀ����ʹ��spring�ĵ�Ԫ���ԣ������Զ�ע��������Ҫ�����
 *1.����springģ��İ�
 *2.����@ContextConfiguration�ƶ�spring�����ļ���λ��
 *3.ֱ��autowired����Ҫ���е����
 *//*
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-application.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper  departmentMapper;
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Autowired
	SqlSession sqlSession;
	@Test
	public void testGURD(){
		//1.����IOC����
		ApplicationContext ioc =new ClassPathXmlApplicationContext("spring-application.xml");
		//2.�������л�ȡmapper
		ioc.getBean(DepartmentMapper.class);
		
		System.out.println(departmentMapper);
		//1.���벿��
		departmentMapper.insertSelective(new Department(1,"����"));
		departmentMapper.insertSelective(new Department(2,"����"));
		
		//2.���Ա����ݣ�����Ա������
		employeeMapper.insertSelective(new Employee(1,"Jerry","M","Jerry@qq.com",1));
		employeeMapper.insertSelective(new Employee(2,"����","��","Jerry@qq.com",2));
		
		//����������Ա��
		EmployeeMapper mapper=sqlSession.getMapper(EmployeeMapper.class);
		for(int i=0;i<100;i++){
			String uid=UUID.randomUUID().toString().substring(0, 5)+i;
			mapper.insertSelective(new Employee(null,uid,"M",uid+"Jerry@qq.com",1));
		}
		
	}
}
*/