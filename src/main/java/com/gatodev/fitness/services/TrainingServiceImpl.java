package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Training;
import com.gatodev.fitness.repositories.TrainingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {

    private final TrainingRepository trainingRepository;

    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public Training addTraining(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public Training updateTraining(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public Training getTraining(Long id) {
        return trainingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Entrenamiento no encontrado"));
    }

    @Override
    public void deleteTraining(Long id) {
        trainingRepository.findById(id).ifPresentOrElse(
                training -> {
                    training.setActive(false);
                    trainingRepository.save(training);
                },
                () -> {
                    throw new RuntimeException("Entrenamiento no encontrado");
                }
        );
    }

    @Override
    public List<Training> getTrainings() {
        return trainingRepository.findAll();
    }
}
