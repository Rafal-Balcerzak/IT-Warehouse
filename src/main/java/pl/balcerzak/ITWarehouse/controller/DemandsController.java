package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Demands;
import pl.balcerzak.ITWarehouse.service.DemandsService;

import java.util.List;

@RestController
@RequestMapping("/api/demands")
public class DemandsController {

    private final DemandsService demandsService;

    public DemandsController(DemandsService demandsService) {
        this.demandsService = demandsService;
    }

    @GetMapping
    ResponseEntity<List<Demands>> getAllDemands() {
        return ResponseEntity.ok(demandsService.getAllDemands());
    }

    @GetMapping("/{id}")
    ResponseEntity<Demands> getDemandById(@PathVariable long id) {
        return ResponseEntity.ok(demandsService.getDemandById(id));
    }

    @PostMapping
    ResponseEntity<Demands> addDemand(@RequestBody Demands demand) {
        return ResponseEntity.ok(demandsService.addDemand(demand));
    }
}
