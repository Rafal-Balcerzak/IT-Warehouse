package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Addresses;
import pl.balcerzak.ITWarehouse.service.AddressesService;

import java.util.List;

@RestController
@RequestMapping("/api/addresses")
public class AddressesController {

    private final AddressesService addressesService;

    public AddressesController(AddressesService addressesService) {
        this.addressesService = addressesService;
    }

    @GetMapping
    ResponseEntity<List<Addresses>> getAllAddresses() {
        return ResponseEntity.ok(addressesService.getAllAddresses());
    }

    @GetMapping("/{id}")
    ResponseEntity<Addresses> getAddressById(@PathVariable long id) {
        return ResponseEntity.ok(addressesService.getAddressById(id));
    }

    @PostMapping
    ResponseEntity<Addresses> addAddress(@RequestBody Addresses address) {
        return ResponseEntity.ok(addressesService.addAddress(address));
    }
}
