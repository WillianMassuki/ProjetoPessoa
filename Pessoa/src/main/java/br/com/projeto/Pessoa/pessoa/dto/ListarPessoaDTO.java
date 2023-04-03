package br.com.projeto.Pessoa.pessoa.dto;

import br.com.projeto.Pessoa.endereco.model.Endereco;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class ListarPessoaDTO {

    private String nome;

    private String dataNascimento;

}