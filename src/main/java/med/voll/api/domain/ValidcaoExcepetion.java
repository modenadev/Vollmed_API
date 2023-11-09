package med.voll.api.domain;

public class ValidcaoExcepetion extends RuntimeException {
    public ValidcaoExcepetion(String mensagem) {
        super(mensagem);
    }
}
