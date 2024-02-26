package arreglos;
import basicas.*;

public class OperacionesArreglos {

    private OperacionesBasicas ba;

    public OperacionesArreglos(){
        ba = new OperacionesBasicas();
    }
    public int suma(){
        int a;
        int b;
        int sum;
        a=10;
        b=15;

        sum=ba.suma(a,b);
    }
}
