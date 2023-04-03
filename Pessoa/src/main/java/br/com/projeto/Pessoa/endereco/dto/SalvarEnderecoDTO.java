package br.com.projeto.Pessoa.endereco.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
@RequiredArgsConstructor
public class SalvarEnderecoDTO {

    @NotNull
    private Long codigo;

    @NotNull
    @Length(max = 50)
    private String lougradouro;

    @NotNull
    @Length(max = 50)
    private String cep;

    @NotNull
    @Length(max = 50)
    private String numero;

    @NotNull
    @Length(max = 50)
    private String cidade;

    @NotNull
    @Length(max = 50)
    private Boolean flagEnderecoPrincipal;
}
