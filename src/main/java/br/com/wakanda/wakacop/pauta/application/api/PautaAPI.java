package br.com.wakanda.wakacop.pauta.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pautas")
public interface PautaAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PautaCadastradaResponse cadastrarPauta(@RequestBody NovaPautaRequest novaPauta);
}
