package br.com.projeto.Pessoa.endereco.repository;

import br.com.projeto.Pessoa.endereco.model.Endereco;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Query( "SELECT " +
            " endereco.id " +
            " FROM " +
            " Endereco endereco " +
            " WHERE " +
            " endereco.id = :idEndereco "

    )
    Optional<Long> findIdBy(@Param("idEndereco") Long idEndereco) ;

}
