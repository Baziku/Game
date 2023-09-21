import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b,c=0;
        do{
            a= (int)(Math.random()*(99+1)) +1;
        }
        while(a==0);
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите целое число из диапозона 1-100");
        if(scn.hasNextInt()){
            do{
                b=scn.nextInt();
                if(b<1||b>100){
                    System.out.println("Вы ввели число не из-заданного диапазона");
                    System.out.println("Попробуй ещё раз");
                }
                else{
                    ++c;
                    if(b==a){
                        System.out.println("Вы угадали с "+c+" попытки");
                    }
                    else{
                        if(b<a)System.out.println("Я сам в шоке, но, загаданное число больше, брат");
                        else System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");

                    }
                }
            }

            while(b!=a);
        }
        else System.out.println("Ошибка. Введено не целое число");

    }
}