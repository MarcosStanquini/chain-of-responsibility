package exercicio;

public class Atendente extends SupportHandler {

    @Override
    public String handle(Ticket ticket) {
        if (ticket.severity() == Severity.MEDIUM) {
            return "Atendente resolveu: " + ticket.description();
        }
        return super.handle(ticket);
    }
}
