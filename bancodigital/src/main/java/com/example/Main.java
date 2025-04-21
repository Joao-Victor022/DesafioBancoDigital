package com.example;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente joao = new Cliente("João Silva", "12345678900");
        ContaCorrente ccjoao = new ContaCorrente(joao);
        ContaPoupanca cpjoao = new ContaPoupanca(joao);


        banco.adicionarConta(ccjoao);
        banco.adicionarConta(cpjoao);

        ccjoao.depositar(1000);
        ccjoao.transferir(cpjoao, 200);

        ccjoao.cobrarManutencao();
        cpjoao.renderJuros();

        ccjoao.imprimirExtrato();
        cpjoao.imprimirExtrato();
    }
}
