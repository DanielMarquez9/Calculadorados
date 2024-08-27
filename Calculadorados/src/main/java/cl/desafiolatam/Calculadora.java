package cl.desafiolatam;

public class Calculadora {
    /**
     * Suma dos números
     * @param num1 primer número
     * @param num2 segundo número
     * @return resultado de la suma
     */
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Resta dos números
     * @param num1 primer número
     * @param num2 segundo número
     * @return resultado de la resta
     */
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplica dos números
     * @param num1 primer número
     * @param num2 segundo número
     * @return resultado de la multiplicación
     */
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divide dos números
     * @param num1 primer número
     * @param num2 segundo número
     * @return resultado de la división
     * @throws ArithmeticException si se intenta dividir entre cero
     */
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return num1 / num2;
    }
}