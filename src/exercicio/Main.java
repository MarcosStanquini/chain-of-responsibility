package exercicio;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Ticket> chamados = List.of(
                new Ticket("Esqueci minha senha", Severity.LOW),
                new Ticket("Erro ao emitir boleto", Severity.MEDIUM),
                new Ticket("Sistema lento para todos", Severity.HIGH),
                new Ticket("Vazamento de dados", Severity.CRITICAL)
        );

        System.out.println("--- Cadeia completa ---");
        atender(cadeiaCompleta(), chamados);

        System.out.println();
        System.out.println("--- Desafio: cadeia sem o Especialista ---");
        atender(cadeiaSemEspecialista(), chamados);

        System.out.println();
        System.out.println("O chamado HIGH agora retorna \"Chamado não suportado\".");
        System.out.println("Ele passa pelo Bot, pelo Atendente e pelo Gerente, e nenhum deles trata HIGH.");
        System.out.println("Como o Gerente é o último elo e não tem próximo, o chamado chega ao fim da cadeia"
                + " e cai no comportamento padrão do SupportHandler.");
    }

    private static SupportHandler cadeiaCompleta() {
        SupportHandler cadeia = new Bot();
        cadeia.setNext(new Atendente())
                .setNext(new Especialista())
                .setNext(new Gerente());
        return cadeia;
    }

    private static SupportHandler cadeiaSemEspecialista() {
        SupportHandler cadeia = new Bot();
        cadeia.setNext(new Atendente())
                .setNext(new Gerente());
        return cadeia;
    }

    private static void atender(SupportHandler cadeia, List<Ticket> chamados) {
        for (Ticket chamado : chamados) {
            System.out.println(cadeia.handle(chamado));
        }
    }
}
