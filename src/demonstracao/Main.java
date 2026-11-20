package demonstracao;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApprovalHandler chain = new Supervisor();
        chain.setNext(new Manager()).setNext(new Director());

        List<Expense> expenses = List.of(
                new Expense("Office supplies", 350),
                new Expense("New laptops", 8_500),
                new Expense("Server cluster", 42_000),
                new Expense("New building", 2_000_000)
        );

        for (Expense expense : expenses) {
            System.out.println(chain.handle(expense));
        }
    }
}
