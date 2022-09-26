package Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes;

import Java3.PraticaIntegradora1.exercicio1.StatusTransacao;

public class ConsultaDeSaldo implements StatusTransacao {

    public static void transacaoOk() {
        System.out.println("Consulta de saldo concluída. Seu saldo é de R$XXX.");
    }


    public static void transacaoNaoOk() {
        System.out.println("Não foi possível consultar o seu saldo.");
    }
}
