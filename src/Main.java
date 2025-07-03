public class Main {
    public static void main(String[] args) {
        Messaggio semplice = new MessaggioBase();
        Messaggio decorato = new DecoratoreMaiuscolo(semplice);

        System.out.println("Messaggio originale: " + semplice.getContenuto());
        System.out.println("Messaggio decorato: " + decorato.getContenuto());
    }
}
