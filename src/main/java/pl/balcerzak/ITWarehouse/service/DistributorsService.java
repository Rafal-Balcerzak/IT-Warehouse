package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Distributors;

import java.util.List;

public interface DistributorsService {

    List<Distributors> getAllDistributors();

    Distributors getDistributorById(long id);

    Distributors addDistributor(Distributors distributors);

}
