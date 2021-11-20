package pl.balcerzak.ITWarehouse.service;

import org.springframework.stereotype.Service;
import pl.balcerzak.ITWarehouse.entity.Demands;
import pl.balcerzak.ITWarehouse.repository.DemandsRepository;

import java.util.List;

@Service
public class DemandsServiceImpl implements DemandsService {

    private final DemandsRepository demandsRepository;

    public DemandsServiceImpl(DemandsRepository demandsRepository) {
        this.demandsRepository = demandsRepository;
    }

    @Override
    public List<Demands> getAllDemands() {
        return demandsRepository.findAll();
    }

    @Override
    public Demands getDemandById(long id) {
        return demandsRepository.findByIdDemands(id);
    }

    @Override
    public Demands addDemand(Demands demands) {
        return demandsRepository.save(demands);
    }
}
