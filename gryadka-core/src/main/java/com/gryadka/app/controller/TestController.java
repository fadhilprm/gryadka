package com.gryadka.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class TestController {

  
  @RequestMapping(value="/status",method=RequestMethod.GET)
	public ResponseEntity<ObjectNode> status() {
    ObjectNode node=new ObjectMapper().createObjectNode();
    node.put("status", "UP");
	  
	  return new ResponseEntity<ObjectNode>(node,HttpStatus.OK);
	  
	}

	
	
}
