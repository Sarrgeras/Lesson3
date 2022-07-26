package lesson;

public class Task2 {
    public Task2(){

    }
    public void task2(){
        int number = 123;
        if (number % 10 == 3){
            System.out.println("Число заканчивается числом 3");
        }
        else {
            System.out.println("Число не заканчивается на число 3");
        }

        Main.menu();
    }
}
