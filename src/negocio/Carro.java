package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    //atributo de clase

    private static int numCarros = 0;

    public Carro(int potencia, double velocidad){

        /*
        this.potencia = potencia;
        this.velocidad = velocidad;

         */

        //si los atributos tienen validaciones utlizo el set()
        setPotencia(potencia);
        setVelocidad(velocidad);
        numCarros++;
    }

    public Carro() {
        // valores por asigancion 0 (this.potencia = 0), pero si piden se debe asignar un valor (this.potencia = 2)

        numCarros++;

    }

    /*
    Ingreso de informacion
    metodos set()
    "siempre" es void
    siempre recibe un parametro
    parametro generalmente es del mismo tipo de atributo
 */
    public void setPotencia(int potencia) {
       // almacenar solo si el dato es correcto
        if (potencia > 0)
            this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        //actualizar si el dato es correcto sino setear el valor
        if(velocidad < 0)
            velocidad = 0;
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

    public static int getNumCarros(){
        return numCarros;
    }

    public void acelerar(){

        velocidad += potencia;
    }

    void frenar(){

        velocidad /= 2;
    }
}
