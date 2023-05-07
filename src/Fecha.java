import java.util.Scanner;

public class Fecha {
    int Days;
    int Months;
    int Years;
    void crear(int d, int m, int y)
    {
        Days=d;
        Months=m;
        Years=y;
    }
    Fecha incrementar(int ubi, int inc)
    {
        int x;
        int y;
        int z;
        float cociente;
        Fecha F1=new Fecha();

        switch (ubi)
        {
            case 1:
            F1.crear(x,Months,Years);
            break;

            case 2:
            x= inc+Months;
            F1.crear(Days,x,Years);
            break;

            case 3:
            x= inc+Years;
            F1.crear(Days,Months,x);
            break;

            default:
                System.out.print("No es valido");
                F1.crear(Days,Months,Years);
                break;

        }
        return F1;

    }

    Fecha Diferencia(Fecha F1)
    {
        Fecha F2=new Fecha();
        F2=9;
        return F2;
    }

}
