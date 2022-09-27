package Java3.PraticaIntegradora1.exercicio2;

public class ImprimirRelatorios implements ImprimirDocumento{
    private static String autor;
    private static int comprimento;
    private static int numeroDePaginas;
    private static String revisor;

    public ImprimirRelatorios(int comprimento, int numeroDePaginas, String autor, String revisor) {
        ImprimirRelatorios.comprimento = comprimento;
        ImprimirRelatorios.numeroDePaginas = numeroDePaginas;
        ImprimirRelatorios.autor = autor;
        ImprimirRelatorios.revisor = revisor;
    }

    public static void imprimir() {
        System.out.println(
                "Autor: " + autor +
                "\nComprimento: " + comprimento +
                "\nNúmero de Páginas: " + numeroDePaginas +
                "\nRevisor: " + revisor + "\n"
        );
    }
}
