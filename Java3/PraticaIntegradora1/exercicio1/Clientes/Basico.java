package Java3.PraticaIntegradora1.exercicio1.Clientes;

import Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes.*;

public class Basico extends Cliente{
    public Basico(String nome, String tipo) {
        super(nome, tipo);
    }

    public void consultaDeSaldo() {
        ConsultaDeSaldo.transacaoOk();
    }

    public void pagamentosDeServicos() {
        PagamentoDeServicos.transacaoOk();
    }

    public void saqueEmDinheiro() {
        SaqueEmDinheiro.transacaoOk();
    }

    public String toString() {
        return "Basico{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
