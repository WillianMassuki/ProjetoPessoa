package br.com.projeto.Pessoa.pessoa.factory;

import br.com.projeto.Pessoa.pessoa.dto.PessoaDTO;
import br.com.projeto.Pessoa.pessoa.model.Pessoa;
import org.springframework.stereotype.Component;

@Component
public class PessoaFactory {

    public Pessoa createFrom(PessoaDTO pessoaDTO)
    {
        return    Pessoa.builder()
                .nome(pessoaDTO.getNome())
                .dataNascimento(pessoaDTO.getDataNascimento())
                .endereco(pessoaDTO.getEndereco())
                .build();

    }
}
