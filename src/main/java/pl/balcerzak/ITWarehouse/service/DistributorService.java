package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Distributor;

import java.util.List;

public interface DistributorService {

    List<Distributor> getAllDistributors();

    Distributor getDistributorById(long id);

    Distributor addDistributor(Distributor distributor);

    void deleteDistributorById(long id);

    Distributor editDistributor(Distributor distributor);

}
