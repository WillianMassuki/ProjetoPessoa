package br.com.projeto.Pessoa.pessoa.exception;

public class PessoaJaExistente  extends RuntimeException {

    public PessoaJaExistente(Long id) {
        super(
                String.format(
                        " O codigo da pessoa: %s já está cadastrado. Por favor, inserir outro para prosseguir.",
                        id
                )
        );
    }
}
