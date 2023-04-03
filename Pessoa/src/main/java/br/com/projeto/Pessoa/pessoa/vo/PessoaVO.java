package br.com.projeto.Pessoa.pessoa.vo;

import br.com.projeto.Pessoa.endereco.vo.EnderecoVO;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import java.util.List;

@Data
@RequiredArgsConstructor
public class PessoaVO {

    private final String nome;

    private final String dataNascimento;



}
