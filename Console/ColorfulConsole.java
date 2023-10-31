package Console;


public class ColorfulConsole {

    public boolean notification_emojis; // Append an Emoji to each notification?
    public final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public final String BLACK = "\033[0;30m";   // BLACK
    public final String RED = "\033[0;31m";     // RED
    public final String GREEN = "\033[0;32m";   // GREEN
    public final String YELLOW = "\033[0;33m";  // YELLOW
    public final String BLUE = "\033[0;34m";    // BLUE
    public final String PURPLE = "\033[0;35m";  // PURPLE
    public final String CYAN = "\033[0;36m";    // CYAN
    public final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public final String BLACK_BOLD = "\033[1;30m";  // BLACK BOLD
    public final String RED_BOLD = "\033[1;31m";    // RED BOLD
    public final String GREEN_BOLD = "\033[1;32m";  // GREEN BOLD
    public final String YELLOW_BOLD = "\033[1;33m"; // YELLOW BOLD
    public final String BLUE_BOLD = "\033[1;34m";   // BLUE BOLD
    public final String PURPLE_BOLD = "\033[1;35m"; // PURPLE BOLD
    public final String CYAN_BOLD = "\033[1;36m";   // CYAN BOLD
    public final String WHITE_BOLD = "\033[1;37m";  // WHITE BOLD

    // Underline
    public final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK UNDERLINED
    public final String RED_UNDERLINED = "\033[4;31m";    // RED UNDERLINED
    public final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN UNDERLINED
    public final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW UNDERLINED
    public final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE UNDERLINED
    public final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE UNDERLINED
    public final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN UNDERLINED
    public final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE UNDERLINED

    // Background
    public final String BLACK_BACKGROUND = "\033[40m";  // BLACK BACKGROUND
    public final String RED_BACKGROUND = "\033[41m";    // RED BACKGROUND
    public final String GREEN_BACKGROUND = "\033[42m";  // GREEN BACKGROUND
    public final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW BACKGROUND
    public final String BLUE_BACKGROUND = "\033[44m";   // BLUE BACKGROUND
    public final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE BACKGROUND
    public final String CYAN_BACKGROUND = "\033[46m";   // CYAN BACKGROUND
    public final String WHITE_BACKGROUND = "\033[47m";  // WHITE BACKGROUND

    // High Intensity
    public final String BLACK_BRIGHT = "\033[0;90m";  // BLACK BRIGHT
    public final String RED_BRIGHT = "\033[0;91m";    // RED BRIGHT
    public final String GREEN_BRIGHT = "\033[0;92m";  // GREEN BRIGHT
    public final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW BRIGHT
    public final String BLUE_BRIGHT = "\033[0;94m";   // BLUE BRIGHT
    public final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE BRIGHT
    public final String CYAN_BRIGHT = "\033[0;96m";   // CYAN BRIGHT
    public final String WHITE_BRIGHT = "\033[0;97m";  // WHITE BRIGHT

    // Bold High Intensity
    public final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK BOLD BRIGHT
    public final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED BOLD BRIGHT
    public final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN BOLD BRIGHT
    public final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW BOLD BRIGHT
    public final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE BOLD BRIGHT
    public final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE BOLD BRIGHT
    public final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN BOLD BRIGHT
    public final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE BOLD BRIGHT

    // High Intensity backgrounds
    public final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK BACKGROUND BRIGHT
    public final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED BACKGROUND BRIGHT
    public final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN BACKGROUND BRIGHT
    public final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW BACKGROUND BRIGHT
    public final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE BACKGROUND BRIGHT
    public final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE BACKGROUND BRIGHT
    public final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN BACKGROUND BRIGHT
    public final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE BACKGROUND BRIGHT

    public String[] ALL_COLORS = {
        RESET,
        BLACK,
        RED,
        GREEN,
        YELLOW,
        BLUE,
        PURPLE,
        CYAN,
        WHITE,

        BLACK_BOLD,
        RED_BOLD,
        GREEN_BOLD,
        YELLOW_BOLD,
        BLUE_BOLD,
        PURPLE_BOLD,
        CYAN_BOLD,
        WHITE_BOLD,

        BLACK_UNDERLINED,
        RED_UNDERLINED,
        GREEN_UNDERLINED,
        YELLOW_UNDERLINED,
        BLUE_UNDERLINED,
        PURPLE_UNDERLINED,
        CYAN_UNDERLINED,
        WHITE_UNDERLINED,

        BLACK_BACKGROUND,
        RED_BACKGROUND,
        GREEN_BACKGROUND,
        YELLOW_BACKGROUND,
        BLUE_BACKGROUND,
        PURPLE_BACKGROUND,
        CYAN_BACKGROUND,
        WHITE_BACKGROUND,

        BLACK_BRIGHT,
        RED_BRIGHT,
        GREEN_BRIGHT,
        YELLOW_BRIGHT,
        BLUE_BRIGHT,
        PURPLE_BRIGHT,
        CYAN_BRIGHT,
        WHITE_BRIGHT,
        
        BLACK_BOLD_BRIGHT,
        RED_BOLD_BRIGHT,
        GREEN_BOLD_BRIGHT,
        YELLOW_BOLD_BRIGHT,
        BLUE_BOLD_BRIGHT,
        PURPLE_BOLD_BRIGHT,
        CYAN_BOLD_BRIGHT,
        WHITE_BOLD_BRIGHT,
        
        BLACK_BACKGROUND_BRIGHT,
        RED_BACKGROUND_BRIGHT,
        GREEN_BACKGROUND_BRIGHT,
        YELLOW_BACKGROUND_BRIGHT,
        BLUE_BACKGROUND_BRIGHT,
        PURPLE_BACKGROUND_BRIGHT,
        CYAN_BACKGROUND_BRIGHT,
        WHITE_BACKGROUND_BRIGHT
    };
    public void println(String string, String color) { 
        System.out.println(color + string);
        restore();
    }
    public void print(String string, String color) {
        System.out.print(color + string);
        restore();
    }
    public void printlnError(String string){
        //Automatically prints BOLD + RED
        
        print(string, RED_BOLD);
        if(notification_emojis)
            System.out.println(" ❌");
        restore();
    }
    public void printError(String string){
        // Automatically prints BOLD + RED
        print(string, RED_BOLD);
        if(notification_emojis)
            System.out.print(" ❌");
        restore();
    }
    public void printlnSuccess(String string){
        // Automatically prints BOLD + GREEN
        print(string, GREEN_BOLD);
        if(notification_emojis)
            System.out.println(" ✅");
        restore();
    }
    public void printSuccess(String string){
        // Automatically prints BOLD + GREEN
        print(string, GREEN_BOLD);
        if(notification_emojis)
            System.out.print(" ✅");
        restore();
    }
    public void printlnInfo(String string){
        // Automatically prints BOLD + BLUE
        print(string, BLUE_BOLD);
        if(notification_emojis)
            System.out.println(" 📘");
        restore();
    }
    public void printInfo(String string){
        // Automatically prints BOLD + BLUE
        print(string, BLUE_BOLD);
        if(notification_emojis)
            System.out.print(" 📘");
        restore();
    }
    public void printlnWarning(String string){
        // Automatically prints BOLD + YELLOW
        print(string, YELLOW_BOLD);
        if(notification_emojis)
            System.out.println(" ⚠");
        restore();
    }
    public void printWarning(String string){
        // Automatically prints BOLD + YELLOW
        print(string, YELLOW_BOLD);
        if(notification_emojis)
            System.out.print(" ⚠");
        restore();
    }
    public void changeColor(String color) {
        System.out.print(color);
        restore();
    }
    public String colorize(String string, String color) {
        return color + string + RESET;
    }

    public void restore() {
        System.out.print(RESET);
    }
    public void set_emojis(boolean set){
        notification_emojis = set;
    }

}

