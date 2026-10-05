package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    /*
    Ingreso de informacion
    metodos set()
    "siempre" es void
    siempre recibe un parametro
    parametro generalmente es del mismo tipo de atributo
 */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    /*
    sacar información
    get()
    siempre retorna valor
    el tipo de retorno generalmente es del mismo tipo del atributo
    si el metodo es void no retorna nada
     */

    public int getPotencia() {
        return potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void acelerar(){

        velocidad += potencia;
    }

    void frenar(){

        velocidad /= 2;
    }
}
