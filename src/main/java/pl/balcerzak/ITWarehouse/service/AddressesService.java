package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Addresses;

import java.util.List;

public interface AddressesService {

    List<Addresses> getAllAddresses();

    Addresses getAddressById(long id);

    Addresses addAddress(Addresses addresses);

}
