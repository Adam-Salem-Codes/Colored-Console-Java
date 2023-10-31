
import Console.ColorfulConsole;
// Assuming the library is in a folder named Console
// src/
// App, Console
// src/Console/ColorfulConsole
public class App {
    public static void main(String[] args) throws Exception {
        ColorfulConsole cc = new ColorfulConsole();
        for(int i = 0; i < cc.ALL_COLORS.length; i++)
            cc.println("Hello!", cc.ALL_COLORS[i]);
    }
}
