package questao2;

import java.util.List;

public class WordCountVisitor implements DocumentVisitor {

    private int total = 0;

    @Override
    public void visit(Paragraph paragraph) {
        total += countWords(paragraph.getText());
    }

    @Override
    public void visit(Image image) {
        total += countWords(image.getAltText());
    }

    @Override
    public void visit(Table table) {
        for (List<String> row : table.getRows()) {
            for (String cell : row) {
                total += countWords(cell);
            }
        }
    }

    private int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }

    public int getTotal() {
        return total;
    }
}
