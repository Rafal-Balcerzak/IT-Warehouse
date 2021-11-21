package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    Company getCompanyById(long id);

    Company addCompany(Company company);

}
