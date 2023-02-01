import java.util.Scanner;


/**
 * Create by xuefeng on 2023.1.29
 */

public class LearnScanner {

    void learnScannerNext() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Next方式接收：");
        if(userInput.hasNext()) {
            String getUserInput = userInput.next();
            System.out.println("输入的数据：" + getUserInput);
        }
        userInput.close();
    }

    void learnScannerNextLine() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("NextLine方式接收：");
        if(userInput.hasNextLine()){
            String getUserInput = userInput.nextLine();
            System.out.println("输入的数据：" + getUserInput);
        }
        userInput.close();
    }

    public static void main(String[] args) {
        LearnScanner ls = new LearnScanner();
        // 以下两者运行其一看差别
        ls.learnScannerNext();
        // ls.learnScannerNextLine();
    }
}
