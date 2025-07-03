public class DecoratoreMaiuscolo extends MessaggioDecoratore{
    public DecoratoreMaiuscolo(Messaggio messaggio) {
        super(messaggio);
    }

    @Override
    public String getContenuto() {
        return messaggio.getContenuto().toUpperCase();
    }
}
