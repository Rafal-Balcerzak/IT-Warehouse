package pl.balcerzak.ITWarehouse.service;

import org.springframework.stereotype.Service;
import pl.balcerzak.ITWarehouse.entity.Demand;
import pl.balcerzak.ITWarehouse.repository.DemandRepository;

import java.util.List;

@Service
public class DemandServiceImpl implements DemandService {

    private final DemandRepository demandRepository;

    public DemandServiceImpl(DemandRepository demandRepository) {
        this.demandRepository = demandRepository;
    }

    @Override
    public List<Demand> getAllDemands() {
        return demandRepository.findAll();
    }

    @Override
    public Demand getDemandById(long id) {
        return demandRepository.findByIdDemand(id);
    }

    @Override
    public Demand addDemand(Demand demand) {
        return demandRepository.save(demand);
    }

    @Override
    public void deleteDemandById(long id) {
        Demand demand = demandRepository.findByIdDemand(id);
        demandRepository.delete(demand);
    }

    @Override
    public Demand editDemand(Demand demand) {
        return demandRepository.save(demand);
    }

    @Override
    public List<Demand> findAllByIsDoneFalse() {
        return demandRepository.findAllByIsDoneFalse();
    }

    @Override
    public long countByIsDoneFalse(){
        return demandRepository.countByIsDoneFalse();
    }
}
