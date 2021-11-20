package pl.balcerzak.ITWarehouse.service;

import org.springframework.stereotype.Service;
import pl.balcerzak.ITWarehouse.entity.Companies;
import pl.balcerzak.ITWarehouse.repository.CompaniesRepository;

import java.util.List;

@Service
public class CompaniesServiceImpl implements CompaniesService {

    private final CompaniesRepository companiesRepository;

    public CompaniesServiceImpl(CompaniesRepository companiesRepository) {
        this.companiesRepository = companiesRepository;
    }

    @Override
    public List<Companies> getAllCompanies() {
        return companiesRepository.findAll();
    }

    @Override
    public Companies getCompaniesById(long id) {
        return companiesRepository.findByIdCompanie(id);
    }

    @Override
    public Companies addCompanies(Companies companies) {
        return companiesRepository.save(companies);
    }
}
