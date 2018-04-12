/***********************
Televicion.java

Alexis René Olivares Cabrera
This class contains attributes and buldiers the
an appliance called television
***********************/
public class Television extends Electrodomestico{

    //Constante
    private final static int ResolucionDefault=20;

    //Attributes

    private int resolucion;
    private boolean sintonizadorTDT;

    //Methods
    public double precioFinal(){
        //Invocamos el método precioFinal del método Electrodomestico
        double acu=super.precioFinal();

        //Añadimos el codigo para el atributo resolucion
        if (resolucion>40){
            acu+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            acu+=50;
        }

        return acu;
    }

    //Buldiers
    public Television(){
        this(PrecioBaseDefault, PesoDefault, ConsumoEnergeticoDefault, ColorDefault, ResolucionDefault, false);
    }

    public Television(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefault, ColorDefault, ResolucionDefault, false);
    }

    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}
