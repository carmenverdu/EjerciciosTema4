public class Switch {

    public static void main(String[] args) {
        String estacion = "INVIERNO";

        switch(estacion) {
            case "INVIERNO":
                System.out.println("Es Invierno, abrígate");
                break;
            case "VERANO":
                System.out.println("Es Verano, bebe agua");
                break;
            default:
                System.out.println(estacion);
        }
    }
}