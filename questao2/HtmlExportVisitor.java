package questao2;

import java.util.List;

public class HtmlExportVisitor implements DocumentVisitor {

    private StringBuilder html = new StringBuilder();

    @Override
    public void visit(Paragraph paragraph) {
        html.append("<p>").append(paragraph.getText()).append("</p>\n");
    }

    @Override
    public void visit(Image image) {
        html.append("<img src=\"").append(image.getPath())
                .append("\" alt=\"").append(image.getAltText()).append("\" />\n");
    }

    @Override
    public void visit(Table table) {
        html.append("<table>\n");
        for (List<String> row : table.getRows()) {
            html.append("  <tr>");
            for (String cell : row) {
                html.append("<td>").append(cell).append("</td>");
            }
            html.append("</tr>\n");
        }
        html.append("</table>\n");
    }

    public String getResult() {
        return html.toString();
    }
}
