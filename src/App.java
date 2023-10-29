import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class App {
    static String Line[] ={"plane","ship","name","marks","book","google","is",
            "the","loves","plan","owner","computer","system","function","code","typing","keyboard","scan"};

                // we can also add more words...

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Check your speed hear");
        System.out.println();
        System.out.println("these are the word you type....");
        Scanner div = new Scanner(System.in);

        for (int a =  1; a <= 3;a++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(a);}
        {
            System.out.println("GET READY!!!");
            System.out.println();
            System.out.println("HEAR IS YOUR WORDS TO TYPE...");
            System.out.println();
        }

        Random rand =  new Random();
        for (int b = 0;b <= 7; b++ ) {
            System.out.print(Line[rand.nextInt(Line.length)] + " ");
        }{
            System.out.println();
            System.out.println();
            System.out.println("Start Typing...");
        }

        //for print a new line
        System.out.println();
        //getting exact second of the day that we are currently at
        double start = LocalTime.now().getSecond();
        String words = div.nextLine();
        double interval =  start;
        interval = Math.abs(interval);
        System.out.println(interval);
        //result logic here  ::
        if (interval <= 10) {
            System.out.println("YOUR TYPING SPEED IS fast");
        }
        else if (interval > 10 && interval <=15){
            System.out.println("YOUR TYPING SPEED IS AVERAGE ");
        }
        else if (interval > 15 ){
            System.out.println("TYPING IS TOO SLOW");
            System.out.println("YOU NEED TO PRACTICE HARD!");
        }
        //calculating speed -
        double wps =  (interval/words.length());
        System.out.println("word per second = "  +wps);



        }

    }
