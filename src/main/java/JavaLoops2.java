import java.util.*;
import java.io.*;

class JavaLoops2{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<=n-1;j++){
                int x=(int)Math.pow(2,j);
                int c=a;
                int sum=(a+x*b);
                System.out.printf("%d ",sum);
                a=sum;
            }
            System.out.println("");
        }
        in.close();
    }
}

