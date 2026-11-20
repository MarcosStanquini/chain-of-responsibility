package exercicio;

public abstract class SupportHandler {

    private SupportHandler next;

    public SupportHandler setNext(SupportHandler next) {
        this.next = next;
        return next;
    }

    public String handle(Ticket ticket) {
        if (next == null) {
            return "Chamado não suportado";
        }
        return next.handle(ticket);
    }
}
