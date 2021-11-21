package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Demand;

import java.util.List;

public interface DemandService {

    List<Demand> getAllDemands();

    Demand getDemandById(long id);

    Demand addDemand(Demand demand);

}
