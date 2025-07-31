package br.com.wakanda.wakacop.secaovotacao.application.api;

import br.com.wakanda.wakacop.secaovotacao.application.service.SessaoVotacaoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;

@Controller
@Log4j2
@RequiredArgsConstructor
public class SessaoVotacaoController implements SessaoVotacaoAPI {
    private final SessaoVotacaoService sessaoVotacaoService;
    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[start] SessaoVotacaoController - abreSessao");
        SessaoAberturaResponse sessao = sessaoVotacaoService.abreSessao(sessaoAberturaRequest);
        log.info("[finish] SessaoVotacaoController - abreSessao");
        return sessao;
    }
}
