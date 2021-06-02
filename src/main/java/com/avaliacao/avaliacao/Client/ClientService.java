package com.avaliacao.avaliacao.Client;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public Client findById(Long clientId){
        Client client =  clientRepository.findById(clientId)
                .orElseThrow(()-> new RuntimeException("Client no found"));
        return client;
    }
}
