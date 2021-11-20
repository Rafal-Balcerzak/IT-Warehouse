package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Companies;

import java.util.List;

public interface CompaniesService {

    List<Companies> getAllCompanies();

    Companies getCompaniesById(long id);

    Companies addCompanies(Companies companies);


}
