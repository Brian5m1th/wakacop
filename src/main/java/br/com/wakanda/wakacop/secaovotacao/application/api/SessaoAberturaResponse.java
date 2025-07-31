package br.com.wakanda.wakacop.secaovotacao.application.api;

import br.com.wakanda.wakacop.secaovotacao.domain.SessaoVotacao;
import lombok.Value;

import java.util.UUID;

@Value
public class SessaoAberturaResponse {
    UUID idSessaoVotacao;

    public SessaoAberturaResponse(SessaoVotacao sessao) {
        this.idSessaoVotacao = sessao.getIdSessaoVotacao();
    }
}
