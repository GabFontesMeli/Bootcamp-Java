package Java3.PraticaIntegradora1.exercicio1.TiposDeTransacoes;

import Java3.PraticaIntegradora1.exercicio1.StatusTransacao;

public class Transferencia implements StatusTransacao {

    public static void transacaoOk() {
        System.out.println("Transação concluída com sucesso.");
    }

    public static void transacaoNaoOk() {
        System.out.println("Erro na transacao.");
    }
}
