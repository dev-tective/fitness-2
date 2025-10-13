package com.gatodev.fitness.services;
import com.gatodev.fitness.entities.Training;

import java.util.List;

public interface TrainingService {
    Training addTraining(Training training);

    Training updateTraining(Training training);

    Training getTraining(Long id);

    void deleteTraining(Long id);

    List<Training> getTrainings();
}
