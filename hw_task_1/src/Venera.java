/**
 * Created by VLADIMIR on 12.03.2017.
 */
public class Venera {


    public static void main(String args[])
    throws java.io.IOException
    {

        double weight;
        //double per = 0.1;
        double vweight;
        System.out.println("Введите Ваш вес в кг");
        weight = (double)  System.in.read();

        vweight =  (weight / 100);

        System.out.println("Ваш вес на Венере ориентировочно равен "+vweight+" кг");






    }
}