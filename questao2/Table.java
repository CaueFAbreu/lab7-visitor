package questao2;

import java.util.List;

public class Table implements DocumentElement {

    private List<List<String>> rows;

    public Table(List<List<String>> rows) {
        this.rows = rows;
    }

    public List<List<String>> getRows() {
        return rows;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
