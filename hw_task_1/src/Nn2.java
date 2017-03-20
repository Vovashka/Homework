/**
 * Created by VLADIMIR on 12.03.2017.
 */
public class Nn2 {
    public static void main (String [] args ){
        int a = 22;

        int sum = 0;

        while(a != 0){
            //Суммирование цифр числа
            sum = sum + (a % 10);
            a=a/10;
        }
        System.out.println(sum + " ");



    }

}
