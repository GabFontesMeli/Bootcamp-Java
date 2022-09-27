package Java3.PraticaIntegradora1.exercicio2;

import java.util.Arrays;
import java.util.List;

public class Impressora {
    public static void main(String[] args) {

        List<String> habilidades = Arrays.asList("One", "Two", "Three");

        ImprimirCurriculo curriculoDoClebin = new ImprimirCurriculo(
                "Clebin da Silva",
                19,
                habilidades
        );

        ImprimirLivrosEmPDF harryPotter = new ImprimirLivrosEmPDF(
                700,
                "J.K. Rowling",
                "Harry Potter e as Relíquias da Morte",
                "Fantasia"
                );

        ImprimirRelatorios relatorio1 = new ImprimirRelatorios(
                20,
                500,
                "João",
                "Maria"
        );

        curriculoDoClebin.imprimir();
        harryPotter.imprimir();
        relatorio1.imprimir();

    }
}
