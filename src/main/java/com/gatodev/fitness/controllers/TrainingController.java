package com.gatodev.fitness.controllers;
import com.gatodev.fitness.entities.Training;
import com.gatodev.fitness.services.TrainingService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/training")
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @GetMapping
    public ResponseEntity<?> getAllTrainings() {return ResponseEntity.ok(trainingService.getTrainings());}

    @GetMapping("/{id}")
    public ResponseEntity<?> getTrainingById(@PathVariable Long id) {
        return ResponseEntity.ok(trainingService.getTraining(id));
    }

    @PostMapping
    public ResponseEntity<?> addTraining(@RequestBody Training training) {
        return ResponseEntity.ok(trainingService.addTraining(training));
    }

    @PutMapping
    public ResponseEntity<?> updateTraining(@RequestBody Training training) {
        return ResponseEntity.ok(trainingService.updateTraining(training));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTraining(@PathVariable Long id) {
        trainingService.deleteTraining(id);
        return ResponseEntity.ok("Entrenamiento eliminado correctamente");
    }
}
