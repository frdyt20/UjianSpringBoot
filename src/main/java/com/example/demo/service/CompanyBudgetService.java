package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CompanyBudget;
import com.example.demo.repository.CompanyBudgetRepository;

@Service
public class CompanyBudgetService {
	
	@Autowired
	private CompanyBudgetRepository companyBudgetRepository;
	
	public CompanyBudget saveCompanyBudget(CompanyBudget companyBudget) {
		return companyBudgetRepository.save(companyBudget);
	}
	
	public List<CompanyBudget> getCompanyBudget() {
		return companyBudgetRepository.findAll();
	}
	
	public CompanyBudget getById(int id) {
		return companyBudgetRepository.findById(id).orElse(null);
	}
	
	public String deleteCompanyBudget(int id) {
		companyBudgetRepository.deleteById(id);
		return "Company Budget Deleted";
	}
	
	public CompanyBudget updateCompanyBudget(CompanyBudget companyBudget) {
		CompanyBudget existingCompanyBudget = companyBudgetRepository.findById(companyBudget.getId()).orElse(null);
		existingCompanyBudget.setCompany_id(companyBudget.getCompany_id());
		existingCompanyBudget.setAmount(companyBudget.getAmount());
		return companyBudgetRepository.save(existingCompanyBudget);
	}

}
