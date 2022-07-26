package lesson;

import java.util.Scanner;

public class Main {

    public static void menu(){
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        System.out.println("***Меню***");
        System.out.println("Выберите пункт: ");
        System.out.println("1. Задание 1.");
        System.out.println("2. Задание 2.");
        System.out.println("3. Задание 3.");
        System.out.println("4. Задание 4.");
        System.out.println("0. Выход.");
        int ch = 0;
        Scanner in = new Scanner(System.in);
        ch = in.nextInt();
        switch (ch){
            case 1:
                task1.task1();
                break;
            case 2:
                task2.task2();
                break;
            case 3:
                task3.task3();
                break;
            case 4:
                task4.task4();
                break;
            case 0:
                break;
            default:
                System.out.println("Выберите верный пункт!");
        }

    }
    public static void main(String args[]){
        menu();
    }
}
