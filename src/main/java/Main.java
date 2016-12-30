import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printTitle();
        titleWait();
        System.out.println("You wake up on a beach.");
    }

    private static void printTitle() {
        String banner = "___________      .__     ___________              __   \n" +
                "\\_   _____/_____ |__| ___\\__    ___/___ ___  ____/  |_ \n" +
                " |    __)_\\____ \\|  |/ ___\\|    |_/ __ \\\\  \\/  /\\   __\\\n" +
                " |        \\  |_> >  \\  \\___|    |\\  ___/ >    <  |  |  \n" +
                "/_______  /   __/|__|\\___  >____| \\___  >__/\\_ \\ |__|  \n" +
                "        \\/|__|           \\/           \\/      \\/       ";
        System.out.println(banner);
    }

    private static void titleWait() {
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        clearScreen();
    }

    private static void clearScreen() {

    }
}
