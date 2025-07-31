package br.com.wakanda.wakacop.secaovotacao.application.service;

import br.com.wakanda.wakacop.secaovotacao.application.api.SessaoAberturaRequest;
import br.com.wakanda.wakacop.secaovotacao.application.api.SessaoAberturaResponse;
import br.com.wakanda.wakacop.secaovotacao.domain.SessaoVotacao;
import br.com.wakanda.wakacop.secaovotacao.repository.SessaoAberturaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {
    private final SessaoAberturaRepository sessaoVotacaoRepository;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[start] SessaoVotacaoApplicationService - abreSessao");
        SessaoVotacao sessao = sessaoVotacaoRepository.criaSessao(new SessaoVotacao(sessaoAberturaRequest));
        log.info("[finish] SessaoVotacaoApplicationService - abreSessao");
        return new SessaoAberturaResponse(sessao);
    }
}
