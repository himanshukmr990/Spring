package com.rest.controller; 
import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody; 
import org.springframework.web.bind.annotation.RestController;
/*
@Controller
@RequestMapping("patient")
public class PatientAdmissionController {
	
	//need to add @ResponseBody to all the request mapping methods
	// @ResponceBody uses the class HttpMessageConverter (REST API) to change the response to XML/JSON data
	 
	 @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces="application/json")
	public @ResponseBody Patient  submitAdmissionForm(@PathVariable String name)
         { 
		Patient  patient1 = new Patient();
		patient1.setPatientAge(10);
		patient1.setPatientName(name); 
			return patient1;
		} 
  }*/


/*
    @RestController is quite simple and is the preferred method for creating MVC RESTful web services 
    starting from Spring v4.0. By annotating the controller class with @RestController annotation, 
    you no longer need to add @ResponseBody to all the request mapping methods.
    The @ResponseBody annotation is active by default. 
*/

@RestController
@RequestMapping("patient")
//http://localhost:8080/controller/patient/amit
public class PatientAdmissionController {
	 /*
	
	  1. without any request header value (eg. Accept=application/json) from client
		   default type of produce is json if @XmlRootElement not used in model.
		   if @XmlRootElement is used default type of produce will be XML
	  2. if client send request with (eg. Accept=application/json)
	      it will only work if :
	      		either the type with produces attribute is listed 
	      		or produces is not used at all
	 */
	
    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces="application/xml") // default type of produce is json
	public Patient  submitAdmissionForm(@PathVariable String name)
         { 
		Patient  patient1 = new Patient();
		patient1.setPatientAge(10);
		patient1.setPatientName(name); 
			return patient1;
		} 
	
//http://localhost:8080/controller/patient
	//@RequestBody to map the request data to model
	@RequestMapping(method = RequestMethod.POST , produces="application/json",headers = "Accept=application/xml, application/json")
    public Patient  addPatient(@RequestBody Patient patient)
         {  
			return patient;
         } 	
  } 

