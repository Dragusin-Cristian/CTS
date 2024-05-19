package Strategy.TextEditorExample;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new UpperCaseFormatter());

        String text = "This is the text";

        System.out.println(textEditor.formatText(text));

        textEditor.setFormatter(new LowerCaseFormatter());

        System.out.println(textEditor.formatText(text));
    }
}
