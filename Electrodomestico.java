/***********************
Electrodomestico.java

Alexis René Olivares Cabrera
This super class contains attributes and methods to
inherit the subclasses in order to obtain a result from an electrical appliance
***********************/
public class Electrodomestico {

  //Constantes
    public final static String ColorDefault="blanco";
    public final static char ConsumoEnergeticoDefault='F';
    public final static double PrecioBaseDefault=100;
    public final static double PesoDefault=5;

    //Attributes

    public double precioBase;
    public String color;
    public char consumoEnergetico;
    public double peso;

    //Methods

    private void comprobarColor(String color){

        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;

        for(int i=0;i<colores.length && !encontrado;i++){ // encontrado=variable para comprobar el color disponible

            if(colores[i].equals(color)){
                encontrado=true;
            }

        }

        if(encontrado){
            this.color=color;
        }else{
            this.color=ColorDefault;
        }
    }

    public void comprobarConsumoEnergetico(char consumoEnergetico){

        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=ConsumoEnergeticoDefault;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double precioFinal(){
        double acu=0;//acumulador
        switch(consumoEnergetico){
            case 'A':
                acu+=100;
                break;
            case 'B':
                acu+=80;
                break;
            case 'C':
                acu+=60;
                break;
            case 'D':
                acu+=50;
                break;
            case 'E':
                acu+=30;
                break;
            case 'F':
                acu+=10;
                break;
        }

        if(peso>=0 && peso<19){
            acu+=10;
        }else if(peso>=20 && peso<49){
            acu+=50;
        }else if(peso>=50 && peso<=79){
            acu+=80;
        }else if(peso>=80){
            acu+=100;
        }

        return precioBase+acu;
    }

    //Builders
    public Electrodomestico(){
        this(PrecioBaseDefault, PesoDefault, ConsumoEnergeticoDefault, ColorDefault);
    }

    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, ConsumoEnergeticoDefault, ColorDefault);
    }

    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
}
