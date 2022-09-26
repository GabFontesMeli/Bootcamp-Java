package Java3.PraticaIntegradora1.exercicio1.Clientes;

import Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes.Deposito;
import Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes.Transferencia;

public class Executivo extends Cliente{
    public Executivo(String nome, String tipo) {
        super(nome, tipo);
    }

    public void deposito() {
        Deposito.transacaoOk();
    }

    public void transferencia() {
        Transferencia.transacaoOk();
    }

    @Override
    public String toString() {
        return "Executivo{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
