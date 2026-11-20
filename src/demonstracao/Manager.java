package demonstracao;

public class Manager extends ApprovalHandler {

    private static final double LIMIT = 10_000;

    @Override
    public String handle(Expense expense) {
        if (expense.amount() <= LIMIT) {
            return "Manager approved: " + expense.description();
        }
        return super.handle(expense);
    }
}
