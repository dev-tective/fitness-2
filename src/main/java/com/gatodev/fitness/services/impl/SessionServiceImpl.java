package com.gatodev.fitness.services.impl;

import com.gatodev.fitness.entities.Session;
import com.gatodev.fitness.repositories.SessionRepository;
import com.gatodev.fitness.services.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SessionServiceImpl implements SessionService {
    private final SessionRepository sessionRepository;

    @Override
    public Session addSession(Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public Session updateSession(Session session) {
        return sessionRepository.save(session);
    }

    @Override
    public void deleteSession(Session session) {
        sessionRepository.delete(session);
    }

    @Override
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }
}
