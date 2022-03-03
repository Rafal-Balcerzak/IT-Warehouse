package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Handover;

import java.util.List;

public interface HandoverService {

    List<Handover> getAllHandovers();

    Handover getHandoverById(long id);

    Handover addHandover(Handover handover);

    void deleteHandoverById(long id);

    Handover editHandover(Handover handover);

}
