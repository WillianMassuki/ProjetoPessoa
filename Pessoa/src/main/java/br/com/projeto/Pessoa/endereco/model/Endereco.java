package br.com.projeto.Pessoa.endereco.model;

import br.com.projeto.Pessoa.pessoa.model.Pessoa;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Table(name = "tb_endereco")
@Data
@Builder
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column
    private String lougradouro;

    @Column
    private String cep;

    @Column
    private String numero;

    @Column
    private String cidade;

    @Column
    private Boolean flagEnderecoPrincipal;



}
