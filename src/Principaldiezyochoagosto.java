import java.util.Scanner;
public class Principaldiezyochoagosto {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int inc;
        int ubi;
        Fecha F1;
        F1=new Fecha();
        F1.crear(18,8,2017);
        System.out.print(F1.Days+"/"+F1.Months+"/"+F1.Years+"\n");
        System.out.print("\nIncrementar dias (1), mes (2) o años (3)");
        ubi=sc.nextInt();
        System.out.print("\nCuanto quiere incrementar?\n");
        inc=sc.nextInt();
        Fecha F2=F1.incrementar(ubi,inc);
        System.out.print(F2.Days+"/"+F2.Months+"/"+F2.Years);


    }
}
