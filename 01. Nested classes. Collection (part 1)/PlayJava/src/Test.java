
import java.util.Scanner;

class Test {

    public static void main(String[] args) {
        String saveResult;
        saveResult = initStart();
        boolean trick = CheckInitStart(saveResult);
        if (trick) {
            WorkWithArray worker = new WorkWithArray();
            ConstantText view = new ConstantText();
            Controller controller = new Controller(worker, view);
            controller.processUser();
        }
    }


    public static String initStart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Good afternoon, do you want to play the game of more-less? Y/N");

        String startInit = scanner.nextLine();
        return startInit;
    }


    static boolean CheckInitStart(String startInit) {
        String check;
        if (startInit.equals("Y") || startInit.equals("y")) {
            System.out.println("TYt");
            return true;
        } else if (startInit.equals("N") || startInit.equals("n")) {
            System.out.println("Oh,okay...I tried...");
            return false;
        } else {
            System.out.println("Please enter a valid value");
            check = initStart();
            CheckInitStart(initStart());
            return false;
        }

    }
}
