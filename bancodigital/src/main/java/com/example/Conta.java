package com.example;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta {
    private static int SEQUENCIAL = 1;
    
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> historico;

    public Conta(Cliente cliente) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historico = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void depositar(double valor) {
        saldo += valor;
        historico.add("Depositar de R$ " + valor);
    }

    public boolean sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            historico.add("Saque de R$ " + valor);
            return true;
        }
        historico.add("Tentativa de saque falhou: R$ " + valor);
        return false;
    }

    public boolean transferir(Conta destino, double valor) {
        if(this.sacar(valor)) {
            destino.depositar(valor);
            historico.add("Transferência de R$ " + valor + " para conta " + destino.getNumero());
            return true;
        }
        historico.add("Transferência façhou para conta " + destino.getNumero());
        return false;
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta " + numero + " ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Histórico: ");
        for (String transacao : historico) {
            System.out.println(" - " + transacao);
        }
        System.out.println();
    }
}