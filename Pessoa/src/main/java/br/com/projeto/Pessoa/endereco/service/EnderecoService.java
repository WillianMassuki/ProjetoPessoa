package br.com.projeto.Pessoa.endereco.service;

import br.com.projeto.Pessoa.endereco.dto.SalvarEnderecoDTO;
import br.com.projeto.Pessoa.endereco.exception.EnderecoJaExistente;
import br.com.projeto.Pessoa.endereco.factory.EnderecoFactory;
import br.com.projeto.Pessoa.endereco.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    private final EnderecoFactory enderecoFactory;

    public Long salvar(SalvarEnderecoDTO salvarEnderecoDTO) {

        this.enderecoRepository.findIdBy(
                salvarEnderecoDTO.getCodigo()
        ).ifPresent(idEndereco -> {
                    throw new EnderecoJaExistente(salvarEnderecoDTO.getCodigo());
                }
        );

        return this.enderecoRepository.save(
                this.enderecoFactory.createFrom(salvarEnderecoDTO)
        ).getCodigo();
    }
}
