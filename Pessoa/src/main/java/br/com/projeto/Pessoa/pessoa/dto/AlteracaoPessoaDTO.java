package br.com.projeto.Pessoa.pessoa.dto;

import br.com.projeto.Pessoa.endereco.model.Endereco;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
@RequiredArgsConstructor
public class AlteracaoPessoaDTO {

    @NotNull
    private Long id;

    @NotNull
    @Length(max = 100)
    private String nome;

    @NotNull
    private String dataNascimento;
}
