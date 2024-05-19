package Strategy.TextEditorExample;

public class LowerCaseFormatter implements ITextFormatter{
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
