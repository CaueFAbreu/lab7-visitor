package questao2;

public class Image implements DocumentElement {

    private String path;
    private String altText;

    public Image(String path, String altText) {
        this.path = path;
        this.altText = altText;
    }

    public String getPath() {
        return path;
    }

    public String getAltText() {
        return altText;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
