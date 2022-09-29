package Java4.praticaIntegradora1.repositories;

import Java4.praticaIntegradora1.models.Fatura;
import Java4.praticaIntegradora1.models.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FaturaRepository implements Repository<Fatura> {

    List<Fatura> listaFaturas = new ArrayList<>();

    @Override
    public void salvar(Fatura objeto) {
        listaFaturas.add(objeto);
    }

    @Override
    public void exibirTodosNaTela() {
        this.listaFaturas.forEach(fatura -> System.out.println(fatura.toString()));
    }

    @Override
    public Optional<Fatura> buscarPorId(String id) {
        boolean aux = false;
        for (Fatura fatura : this.listaFaturas) {
            if (fatura.getCodigo().equals(id)) {
                System.out.println(fatura);
                return Optional.of(fatura);
            }
        }
        System.out.println("Fatura não encontrada.");
        return Optional.empty();
    }

    @Override
    public Optional<Item> excluirPorId(String id) {
        Optional<Fatura> fact = this.buscarPorId(id);

        if (fact.isEmpty()) {
            System.out.println("Fatura não encontrada");
        }
        else {
            System.out.println("Fatura excluida corretamente");
            listaFaturas.remove(fact.get());
        }
        return null;
    }

    @Override
    public List<Fatura> buscarTodos() {
        return this.listaFaturas;
    }
}
