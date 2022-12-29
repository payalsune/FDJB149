package com.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.HomeDao;
import com.cjc.model.Student;
import com.cjc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{

	@Autowired
	HomeDao hd;
	public void saveData(Student s) {
		hd.saveData(s);
		
	}
	public void logincheck(String un, String ps) {
		
		hd.logincheck(un, ps);
	}
	public List<Student> displayAllData() {
		List<Student>list=hd.displayAllData();
		return list;
	}
	public void deleteData(int uid) {
		hd.deleteData(uid);
		
	}
	
	public Student editData(Student s) {
		Student ss=hd.editData(s);
		return ss;
	}
	public void updateData(Student s) {
		hd.updateData(s);
		
	}

}
