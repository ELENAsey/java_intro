public class TextEditor {
    private StringBuilder text;
    public TextEditor() {
        text = new StringBuilder();
    }
    public void addText(String newText) {
        text.append(newText);
    }
    public void displayText() {
        System.out.println(text.toString());
    }
    public static void main(String args[]){
        TextEditor editor = new TextEditor();

        editor.addText("JAVA - ");
        editor.addText(" это");
        editor.addText(" жесть");

        editor.displayText();
    }
}
