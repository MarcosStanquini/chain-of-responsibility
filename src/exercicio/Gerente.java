package exercicio;

public class Gerente extends SupportHandler {

    @Override
    public String handle(Ticket ticket) {
        if (ticket.severity() == Severity.CRITICAL) {
            return "Gerente resolveu: " + ticket.description();
        }
        return super.handle(ticket);
    }
}
