package br.com.wakanda.wakacop.secaovotacao.repository;

import br.com.wakanda.wakacop.secaovotacao.domain.SessaoVotacao;

public interface SessaoAberturaRepository {
    SessaoVotacao criaSessao(SessaoVotacao sessaoVotacao);
}
