package br.com.wakanda.wakacop.pauta.application.service;

import br.com.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import br.com.wakanda.wakacop.pauta.domain.Pauta;
import br.com.wakanda.wakacop.pauta.repository.PautaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Log4j2
@RequiredArgsConstructor
@Service
public class PautaApplicationService implements PautaService {
    private final PautaRepository pautaRepository;

    @Override
    public Pauta cadastrarPauta(NovaPautaRequest novaPautaRequest) {
        log.info("[start] PautaApplicationService - cadastrarPauta");
        Pauta pauta = pautaRepository.save(new Pauta(novaPautaRequest));
        log.info("[finish] PautaApplicationService - cadastrarPauta");
        return pauta;
    }

    @Override
    public Pauta getPautaPorId(UUID idPauta) {
        log.info("[start] PautaApplicationService - getPautaPorId");
       Pauta pauta = pautaRepository.getPautaPorId(idPauta);
        log.info("[finish] PautaApplicationService - getPautaPorId");
        return pauta;
    }
}
