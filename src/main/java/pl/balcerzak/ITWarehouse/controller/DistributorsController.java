package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Distributors;
import pl.balcerzak.ITWarehouse.service.DistributorsService;

import java.util.List;

@RestController
@RequestMapping("/api/distributors")
public class DistributorsController {

    private final DistributorsService distributorsService;

    public DistributorsController(DistributorsService distributorsService) {
        this.distributorsService = distributorsService;
    }

    @GetMapping
    ResponseEntity<List<Distributors>> getAllDistributors(){
        return ResponseEntity.ok(distributorsService.getAllDistributors());
    }

    @GetMapping("/{id}")
    ResponseEntity<Distributors> getDistributorById(@PathVariable long id){
        return ResponseEntity.ok(distributorsService.getDistributorById(id));
    }

    @PostMapping
    ResponseEntity<Distributors> addDistributor(@RequestBody Distributors distributor){
        return ResponseEntity.ok(distributorsService.addDistributor(distributor));
    }
}
