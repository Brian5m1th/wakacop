package br.com.wakanda.wakacop.secaovotacao.infra;

import br.com.wakanda.wakacop.secaovotacao.domain.SessaoVotacao;
import br.com.wakanda.wakacop.secaovotacao.repository.SessaoAberturaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class SessaoAberturaInfraRepository implements SessaoAberturaRepository {
    private final SessaoVotacaoSpringDataJPARepository sessaoVotacaoSpringDataJPARepository;

    @Override
    public SessaoVotacao criaSessao(SessaoVotacao sessaoVotacao) {
        log.info("[start] SessaoAberturaInfraRepository - criaSessao");
        SessaoVotacao sessao = sessaoVotacaoSpringDataJPARepository.save(sessaoVotacao);
        log.info("[finish] SessaoAberturaInfraRepository - criaSessao");
        return sessao;
    }
}
