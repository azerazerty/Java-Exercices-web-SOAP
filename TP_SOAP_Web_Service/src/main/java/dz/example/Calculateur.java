package dz.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService
public class Calculateur {

    @WebMethod(operationName = "add")
    @WebResult(name = "sum")
    public int addition(@WebParam(name = "number1") int a, @WebParam(name = "number2") int b) {
        System.out.println("Je viens d'additionner deux nombres " + a + " et " + b);
        return a + b;
    }

    @WebMethod(operationName = "subtract")
    @WebResult(name = "difference")
    public int soustraction(@WebParam(name = "subs1") int a, @WebParam(name = "subs2") int b) {
        System.out.println("Je viens de soustraire " + b + " de " + a);
        return a - b;
    }

    @WebMethod(operationName = "divide")
    @WebResult(name = "quotient")
    public float division(@WebParam(name = "divide1") int a, @WebParam(name = "divide2") int b) {
        if (b == 0) {
            throw new ArithmeticException("La division sur zéro est non autorisée.");
        }
        System.out.println("Je viens de diviser " + a + " sur " + b);
        return (float) a / b;
    }

    @WebMethod(operationName = "multiply")
    @WebResult(name = "product")
    public int multiplication(@WebParam(name = "factor1") int a, @WebParam(name = "factor2") int b) {
        System.out.println("Je viens de multiplier " + a + " par " + b);
        return a * b;
    }
}
