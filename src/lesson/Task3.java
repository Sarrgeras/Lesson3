package lesson;

import java.util.Scanner;

public class Task3 {
    public Task3(){

    }
    public void task3(){
        System.out.println("Введите сумму денег.");
        int sum = 0;
        Scanner in = new Scanner(System.in);
        sum = in.nextInt();
        if (sum == 1 || sum % 10 == 1){
            System.out.println(sum + " рубль.");
        }
        else if((sum > 1 && sum < 5) || (sum % 10 == 2 || sum % 10 == 3 || sum % 10 == 4)){
            System.out.println(sum + " рубля.");
        }
        else {
            System.out.println(sum + " рублей.");
        }
        Main.menu();
    }
}
