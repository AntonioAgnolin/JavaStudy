package org.example.demo.controller;

import org.example.demo.model.Jogo;
import org.example.demo.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    private final JogoService jogoService;

    @Autowired
    public JogoController(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @PostMapping
    public Jogo addJogo(@RequestBody Jogo jogo) {
        return jogoService.saveJogo(jogo);
    }

    @GetMapping
    public Iterable<Jogo> getAllJogos() {
        return jogoService.getAllJogos();
    }
}
