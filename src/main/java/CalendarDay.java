import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.Object;
import  java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int date, int year) {

        String res;
        Calendar cal= Calendar.getInstance();
        cal.set(year,month,date);
        int day=cal.get(Calendar.DAY_OF_WEEK);

        if (day==1){res="Sunday";}
        else if (day==2){res="Monday";}
        else if (day==3){res="Tuesday";}
        else if (day==4){res="Wednesday";}
        else if (day==5){res="Thursday";}
        else if (day==6){res="Friday";}
        else res="Saturday";
        return res;
    }

}

public class CalendarDay {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        Scanner scanner=new Scanner(System.in);

        int month = scanner.nextInt();

        int day = scanner.nextInt();

        int year = scanner.nextInt();

        String res = Result.findDay(month, day, year);
        System.out.println(res);

        scanner.close();

      //bufferedWriter.write(res);
        //bufferedWriter.newLine();

  //      bufferedReader.close();
//        bufferedWriter.close();
    }
}
