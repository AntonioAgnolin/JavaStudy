package org.example.demo;

public class Elevador {
    private int andarAtual;

    public Elevador() {
        this.andarAtual = 0;
    }

    public void mover(int andarSolicitado) {
        if (andarSolicitado > andarAtual) {
            subir(andarSolicitado);
        } else if (andarSolicitado < andarAtual) {
            descer(andarSolicitado);
        }
    }

    private void subir(int andarSolicitado) {
        for (int i = andarAtual + 1; i <= andarSolicitado; i++) {
            System.out.println("Subindo para o andar " + i);
            andarAtual = i;
        }
    }

    private void descer(int andarSolicitado) {
        for (int i = andarAtual - 1; i >= andarSolicitado; i--) {
            System.out.println("Descendo para o andar " + i);
            andarAtual = i;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }
}
