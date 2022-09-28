package Java3.PraticaIntegradora2.exercicio1;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Garagem {
    private String id;
    private List<Veiculo> listaVeiculos;

    public Garagem(String id, List<Veiculo> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public void mostrarListaDeVeiculos() {
        listaVeiculos.forEach(System.out::println);
    }

    public void mostrarListaDeVeiculosPorValor() {
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getPreco))
                .forEach(System.out::println);
    }

    public void mostrarListaDeVeiculosPorValorDecrescente() {
        listaVeiculos.stream()
                .sorted((v1,v2) -> v2.getPreco().compareTo(v1.getPreco()))
                .forEach(System.out::println);
    }

    public void mostrarListaDeVeiculosPorMarcaEPorValor() {
        listaVeiculos.stream()

                .sorted(Comparator.comparing(Veiculo::getPreco))

                .sorted(Comparator.comparing(Veiculo::getMarca))

                .forEach(System.out::println);
    }

    public void mostrarListaDeVeiculosComLimiteValor(Double valor) {
        listaVeiculos.stream()
                .filter(veiculo -> veiculo.getPreco()<valor)
                .forEach(System.out::println);
    }

    //Retorna a média de todos os carros da garagem
    public OptionalDouble mostrarMediaDeValoresDosVeiculos() {
        return listaVeiculos.stream()
                .mapToDouble(Veiculo::getPreco)
                .average();
    }

    //Aplica um desconto em todos os veículos
    public void veiculosComDesconto(Double porcetagemDesconto) {
        listaVeiculos.forEach(
                veiculo -> {
                    veiculo.setPreco(veiculo.getPreco() - veiculo.getPreco() * (porcetagemDesconto / 100));
                }
        );
        listaVeiculos.forEach(System.out::println);
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
