public abstract class MessaggioDecoratore implements Messaggio{
    protected Messaggio messaggio;

    public MessaggioDecoratore(Messaggio messaggio) {
        this.messaggio = messaggio;
    }
}
