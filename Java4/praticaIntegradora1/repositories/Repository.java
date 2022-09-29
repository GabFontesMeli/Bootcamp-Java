package Java4.praticaIntegradora1.repositories;

import Java4.praticaIntegradora1.models.Item;

import java.util.List;
import java.util.Optional;

public interface Repository <T>{
    public void salvar (T objeto);
    public void exibirTodosNaTela();
    public Optional<Item> excluirPorId (String id);
    public Optional<T> buscarPorId (String id);
    public List<T> buscarTodos();
}
