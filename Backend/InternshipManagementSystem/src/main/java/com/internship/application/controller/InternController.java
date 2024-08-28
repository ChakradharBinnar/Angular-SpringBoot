package com.internship.application.controller;

import java.util.List;
import java.util.Optional;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.internship.application.customResponse.CustomResponse;
import com.internship.application.entity.InternEntity;
import com.internship.application.payload.InternPayload;
import com.internship.application.service.InternService;

@CrossOrigin("*")
@RestController
public class InternController {

	@Autowired
	private InternService internService;
	
	@PostMapping("/saveIntern")
	public ResponseEntity<CustomResponse> saveIntern(@RequestBody InternEntity internEntity) {
		InternEntity intern=internService.saveIntern(internEntity);
		CustomResponse response = new CustomResponse(true, "Intern Created", intern);
		return new ResponseEntity<CustomResponse>(response,HttpStatus.CREATED);	
	}
	
	@GetMapping("/getAllIntern")
	public ResponseEntity<CustomResponse> getAllInterns(){
		List<InternEntity> listIntern = internService.getAllInterns();
		if(!listIntern.isEmpty()) {
		CustomResponse response = new CustomResponse(true, "Getting All Interns", listIntern);	
		return new ResponseEntity<>(response, HttpStatus.OK);
		}
		CustomResponse response = new CustomResponse(false, "Intern Not Found");	
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/dltInternById")
	public ResponseEntity<CustomResponse> deleteInternById(@RequestBody InternPayload payload) {
		
		Optional<InternEntity> intern=internService.findInternById(payload.getInternId());
		
		if(!intern.isEmpty()) {
			internService.deleteInternById(payload.getInternId());
			CustomResponse response = new CustomResponse(true, "Intern Delete Successfully");
			return new ResponseEntity<>(response, HttpStatus.OK);
			
		}
		CustomResponse response = new CustomResponse(false, "Intern Not Found");
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/findInternById")
	public ResponseEntity<CustomResponse> findInternById(@RequestBody InternPayload payload) {
		
		Optional<InternEntity> intern=internService.findInternById(payload.getInternId());
		
		if(!intern.isEmpty()) {
			CustomResponse response = new CustomResponse(true, "Success", intern);
			return new ResponseEntity<>(response, HttpStatus.OK);
			
		}
		CustomResponse response = new CustomResponse(false, "Intern Not Found");
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
	
}
