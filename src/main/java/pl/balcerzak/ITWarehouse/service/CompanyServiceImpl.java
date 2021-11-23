package pl.balcerzak.ITWarehouse.service;

import org.springframework.stereotype.Service;
import pl.balcerzak.ITWarehouse.entity.Company;
import pl.balcerzak.ITWarehouse.repository.CompanyRepository;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(long id) {
        return companyRepository.findByIdCompany(id);
    }

    @Override
    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }
}
