import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Введите команду: ");
            String command = in.nextLine();
            switch (command){
                case "#write":
                    System.out.print("Введите ваши планы на сегодня: ");
                    String task = in.nextLine();
                    Tools.writeToFile(task);
                    break;
                case "#read":
                    Tools.readFromFile();
                    break;
            }
        }
    }
}