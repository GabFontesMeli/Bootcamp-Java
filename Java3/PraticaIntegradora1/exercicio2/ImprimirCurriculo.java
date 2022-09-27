package Java3.PraticaIntegradora1.exercicio2;

import java.util.List;

public class ImprimirCurriculo implements ImprimirDocumento {
    private static String nome;
    private static int idade;
    private static List<String> habilidades;

    public ImprimirCurriculo(String nome, int idade, List<String> habilidades) {
        ImprimirCurriculo.nome = nome;
        ImprimirCurriculo.idade = idade;
        ImprimirCurriculo.habilidades = habilidades;
    }

    public static void imprimir() {
        System.out.println(
                "Nome: " + nome +
                "\n" + "Idade: " + idade +
                "\nHabilidades: " + habilidades + "\n"
        );
    }
}
