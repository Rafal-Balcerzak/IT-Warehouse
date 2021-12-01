package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Distributor;
import pl.balcerzak.ITWarehouse.service.DistributorService;

import java.util.List;

@RestController
@RequestMapping("/api/distributor")
@CrossOrigin("*")
public class DistributorController {

    private final DistributorService distributorService;

    public DistributorController(DistributorService distributorService) {
        this.distributorService = distributorService;
    }

    @GetMapping
    ResponseEntity<List<Distributor>> getAllDistributors(){
        return ResponseEntity.ok(distributorService.getAllDistributors());
    }

    @GetMapping("/{id}")
    ResponseEntity<Distributor> getDistributorById(@PathVariable long id){
        return ResponseEntity.ok(distributorService.getDistributorById(id));
    }

    @PostMapping
    ResponseEntity<Distributor> addDistributor(@RequestBody Distributor distributor){
        return ResponseEntity.ok(distributorService.addDistributor(distributor));
    }
}
