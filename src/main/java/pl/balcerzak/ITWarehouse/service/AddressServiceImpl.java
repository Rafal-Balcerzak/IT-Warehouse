package pl.balcerzak.ITWarehouse.service;

import org.springframework.stereotype.Service;
import pl.balcerzak.ITWarehouse.entity.Address;
import pl.balcerzak.ITWarehouse.repository.AddressRepository;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(long id) {
        return addressRepository.findByIdAddress(id);
    }

    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }
}
