package dev.practice.exercises;

public class  Exercise10 {

    private static final int VIEW_PROFILE = 1;
    private static final int VIEW_SETTINGS = 2;
    private static final int HELP = 3;
    private static final int EXIT = 4;

    public static void run() {
        int[] simulatedChoices = {VIEW_PROFILE, VIEW_SETTINGS, HELP, 99, EXIT};

        for (int choice : simulatedChoices) {
            printMenu();
            boolean shouldContinue = handleMenuOption(choice);

            if (!shouldContinue) {
                break;
            }
        }
    }

    public static void printMenu() {
        // TODO: Print all menu options.
        System.out.println("1. View Profile\n2. View Settings\n3. Help\n4. Exit");
    }

    public static boolean handleMenuOption(int option) {
        // TODO: Print a different message for each option.
        switch(option)
        {
            case 1:
                System.out.println("Viewing profile...");
                break;
            case 2:
                System.out.println("Viewing settings...");
                break;
            case 3:
                System.out.println("Help section...");
                break;
            case 4:
                System.out.println("Exiting...");
                return false;
            default:
                System.out.println("Invalid option. Please try again.");
        }
        // Return false when the user chooses EXIT.
        return true;
    }
}
