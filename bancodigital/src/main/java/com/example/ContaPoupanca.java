package com.example;

public class ContaPoupanca extends Conta {

    private static final double TAXA_RENDIMENTO = 0.005;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void renderJuros() {
        double rendimento = saldo * TAXA_RENDIMENTO;
        saldo += rendimento;
        historico.add("Rendimento aplicado: R$ " + rendimento);
    }
}
