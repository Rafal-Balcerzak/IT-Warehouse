package pl.balcerzak.ITWarehouse.service;

import org.springframework.stereotype.Service;
import pl.balcerzak.ITWarehouse.entity.Distributor;
import pl.balcerzak.ITWarehouse.repository.DistributorRepository;

import java.util.List;

@Service
public class DistributorServiceImpl implements DistributorService {

    private final DistributorRepository distributorRepository;

    public DistributorServiceImpl(DistributorRepository distributorRepository) {
        this.distributorRepository = distributorRepository;
    }

    @Override
    public List<Distributor> getAllDistributors() {
        return distributorRepository.findAll();
    }

    @Override
    public Distributor getDistributorById(long id) {
        return distributorRepository.findByIdDistributor(id);
    }

    @Override
    public Distributor addDistributor(Distributor distributor) {
        return distributorRepository.save(distributor);
    }

    @Override
    public void deleteDistributorById(long id) {
        Distributor distributor = distributorRepository.findByIdDistributor(id);
        distributorRepository.delete(distributor);
    }

    @Override
    public Distributor editDistributor(Distributor distributor) {
        return distributorRepository.save(distributor);
    }
}
