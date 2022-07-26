package lesson;

import java.util.Scanner;

public class Task4 {
    public Task4(){

    }
    public void task4(){
        System.out.println("Введите год.");
        int year= 0;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if (year % 4 == 0){
            if (year % 400 == 0 && year % 100 == 0){
                System.out.println("Год - високосный!");

            }
            else if (year % 100 == 0){
                System.out.println("Год - не високосный");
            }
        }
        else {
            System.out.println("Год - не високосный!");
        }
        Main.menu();
    }
}
