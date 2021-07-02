package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CompanyBudget;
import com.example.demo.service.CompanyBudgetService;

@RestController
public class CompanyBudgetController {
	
	@Autowired
	private CompanyBudgetService companyBudgetService;
	
	@PostMapping("/addNewCompanyBudget")
	public CompanyBudget addNewCompanyBudget(
			@RequestBody CompanyBudget companyBudget) {
		return companyBudgetService.saveCompanyBudget(companyBudget);
	}
}
