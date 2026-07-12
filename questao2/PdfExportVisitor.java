package questao2;

import java.util.List;

public class PdfExportVisitor implements DocumentVisitor {

    private StringBuilder pdf = new StringBuilder();

    @Override
    public void visit(Paragraph paragraph) {
        pdf.append("[PDF] Texto: ").append(paragraph.getText()).append("\n");
    }

    @Override
    public void visit(Image image) {
        pdf.append("[PDF] Imagem incorporada: ").append(image.getPath()).append("\n");
    }

    @Override
    public void visit(Table table) {
        pdf.append("[PDF] Tabela com ").append(table.getRows().size()).append(" linha(s)\n");
        for (List<String> row : table.getRows()) {
            pdf.append("[PDF]   ").append(String.join(" | ", row)).append("\n");
        }
    }

    public String getResult() {
        return pdf.toString();
    }
}
