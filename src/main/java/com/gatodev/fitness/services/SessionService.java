package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Session;

import java.util.List;

public interface SessionService {
    Session addSession(Session session);
    Session updateSession(Session session);
    void deleteSession(Session session);
    List<Session> getAllSessions();
}
