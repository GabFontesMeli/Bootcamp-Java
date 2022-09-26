package Java3.PraticaIntegradora1.exercicio1.Clientes;

import Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes.ConsultaDeSaldo;
import Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes.SaqueEmDinheiro;
import Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes.Transferencia;

public class Cobrador extends Cliente{
    public Cobrador(String nome, String tipo) {
        super(nome, tipo);
    }

    public void saquesEmDinheiro() {
        SaqueEmDinheiro.transacaoOk();
    }

    public void consultaDeSaldo() {
        ConsultaDeSaldo.transacaoOk();
    }

    @Override
    public String toString() {
        return "Cobrador{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
