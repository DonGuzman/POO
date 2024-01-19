/*MIEMBROS DEL EQUIPO
EMMANUEL ROMERO GUZMAN
JOVANNY MENDEZ POPOCATL
ADRIAN LAGUNA RODRIGUEZ
*/
package POO;
public class Auto {
    //Atributos de la clase Auto
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private String placas;
    private int cilindros;
    private int puertos;
    private float km;
    private float consumo;
    private float litrosgas;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public float getLitrosgas() {
        return litrosgas;
    }

    public void setLitrosgas(float litrosgas) {
        this.litrosgas = litrosgas;
    }
}
