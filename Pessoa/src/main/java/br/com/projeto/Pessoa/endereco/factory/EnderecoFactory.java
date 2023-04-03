package br.com.projeto.Pessoa.endereco.factory;

import br.com.projeto.Pessoa.endereco.dto.SalvarEnderecoDTO;
import br.com.projeto.Pessoa.endereco.model.Endereco;
import org.springframework.stereotype.Component;

@Component
public class EnderecoFactory {

    public Endereco createFrom(SalvarEnderecoDTO salvarEnderecoDTO)
    {
        return    Endereco.builder()
                .lougradouro(salvarEnderecoDTO.getLougradouro())
                .cep(salvarEnderecoDTO.getCep())
                .numero(salvarEnderecoDTO.getNumero())
                .cidade(salvarEnderecoDTO.getCidade())
                .flagEnderecoPrincipal(salvarEnderecoDTO.getFlagEnderecoPrincipal())
                .build();

    }


}
