package com.example;

public class ContaCorrente extends Conta {

    private static final double TAXA_MANUTENCAO = 12.90;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void cobrarManutencao() {
        if(saldo >= TAXA_MANUTENCAO) {
            saldo -= TAXA_MANUTENCAO;
            historico.add("Cobrança de taxa de manutenção: " + TAXA_MANUTENCAO);
        } else {
            historico.add("Não foi possível cobrar a taxa de manutenção. Saldo insuficiente. ");
    }
}

}