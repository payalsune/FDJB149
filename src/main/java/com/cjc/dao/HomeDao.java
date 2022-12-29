package com.cjc.dao;

import java.util.List;

import com.cjc.model.Student;

public interface HomeDao {

	void saveData(Student s);
	void logincheck(String un, String ps);
	List<Student> displayAllData();
	void deleteData(int uid);
	Student editData(Student s);

	void updateData(Student s);


}
