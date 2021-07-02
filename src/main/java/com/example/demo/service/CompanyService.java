package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}
	
	public List<Company> getCompany() {
		return companyRepository.findAll();
	}
	
	public Company getById(int company_id) {
		return companyRepository.findById(company_id).orElse(null);
	}
	
	public String deleteCompany(int company_id) {
		companyRepository.deleteById(company_id);
		return "Company Deleted";
	}
	
	public Company updateCompany(Company company) {
		Company existingCompany = companyRepository.findById(company.getCompany_id()).orElse(null);
		existingCompany.setCompany_name(company.getCompany_name());
		existingCompany.setAddress(company.getAddress());
		return companyRepository.save(existingCompany);
	}
}
