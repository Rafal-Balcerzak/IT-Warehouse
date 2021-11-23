package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Handover;
import pl.balcerzak.ITWarehouse.service.HandoverService;

import java.util.List;

@RestController
@RequestMapping("/api/handover")
public class HandoverController {

    private final HandoverService handoverService;

    public HandoverController(HandoverService handoverService) {
        this.handoverService = handoverService;
    }

    @GetMapping
    ResponseEntity<List<Handover>> getAllHandovers(){
        return ResponseEntity.ok(handoverService.getAllHandovers());
    }

    @GetMapping("/{id}")
    ResponseEntity<Handover> getHandoverById(@PathVariable long id){
        return ResponseEntity.ok(handoverService.getHandoverById(id));
    }

    @PostMapping
    ResponseEntity<Handover> addHandover(@RequestBody Handover handover){
        return ResponseEntity.ok(handoverService.addHandover(handover));
    }
}
