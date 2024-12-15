package org.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeradorRelatorio {

    private List<Estudante> estudantes;

    public GeradorRelatorio() {
        estudantes = new ArrayList<>();
        adicionar();
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void adicionar() {
        estudantes.add(new Estudante(1, "Bob", "Administração"));
        estudantes.add(new Estudante(2, "Cláudia", "Medicina Veterinária"));
        estudantes.add(new Estudante(3, "Patrick", "Engenharia de Software"));
        estudantes.add(new Estudante(4, "Ana", "Direito"));
    }

    public Estudante buscarPorId(int id) {
        for (Estudante e : estudantes) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
