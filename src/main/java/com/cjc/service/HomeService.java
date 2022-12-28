package com.cjc.service;


import java.util.List;

import com.cjc.model.Student;

public interface HomeService {

	void saveData(Student s);

	void logincheck(String un, String ps);

	List<Student> displayAllData();

	void deleteData(int uid);

	

	Student editData(Student s);

	void updateData(Student s);

}
