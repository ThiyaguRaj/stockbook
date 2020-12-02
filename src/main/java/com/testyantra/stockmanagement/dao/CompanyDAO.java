package com.testyantra.stockmanagement.dao;

import java.util.List;

import com.testyantra.stockmanagement.entities.Company;
import com.testyantra.stockmanagement.entities.Stock;
import com.testyantra.stockmanagement.entities.User;

public interface CompanyDAO {

	public Company addCompany(Company company);

	public Company removeCompany(int companyId);

	public Company updateCompany(Company company);

	public Company getCompanyDetail(User user);

	public List<Company> getAllCompanyDetails();

	public Stock addStock(Stock stock);

	public Stock updateStock(Stock stock);
}
