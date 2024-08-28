package com.internship.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.application.entity.InternEntity;
import com.internship.application.repository.InternRepository;

@Service
public class InternService {
	
	@Autowired
	private InternRepository internRepo;
	
	public InternEntity saveIntern(InternEntity intern) {
		return internRepo.save(intern);
	}
	
	public List<InternEntity> getAllInterns(){
		return internRepo.findAll();
	}
	
	public Optional<InternEntity> findInternById(int internId) {
		return internRepo.findById(internId);
	}
	
	public void deleteInternById(int internId) {
		internRepo.deleteById(internId);
	}
	

}
