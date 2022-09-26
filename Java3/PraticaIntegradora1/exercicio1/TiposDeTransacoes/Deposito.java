package Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes;

import Java3.PraticaIntegradora1.exercicio1.StatusTransacao;

public class Deposito implements StatusTransacao {

    public static void transacaoOk() {
        System.out.println("Depósito de R$XXX feito com sucesso.");
    }

    public static void transacaoNaoOk() {
        System.out.println("Não foi possível realizar o depósito.");
    }
}
