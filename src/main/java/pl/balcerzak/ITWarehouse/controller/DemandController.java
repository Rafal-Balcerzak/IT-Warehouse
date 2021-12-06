package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Demand;
import pl.balcerzak.ITWarehouse.service.DemandService;

import java.util.List;

@RestController
@RequestMapping("/api/demand")
@CrossOrigin("*")
public class DemandController {

    private final DemandService demandService;

    public DemandController(DemandService demandService) {
        this.demandService = demandService;
    }

    @GetMapping
    ResponseEntity<List<Demand>> getAllDemands() {
        return ResponseEntity.ok(demandService.getAllDemands());
    }

    @GetMapping("/{id}")
    ResponseEntity<Demand> getDemandById(@PathVariable long id) {
        return ResponseEntity.ok(demandService.getDemandById(id));
    }

    @PostMapping
    ResponseEntity<Demand> addDemand(@RequestBody Demand demand) {
        return ResponseEntity.ok(demandService.addDemand(demand));
    }

    @DeleteMapping("/{id}")
    void deleteDemandById(@PathVariable long id){
        demandService.deleteDemandById(id);
    }

    @PatchMapping
    ResponseEntity<Demand> editDemand(@RequestBody Demand demand){
        return ResponseEntity.ok(demandService.editDemand(demand));
    }
}
