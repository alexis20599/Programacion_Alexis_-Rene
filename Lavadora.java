/***********************
Lavadora.java

Alexis René Olivares Cabrera
This class contains attributes and buldiers the
a household appliance called a washing machine
***********************/
public class Lavadora extends Electrodomestico{

  //Attributes
    private final static int CargaDefault=5;
    private int carga;

    public int getCarga() {
        return carga;
    }

    public double precioFinal(){
        //Invocamos el método precioFinal del método Electrodomestico
        double acu=super.precioFinal();

        //añadí codigo de carga
        if (carga>30){
            acu+=50;
        }

        return acu;
    }

    //Buldiers
    public Lavadora(){
        this(PrecioBaseDefault, PesoDefault, ConsumoEnergeticoDefault, ColorDefault, CargaDefault);
    }

    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefault, ColorDefault, CargaDefault);
    }

    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}
