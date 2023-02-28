import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            //обработка  разных случаев

            printMenu(); //еще раз печатаем меню перед завершением прошлого действия
            userInput = scanner.nextInt();
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu(){

    }

}

public class StepTracker {

    HashMap<Integer, MonthData> monthToData = new HashMap<Integer, MonthData>();

    public StepTracker() {
        for (int i=0;i<12;i++) {
            monthToData.put(i, new MonthData());
        }

    }

    class MonthData {

    }

    class Converter {

    }

}