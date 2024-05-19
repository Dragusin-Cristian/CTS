package Strategy.TextEditorExample;

public class TextEditor {
    private ITextFormatter formatter;

    public TextEditor(ITextFormatter formatter){
        this.formatter = formatter;
    }

    public void setFormatter(ITextFormatter formatter){
        this.formatter = formatter;
    }

    public String formatText(String text){
        return this.formatter.format(text);
    }

}
