package br.com.projeto.Pessoa.endereco.exception;

public class EnderecoJaExistente extends RuntimeException {

    public EnderecoJaExistente(Long codigo) {
        super(
                String.format(
                        " O codigo deste endereço: %s já está cadastrado. Por favor, inserir outro para prosseguir.",
                        codigo
                )
        );
    }
}
