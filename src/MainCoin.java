import java.util.Random;

public class MainCoin {


    public static void main(String agrs[]){


        Random rand = new Random();
        int heads = 0 , tails = 0 , a ;

        for (int i = 1; i <=100; i++){

            a = rand.nextInt(2)+ 1;

            
            if (a == 1){
                tails ++;
            }else{
                heads ++;
            }
        }

        System.out.println("The Number of heads is " + heads );
        System.out.println("The Numbers of tails is " + tails);


    }
}
