package br.com.projeto.Pessoa.endereco.vo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EnderecoVO {

    private final Long codigo;

    private final String lougradouro;

    private final String cep;

    private final String numero;

    private final String cidade;
}
