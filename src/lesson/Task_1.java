package lesson;

import java.lang.ref.SoftReference;

public class Task_1 {
    public Task_1(){

    }
    public void task1(){
        int month = 1;
        String winter = "Зима";
        String spring = "Весна";
        String autumn = "Осень";
        String summer = "Лето";
        if (month > 2 && month < 12){
            if (month > 2 && month < 6){
                System.out.println(spring);
            }
            else if(month > 5 && month < 9){
                System.out.println(summer);
            }
            else if (month > 8 && month < 12){
                System.out.println(autumn);
            }
        }
        else {
            System.out.println(winter);
        }


        Main.menu();
    }
}
