package negocio;

public class MainCarro {
    static void main() { //"psvm" y tab para crear el main automaticamente

        System.out.println("El numero de objetos de tipo Carro creados son: "+Carro.getNumCarros());
        System.out.println("El iva de los vehiculos es: "+Carro.getIva());

        Carro c1 = new Carro(4  ,100);
        Carro c2 = new Carro(-5,-100);
        Carro c3 = new Carro();

        System.out.println("El numero de objetos de tipo Carro creados son: "+Carro.getNumCarros());
        System.out.println("El precio de venta al publico del carro 1 es: "+c1.calcularPrecio(21599));
        /*
        c1.potencia = 2;
        c1.velocidad = 60;
        c2.potencia = 5;
        c2.velocidad = 100;
        c3.potencia = 2;
        c3.velocidad = 60;

        System.out.println("La pontencia del carro es "+c1.potencia+" y la velocidad es "+c1.velocidad);// sout y tab para imprimir

        c1.acelerar();
        c1.acelerar();
        c1.frenar();

        System.out.println("La pontencia del carro es "+c1.potencia+" y la velocidad es "+c1.velocidad);
        System.out.println("La pontencia del carro es "+c2.potencia+" y la velocidad es "+c2.velocidad);
        System.out.println("La pontencia del carro es "+c3.potencia+" y la velocidad es "+c3.velocidad);

        c2.frenar();
        c2.frenar();
        c2.frenar();

        System.out.println("La pontencia del carro es "+c2.potencia+" y la velocidad es "+c2.velocidad);

        c3.acelerar();
        c3.acelerar();
        c3.acelerar();
        c3.acelerar();
        c3.acelerar();

        System.out.println("La pontencia del carro es "+c3.potencia+" y la velocidad es "+c3.velocidad);


         */
   /*
    c1.setVelocidad(100);
    c1.setPotencia(5);

    */

    System.out.println("La pontencia del carro es "+c1.getPotencia()+" y la velocidad es "+c1.getVelocidad());

    System.out.println("La pontencia del carro 2 es "+c2.getPotencia()+" y la velocidad 2 es "+c2.getVelocidad());

/*
    c2.setVelocidad(-5);
    c2.setPotencia(-100);

 */

    }
}
