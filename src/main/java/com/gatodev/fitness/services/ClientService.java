package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Client;

import java.util.List;
import java.util.UUID;

public interface ClientService {
    Client addClient(Client client);

    Client getClientById(UUID id);

    Client updateClient(Client client);

    void deleteClientById(UUID id);

    List<Client> getAllClients();
}
