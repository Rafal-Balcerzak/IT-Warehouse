package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Companies;
import pl.balcerzak.ITWarehouse.service.CompaniesService;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {

    private final CompaniesService companiesService;

    public CompaniesController(CompaniesService companiesService) {
        this.companiesService = companiesService;
    }

    @GetMapping
    ResponseEntity<List<Companies>> getAllCompanies(){
        return ResponseEntity.ok(companiesService.getAllCompanies());
    }

    @GetMapping("/{id}")
    ResponseEntity<Companies> getCompanieById(@PathVariable long id){
        return ResponseEntity.ok(companiesService.getCompaniesById(id));
    }

    @PostMapping
    ResponseEntity<Companies> addCompanie(@RequestBody Companies companie){
        return ResponseEntity.ok(companiesService.addCompanies(companie));
    }
}
