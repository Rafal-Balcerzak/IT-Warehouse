package pl.balcerzak.ITWarehouse.service;

import org.springframework.stereotype.Service;
import pl.balcerzak.ITWarehouse.entity.Addresses;
import pl.balcerzak.ITWarehouse.repository.AddressesRepository;

import java.util.List;

@Service
public class AddressesServiceImpl implements AddressesService {

    private final AddressesRepository addressesRepository;

    public AddressesServiceImpl(AddressesRepository addressesRepository) {
        this.addressesRepository = addressesRepository;
    }

    @Override
    public List<Addresses> getAllAddresses() {
        return addressesRepository.findAll();
    }

    @Override
    public Addresses getAddressById(long id) {
        return addressesRepository.findByIdAddress(id);
    }

    @Override
    public Addresses addAddress(Addresses addresses) {
        return addressesRepository.save(addresses);
    }
}
