package com.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nome;
    private final List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Conta buscarConta(int numero) {
        return contas.stream()
                .filter(c -> c.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }

    public String getNome() {
        return nome;
    }
}
