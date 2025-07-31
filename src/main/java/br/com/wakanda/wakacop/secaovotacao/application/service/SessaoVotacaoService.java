package br.com.wakanda.wakacop.secaovotacao.application.service;

import br.com.wakanda.wakacop.secaovotacao.application.api.SessaoAberturaRequest;
import br.com.wakanda.wakacop.secaovotacao.application.api.SessaoAberturaResponse;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
}
