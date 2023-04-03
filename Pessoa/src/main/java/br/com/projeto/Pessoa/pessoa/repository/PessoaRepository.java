package br.com.projeto.Pessoa.pessoa.repository;

import br.com.projeto.Pessoa.pessoa.dto.ListarPessoaDTO;
import br.com.projeto.Pessoa.pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query(
            " SELECT " +
                    " new br.com.projeto.Pessoa.pessoa.vo.PessoaVO( " +
                    " pessoa.nome," +
                    " pessoa.dataNascimento " +
                    ") " +
                    " FROM " +
                    " Pessoa pessoa " +
            " JOIN " +
            " pessoa.endereco endereco"
    )
    List<ListarPessoaDTO> findAllPessoa();


    @Query( "SELECT " +
            " pessoa.id " +
            " FROM " +
            " Pessoa pessoa " +
            " WHERE " +
            " pessoa.id = :idPessoa "

    )
    Optional<Long> findIdBy( @Param("idPessoa") Long idPessoa) ;


}
