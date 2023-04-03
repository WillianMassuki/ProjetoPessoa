package br.com.projeto.Pessoa.endereco.controller;

import br.com.projeto.Pessoa.endereco.dto.SalvarEnderecoDTO;
import br.com.projeto.Pessoa.endereco.service.EnderecoService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/endereco")
@RequiredArgsConstructor
public class EnderecoController {

    private final EnderecoService enderecoService;

    @PostMapping(produces = "application/json")
    @Operation(summary = "Inclui um novo endereco")
    public ResponseEntity<Long> salvarPessoa(
            @RequestBody SalvarEnderecoDTO salvarEnderecoDTO
    ) {
        return ResponseEntity.ok(this.enderecoService.salvar(salvarEnderecoDTO));
    }
}
