package Java4.praticaIntegradora1.repositories;

import Java4.praticaIntegradora1.models.Fatura;
import Java4.praticaIntegradora1.models.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemRepository implements Repository<Item> {

    List <Item> listaItems = new ArrayList<>();
    @Override
    public void salvar(Item objeto) {
        listaItems.add(objeto);
    }

    @Override
    public void exibirTodosNaTela() {
        this.listaItems.forEach(fatura -> System.out.println(fatura.toString()));
    }

    @Override
    public Optional<Item> buscarPorId(String id) {
        boolean aux = false;
        for (Item item : this.listaItems) {
            if (item.getCodigo().equals(id)) {
                System.out.println(item);
                return Optional.of(item);
            }
        }
        System.out.println("Fatura não encontrada.");
        return Optional.empty();
    }

    @Override
    public Optional<Item> excluirPorId(String id) {
        Optional<Item> fact = this.buscarPorId(id);

        if (fact.isEmpty()) {
            System.out.println("Fatura não encontrada");
        }
        else {
            System.out.println("Factura excluida corretamente");
            listaItems.remove(fact.get());
        }
        return null;
    }

    @Override
    public List<Item> buscarTodos() {
        return this.listaItems;
    }
}
