package demonstracao;

public class VicePresident extends ApprovalHandler {

    private static final double LIMIT = 200_000;

    @Override
    public String handle(Expense expense) {
        if (expense.amount() <= LIMIT) {
            return "Vice-president approved: " + expense.description();
        }
        return super.handle(expense);
    }
}
