package Java3.PraticaIntegradora1.exercicio1;

import Java3.PraticaIntegradora1.exercicio1.Clientes.Basico;
import Java3.PraticaIntegradora1.exercicio1.Clientes.Cliente;
import Java3.PraticaIntegradora1.exercicio1.Clientes.Cobrador;
import Java3.PraticaIntegradora1.exercicio1.Clientes.Executivo;

public class Banco {
    public static void main(String[] args) {
        Executivo huguinho = new Executivo("Huguinho", "Executivo");
        Basico zezinho = new Basico("Zezinho", "Básico");
        Cobrador luizinho = new Cobrador("Luizinho", "Cobrador");

        huguinho.deposito();
        huguinho.transferencia();

        zezinho.consultaDeSaldo();
        zezinho.pagamentosDeServicos();
        zezinho.saqueEmDinheiro();

        luizinho.consultaDeSaldo();
        luizinho.saquesEmDinheiro();
    }
}
