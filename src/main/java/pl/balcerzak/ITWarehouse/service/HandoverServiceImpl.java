package pl.balcerzak.ITWarehouse.service;

import org.springframework.stereotype.Service;
import pl.balcerzak.ITWarehouse.entity.Handover;
import pl.balcerzak.ITWarehouse.repository.HandoverRepository;

import java.util.List;


@Service
public class HandoverServiceImpl implements HandoverService {

    private final HandoverRepository handoverRepository;

    public HandoverServiceImpl(HandoverRepository handoverRepository) {
        this.handoverRepository = handoverRepository;
    }

    @Override
    public List<Handover> getAllHandovers() {
        return handoverRepository.findAll();
    }

    @Override
    public Handover getHandoverById(long id) {
        return handoverRepository.findByIdHandover(id);
    }

    @Override
    public Handover addHandover(Handover handover) {
        return handoverRepository.save(handover);
    }
}
