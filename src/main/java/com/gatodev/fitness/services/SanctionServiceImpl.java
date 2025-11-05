package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Sanction;
import com.gatodev.fitness.repositories.SanctionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanctionServiceImpl implements SanctionService {

    private final SanctionRepository sanctionRepository;

    public SanctionServiceImpl(SanctionRepository sanctionRepository) {
        this.sanctionRepository = sanctionRepository;
    }

    @Override
    public Sanction addSanction(Sanction sanction) {
        return sanctionRepository.save(sanction);
    }

    @Override
    public Sanction updateSanction(Sanction sanction) {return sanctionRepository.save(sanction);}

    @Override
    public Sanction getSanction(Long id) {
        return sanctionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sanción no encontrada"));
    }

    @Override
    public void deleteSanction(Long id) {
        sanctionRepository.findById(id).ifPresentOrElse(
                sanction -> {
                    sanction.setActive(false);
                    sanctionRepository.save(sanction);
                },
                () -> {
                    throw new RuntimeException("Sanción no encontrada");
                }
        );
    }

    @Override
    public List<Sanction> getSanctions() {
        return sanctionRepository.findAll();
    }
}
