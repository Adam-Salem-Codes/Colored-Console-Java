import Console.ColorfulConsole;

public class App {
    public static void main(String[] args) throws Exception {
        ColorfulConsole cc = new ColorfulConsole();
        cc.set_emojis(true);
        cc.printlnError("A Fatal Error has occurred");
        cc.printlnWarning("Warning: A Fatal Error has occurred");
        cc.printlnInfo("Just thought you should know a fatal error has occurred");
        cc.printlnSuccess("Task failed successfully!");
    }
}
