package Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes;

import Java3.PraticaIntegradora1.exercicio1.StatusTransacao;

public class PagamentoDeServicos implements StatusTransacao {

    public static void transacaoOk() {
        System.out.println("Serviço XXXX pago com sucesso.");
    }

    public static void transacaoNaoOk() {
        System.out.println("Não foi possível pagar o serviço.");
    }
}
