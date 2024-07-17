package es.cic.curso.ejercicio004;

public class Reloj {
    
    private Calculadora calculadora;
    
    public int calcularMinutoDelDia(int hora, int minuto){
        int minutosHora = calculadora.multiplicar(hora, 60);
        int minutosDelDia = calculadora.sumar(minuto, minutosHora);
        return minutosDelDia;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }


    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}
