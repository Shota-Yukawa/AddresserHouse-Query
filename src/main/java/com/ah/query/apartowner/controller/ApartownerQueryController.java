package com.ah.query.apartowner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ah.query.apartowner.service.ApartownerQueryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("apartowner")
public class ApartownerQueryController {
	
	private final ApartownerQueryService apartownerQueryService;

	@GetMapping("test")
	public String test() {
//		return apartownerQueryService.searchById(21);
	 return "success";
	}
	
}
