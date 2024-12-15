package org.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RelatorioController {

    private final GeradorRelatorio geradorRelatorio;

    @Autowired
    public RelatorioController(GeradorRelatorio geradorRelatorio) {
        this.geradorRelatorio = geradorRelatorio;
    }

    @GetMapping("/estudante/{id}")
    public Estudante getEstudantePorId(@PathVariable int id) {
        Estudante estudante = geradorRelatorio.buscarPorId(id);
        if (estudante != null) {
            return estudante;
        } else {
            throw new RuntimeException("Aluno não encontrado");
        }
    }

    @GetMapping("/estudantes")
    public List<Estudante> getTodosEstudantes() {
        return geradorRelatorio.getEstudantes();
    }
}
