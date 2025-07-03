package SistemaOrdini;

public class Main {
    public static void main(String[] args) {
        //costurisco dinamicamente base + formaggio + bacon
        Hamburger ordine = new BaseBurger();
        ordine = new FormaggioDecorator(ordine);
        ordine = new BaconDecorator(ordine);

        System.out.println("Descrizione: " + ordine.getDescrizione());
        System.out.println("Prezzo totale: " + ordine.getPrezzo() + " Euro");
    }
}
