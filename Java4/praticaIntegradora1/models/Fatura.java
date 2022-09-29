package Java4.praticaIntegradora1.models;

import java.util.List;

public class Fatura {
    private String codigo;
    private Cliente cliente;
    private List<Item> itens;
    private double total = 0;

    public Fatura(Cliente cliente, List<Item> itens, String codigo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.itens = itens;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public double getTotal() {
        this.itens.forEach(i -> this.total += (i.getPrecoUnitario() * i.getQuantidade()));
        return this.getTotal();
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                ", total=" + total +
                '}';
    }
}
