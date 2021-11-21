package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Company;
import pl.balcerzak.ITWarehouse.service.CompanyService;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    ResponseEntity<List<Company>> getAllCompanies(){
        return ResponseEntity.ok(companyService.getAllCompanies());
    }

    @GetMapping("/{id}")
    ResponseEntity<Company> getCompanyById(@PathVariable long id){
        return ResponseEntity.ok(companyService.getCompanyById(id));
    }

    @PostMapping
    ResponseEntity<Company> addCompany(@RequestBody Company company){
        return ResponseEntity.ok(companyService.addCompany(company));
    }
}
