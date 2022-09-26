package Java3.PraticaIntegradora1.exercicio1.Clientes;

import Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes.Deposito;

public abstract class Cliente {
    public String nome;
    public String tipo;


    public Cliente(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
