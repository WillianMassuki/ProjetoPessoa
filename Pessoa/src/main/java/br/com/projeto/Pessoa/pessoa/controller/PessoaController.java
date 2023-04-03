package br.com.projeto.Pessoa.pessoa.controller;

import br.com.projeto.Pessoa.pessoa.dto.AlteracaoPessoaDTO;
import br.com.projeto.Pessoa.pessoa.dto.ListarPessoaDTO;
import br.com.projeto.Pessoa.pessoa.dto.PessoaDTO;
import br.com.projeto.Pessoa.pessoa.model.Pessoa;
import br.com.projeto.Pessoa.pessoa.service.PessoaService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;

    @GetMapping(produces = "application/json")
    @Operation(summary = "Lista todas as pessoas")
    public List<ListarPessoaDTO> listAll() {
        return this.pessoaService.getAll();
    }

    @GetMapping("{pessoaId}")
    @Operation(summary = "Lista a pessoa pelo codigo")
    public ResponseEntity<Pessoa> detalhar(@PathVariable Long pessoaId)
    {
        return  ResponseEntity.of(this.pessoaService.detalhar(pessoaId));
    }

    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui uma nova pessoa")
    public ResponseEntity<Long> salvarPessoa(
            @RequestBody PessoaDTO pessoaSalvarDTO
    ) {
        return ResponseEntity.ok(this.pessoaService.salvar(pessoaSalvarDTO));
    }

    @PutMapping(value = "/{pessoaId}", produces = "application/json")
    @Operation(summary = "Atualiza os dados da pessoa")
    public ResponseEntity<Long> editar(
            @PathVariable Long pessoaId,
            @Valid @RequestBody AlteracaoPessoaDTO alteracaoPessoaDTO
    ) {
        return ResponseEntity.of(this.pessoaService.alterar(pessoaId, alteracaoPessoaDTO));

    }
}
