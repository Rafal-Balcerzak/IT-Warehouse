package pl.balcerzak.ITWarehouse.service;

import org.springframework.stereotype.Service;
import pl.balcerzak.ITWarehouse.entity.Distributors;
import pl.balcerzak.ITWarehouse.repository.DistributorsRepository;

import java.util.List;

@Service
public class DistributorsServiceImpl implements DistributorsService {

    private final DistributorsRepository distributorsRepository;

    public DistributorsServiceImpl(DistributorsRepository distributorsRepository) {
        this.distributorsRepository = distributorsRepository;
    }

    @Override
    public List<Distributors> getAllDistributors() {
        return distributorsRepository.findAll();
    }

    @Override
    public Distributors getDistributorById(long id) {
        return distributorsRepository.findByIdDistributor(id);
    }

    @Override
    public Distributors addDistributor(Distributors distributors) {
        return distributorsRepository.save(distributors);
    }
}
