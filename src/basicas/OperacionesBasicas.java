package basicas;
import java.lang.*;

public class OperacionesBasicas {

    public double suma(double a, double b){
        double c;
        c=a+b;
        return  c;
    }

    public  double resta(double a, double b){
        return  a-b;
    }

    public  double division(double a, double b){
        return a/b;
    }

    public double raiz(double n){
        return Math.sqrt(n);
    }

    public double potencia(double n, double pot){
        return Math.pow(n,pot);
    }

    public double multiplicacion(double a, double b, double c){
        return a*b*c;
    }

    public double multiplicacion(double a, double b){
        return a*b;
    }

    public int multiplicacion(int a, int b){
        return a*b;
    }
}
