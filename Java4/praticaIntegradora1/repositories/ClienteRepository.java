package Java4.praticaIntegradora1.repositories;

import Java4.praticaIntegradora1.models.Cliente;
import Java4.praticaIntegradora1.models.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteRepository implements Repository<Cliente>{
    private List<Cliente> listaClientes;

    public ClienteRepository() {
        this.listaClientes = new ArrayList<>();
    }

    @Override
    public void salvar(Cliente objeto) {
        this.listaClientes.add(objeto);
    }

    @Override
    public void exibirTodosNaTela() {
        this.listaClientes.forEach(cli -> System.out.print("ID: " + cli.getId() +
                "\nNome: " + cli.getNome() +
                "\nSobrenome: " + cli.getSobrenome() + "\n\n"
        ));
    }

    public void exibirNaTela(Cliente cli) {
        System.out.print("ID: " + cli.getId() +
                "\nNome: " + cli.getNome() +
                "\nSobrenome: " + cli.getSobrenome() + "\n\n"
        );
    }

    @Override
    public Optional<Cliente> buscarPorId(String id) {
        boolean aux = false;
        for (Cliente cli : this.listaClientes) {
            if (cli.getId().equals(id)) {
                this.exibirNaTela(cli);
                aux = true;
                return Optional.of(cli);
            }
        }
        System.out.println("Cliente não encontrado.");
        return Optional.empty();
    }

    @Override
    public List<Cliente> buscarTodos() {
        return this.listaClientes;
    }

    @Override
    public Optional<Item> excluirPorId(String id) {
        Optional<Cliente> cliente = this.buscarPorId(id);
        if (cliente.isEmpty()){
            System.out.println("Cliente não encontrado");
        }else{
            this.listaClientes.remove(cliente.get());
            System.out.println("Cliente excluido corretamente");
        }

        return null;
    }
}
