package org.example.demo.service;

import org.example.demo.repository.JogoRepository;
import org.example.demo.model.Jogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogoService {

    private final JogoRepository jogoRepository;

    @Autowired
    public JogoService(JogoRepository jogoRepository) {
        this.jogoRepository = jogoRepository;
    }

    public Jogo saveJogo(Jogo jogo) {
        return jogoRepository.save(jogo);
    }

    public Iterable<Jogo> getAllJogos() {
        return jogoRepository.findAll();
    }

}
