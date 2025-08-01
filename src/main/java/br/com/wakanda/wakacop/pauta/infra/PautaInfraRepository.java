package br.com.wakanda.wakacop.pauta.infra;

import br.com.wakanda.wakacop.handler.APIException;
import br.com.wakanda.wakacop.pauta.domain.Pauta;
import br.com.wakanda.wakacop.pauta.repository.PautaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Log4j2
@Repository
@RequiredArgsConstructor
public class PautaInfraRepository implements PautaRepository {
    private final PautaSpringDataJPARepository pautaSpringDataJPARepository;

    @Override
    public Pauta save(Pauta pauta) {
        log.info("[start] PautaInfraRepository - save");
        Pauta novaPauta = pautaSpringDataJPARepository.save(pauta);
        log.info("[finish] PautaInfraRepository - save");
        return novaPauta;
    }

    @Override
    public Pauta getPautaPorId(UUID idPauta) {
        log.info("[start] PautaInfraRepository - getPautaPorId");
        Pauta pauta = pautaSpringDataJPARepository.findById(idPauta)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND , "Pauta Nao Encontrada" + idPauta));
        log.info("[finish] PautaInfraRepository - getPautaPorId");
        return pauta;
    }
}
