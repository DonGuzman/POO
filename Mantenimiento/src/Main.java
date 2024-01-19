/*MIEMBROS DEL EQUIPO
EMMANUEL ROMERO GUZMAN
JOVANNY MENDEZ POPOCATL
ADRIAN LAGUNA RODRIGUEZ
*/
import POO.Auto;
public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Auto auto2 = new Auto();
        Auto auto3 = new Auto();

        auto.setMarca("Tsuru");
        auto.setModelo("2013");
        auto.setColor("Negro");

        auto2.setAnio(3);
        auto2.setPlacas("COME4ME");
        auto2.setCilindros(2);

        auto3.setPuertos(4);
        auto3.setKm(4.6f);
        auto3.setConsumo(20.4f);

        System.out.println("Atributos del auto 1");
        System.out.println("Marca:"+auto.getMarca());
        System.out.println("Modelo:"+auto.getModelo());
        System.out.println("Color:"+auto.getColor());
        System.out.println("Atributos del auto 2");
        System.out.println("Anio:"+auto2.getAnio());
        System.out.println("Placas:"+auto2.getPlacas());
        System.out.println("Numero de cilindros:"+auto2.getCilindros());
        System.out.println("Atributos del auto 3");
        System.out.println("Numero de puertas:"+auto3.getPuertos());
        System.out.println("Kilometraje:"+auto3.getKm());
        System.out.println("Consumo:"+auto3.getConsumo());
    }
}