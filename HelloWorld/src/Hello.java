/**
 * Created by Christian Thompson on 5/4/2017.
 */
public class Hello {
    public static void main(String[] args){

        System.out.println("Hello Christian!");

        int myFirstNum = (10 + 5) + (8 * 10);
        int mySecondNum = 80;
        int myThirdNum = myFirstNum * 2;

        int myTotal = myFirstNum + mySecondNum + myThirdNum;
        int subTotal = 1000-myTotal;

        int thousandPlace = myTotal / 1000;
        int hundredPlace = myTotal / 100;
        int onesPlace = myTotal / 10;

        System.out.println("myTotal = " + myTotal);
        System.out.println("the difference of myTotal from " +
                           "a thousand = " + subTotal);

        System.out.println("there are " + thousandPlace +
                           " thousandPlace in myTotal");
        System.out.println("there are " + hundredPlace +
                           " hundredPlace in myTotal");
        System.out.println("there are " + onesPlace +
                           " onesPlace in myTotal");
        System.out.println(myFirstNum);
    }
}