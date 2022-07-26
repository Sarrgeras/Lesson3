package lesson;

import java.util.Scanner;

public class Main {

    public static void menu(){
        Task_1 task_1 = new Task_1();
        Task_2 task_2 = new Task_2();
        Task_3 task_3 = new Task_3();
        Task_4 task_4 = new Task_4();
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
                task_1.task1();
                break;
            case 2:
                task_2.task2();
                break;
            case 3:
                task_3.task3();
                break;
            case 4:
                task_4.task4();
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
