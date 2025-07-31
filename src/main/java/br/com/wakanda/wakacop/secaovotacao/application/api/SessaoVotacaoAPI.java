package br.com.wakanda.wakacop.secaovotacao.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessao/abertura")
public interface SessaoVotacaoAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
}
