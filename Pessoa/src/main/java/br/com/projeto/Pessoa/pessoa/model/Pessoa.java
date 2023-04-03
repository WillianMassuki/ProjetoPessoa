package br.com.projeto.Pessoa.pessoa.model;

import br.com.projeto.Pessoa.endereco.model.Endereco;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "tb_pessoa")
@Data
@Builder(toBuilder = true)
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column
    private String nome;

    @Column
    private String dataNascimento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo")
    private Endereco endereco;


}
