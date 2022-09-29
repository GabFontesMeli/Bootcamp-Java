package Java4.praticaIntegradora1;

import Java4.praticaIntegradora1.models.Cliente;
import Java4.praticaIntegradora1.models.Fatura;
import Java4.praticaIntegradora1.models.Item;
import Java4.praticaIntegradora1.repositories.ClienteRepository;
import Java4.praticaIntegradora1.repositories.FaturaRepository;
import Java4.praticaIntegradora1.repositories.ItemRepository;

public class Compra {
    public static void main(String[] args) {
        ClienteRepository clienteRepository = new ClienteRepository();
        ItemRepository itemRepository = new ItemRepository();
        FaturaRepository faturaRepository = new FaturaRepository();

        Cliente cli1 = new Cliente("1", "Gabs", "Fuentes");
        Cliente cli2 = new Cliente("2", "Hugo", "Caxias");
        Cliente cli3 = new Cliente("3", "Mari", "Saraiva");

        clienteRepository.salvar(cli1);
        clienteRepository.salvar(cli2);
        clienteRepository.salvar(cli3);

        clienteRepository.exibirTodosNaTela();
        clienteRepository.buscarPorId("2");
        clienteRepository.excluirPorId("1");

        Item item1 = new Item("1", "PS5", 2, 5000.0);
        Item item2 = new Item("2", "MOBI", 1, 50000.0);
        Item item3 = new Item("3", "UNO", 1, 40000.0);
        Item item4 = new Item("4", "GALAXI", 3, 3000.0);

        itemRepository.salvar(item1);
        itemRepository.salvar(item2);
        itemRepository.salvar(item3);
        itemRepository.salvar(item4);

        itemRepository.excluirPorId("4");

        Fatura fatura = new Fatura(cli1, itemRepository.buscarTodos(), "1");
        System.out.println(fatura.toString());

    }
}
