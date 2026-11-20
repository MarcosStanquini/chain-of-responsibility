package demonstracao;

public abstract class ApprovalHandler {

    private ApprovalHandler next;

    public ApprovalHandler setNext(ApprovalHandler next) {
        this.next = next;
        return next;
    }

    public String handle(Expense expense) {
        if (next == null) {
            return "REJECTED: " + expense.description();
        }
        return next.handle(expense);
    }
}
