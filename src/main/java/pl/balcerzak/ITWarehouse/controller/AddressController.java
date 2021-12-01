package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Address;
import pl.balcerzak.ITWarehouse.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/api/address")
@CrossOrigin("*")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    ResponseEntity<List<Address>> getAllAddresses() {
        return ResponseEntity.ok(addressService.getAllAddresses());
    }

    @GetMapping("/{id}")
    ResponseEntity<Address> getAddressById(@PathVariable long id) {
        return ResponseEntity.ok(addressService.getAddressById(id));
    }

    @PostMapping
    ResponseEntity<Address> addAddress(@RequestBody Address address) {
        return ResponseEntity.ok(addressService.addAddress(address));
    }
}
