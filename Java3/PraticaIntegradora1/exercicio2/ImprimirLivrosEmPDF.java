package Java3.PraticaIntegradora1.exercicio2;

public class ImprimirLivrosEmPDF implements ImprimirDocumento {
    private static String titulo;
    private static String nomeDoAutor;
    private static String genero;
    private static int numeroDePaginas;

    public ImprimirLivrosEmPDF(int numeroDePaginas, String nomeDoAutor, String titulo, String genero) {
        ImprimirLivrosEmPDF.numeroDePaginas = numeroDePaginas;
        ImprimirLivrosEmPDF.nomeDoAutor = nomeDoAutor;
        ImprimirLivrosEmPDF.titulo = titulo;
        ImprimirLivrosEmPDF.genero = genero;
    }

    public static void imprimir() {
        System.out.println(
                "Título: " + titulo +
                "\nNome do Autor: " + nomeDoAutor +
                "\nGênero: " + genero +
                "\nNumero de Páginas: " + numeroDePaginas + "\n"
        );
    }
}
