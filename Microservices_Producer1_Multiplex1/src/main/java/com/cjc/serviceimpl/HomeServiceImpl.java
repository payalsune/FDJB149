package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Shows;
import com.cjc.repository.HomeRepository;
import com.cjc.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Shows s) {
		
		hr.save(s);
	}

	@Override
	public Iterable<Shows> getAllData() {
		
		return hr.findAll();
	}

	@Override
	public void deleteShowData(int id) {
		hr.deleteById(id);
	}
	
	

}
