import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String[] localeLang={"en","en","zh","fr"};
        String[] localeCountry={"US","IN","CN","FR"};
        String[] country={"US","India","China", "France"};
        for(int i=0; i<localeCountry.length;i++){

            Locale locale = new Locale(localeLang[i],localeCountry[i]);
            NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
            String money=nf.format(payment);
            System.out.println(country[i]+": "+ money);
         }

    }



}
