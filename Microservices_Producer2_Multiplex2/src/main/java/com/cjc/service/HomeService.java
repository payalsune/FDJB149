package com.cjc.service;

import com.cjc.model.Shows;

public interface HomeService {

	void saveData(Shows s);

	Iterable<Shows> getAllData();

	void deleteShowData(int id);
}
