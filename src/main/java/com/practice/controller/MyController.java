package com.practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Response.Response;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MyController {

	
	@GetMapping("/welcome/{Name}")
	public Response<String> response(@PathVariable(name="Name")String name){
		String greeting = "Hello Mr. "+name;
		return new Response(200,"Success",greeting);
	}
}
