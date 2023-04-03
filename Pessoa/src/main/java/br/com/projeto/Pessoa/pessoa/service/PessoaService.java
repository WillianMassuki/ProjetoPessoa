package br.com.projeto.Pessoa.pessoa.service;

import br.com.projeto.Pessoa.pessoa.dto.AlteracaoPessoaDTO;
import br.com.projeto.Pessoa.pessoa.dto.ListarPessoaDTO;
import br.com.projeto.Pessoa.pessoa.dto.PessoaDTO;
import br.com.projeto.Pessoa.pessoa.exception.PessoaJaExistente;
import br.com.projeto.Pessoa.pessoa.factory.PessoaFactory;
import br.com.projeto.Pessoa.pessoa.model.Pessoa;
import br.com.projeto.Pessoa.pessoa.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    private final PessoaFactory pessoaFactory;

    public List<ListarPessoaDTO> getAll() {
        return this.pessoaRepository.findAllPessoa();
    }

    public Optional<Pessoa> detalhar(Long IdProduto) {
        return this.pessoaRepository.findById(IdProduto);
    }

    public Long salvar(PessoaDTO pessoaSalvarDTO) {

        this.pessoaRepository.findIdBy(
                pessoaSalvarDTO.getId()
        ).ifPresent(idPrograma -> {
                    throw new PessoaJaExistente(pessoaSalvarDTO.getId());
                }
        );

        return this.pessoaRepository.save(
                this.pessoaFactory.createFrom(pessoaSalvarDTO)
        ).getId();
    }

    public Optional<Long> alterar(Long id, AlteracaoPessoaDTO alteracaoPessoaDTO)
    {
        return this.pessoaRepository.findById(id)
                .map(pessoa ->
                        pessoa.toBuilder()
                                .nome(alteracaoPessoaDTO.getNome())
                                .dataNascimento(alteracaoPessoaDTO.getDataNascimento())
                                .build()
                ).map(this.pessoaRepository::save)
                .map(Pessoa::getId);
    }

}
