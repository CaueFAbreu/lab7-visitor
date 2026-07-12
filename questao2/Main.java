package questao2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Document document = new Document();
        document.addElement(new Paragraph("Este e um documento de exemplo."));
        document.addElement(new Image("logo.png", "Logo da empresa"));
        document.addElement(new Table(Arrays.asList(
                Arrays.asList("Nome", "Idade"),
                Arrays.asList("Ana", "23"),
                Arrays.asList("Bruno", "31")
        )));
        document.addElement(new Paragraph("Fim do documento."));

        HtmlExportVisitor htmlExporter = new HtmlExportVisitor();
        document.accept(htmlExporter);
        System.out.println("=== Exportacao HTML ===");
        System.out.println(htmlExporter.getResult());

        PdfExportVisitor pdfExporter = new PdfExportVisitor();
        document.accept(pdfExporter);
        System.out.println("=== Exportacao PDF ===");
        System.out.println(pdfExporter.getResult());

        WordCountVisitor wordCounter = new WordCountVisitor();
        document.accept(wordCounter);
        System.out.println("=== Contagem de palavras ===");
        System.out.println("Total de palavras: " + wordCounter.getTotal());
    }
}
