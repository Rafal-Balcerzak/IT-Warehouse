package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Address;

import java.util.List;

public interface AddressService {

    List<Address> getAllAddresses();

    Address getAddressById(long id);

    Address addAddress(Address address);

    void deleteAddress(Address address);

    void deleteAddressById(long id);

    Address editAddress(Address address);
}
