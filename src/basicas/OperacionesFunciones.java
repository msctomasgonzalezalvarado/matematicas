package basicas;

public class OperacionesFunciones {

    private OperacionesBasicas fbasico;
    public OperacionesFunciones(){
        fbasico=new OperacionesBasicas();
    }

    public double formulaGeneral(double a, double b, double c){
        double numerador;
        double denominador;
        double adentro;
        double raiz;
        double x1;

        adentro=fbasico.resta(fbasico.potencia(b,2) , fbasico.multiplicacion(4,a,c));

        raiz=fbasico.raiz(adentro);
        numerador=fbasico.suma(-b,raiz);
        denominador=fbasico.multiplicacion(2,a);
        x1=fbasico.division(numerador,denominador);
    }

}
