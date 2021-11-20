package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Demands;

import java.util.List;

public interface DemandsService {

    List<Demands> getAllDemands();

    Demands getDemandById(long id);

    Demands addDemand(Demands demands);

}
