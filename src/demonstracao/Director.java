package demonstracao;

public class Director extends ApprovalHandler {

    private static final double LIMIT = 50_000;

    @Override
    public String handle(Expense expense) {
        if (expense.amount() <= LIMIT) {
            return "Director approved: " + expense.description();
        }
        return super.handle(expense);
    }
}
