package demonstracao;

public class Supervisor extends ApprovalHandler {

    private static final double LIMIT = 1_000;

    @Override
    public String handle(Expense expense) {
        if (expense.amount() <= LIMIT) {
            return "Supervisor approved: " + expense.description();
        }
        return super.handle(expense);
    }
}
