package Strategy.TextEditorExample;

public class UpperCaseFormatter implements ITextFormatter{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
