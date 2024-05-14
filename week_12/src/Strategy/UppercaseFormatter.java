package Strategy;

public class UppercaseFormatter implements TextFormatter{
    public String format(String text){
        return text.toUpperCase();
    }
}
