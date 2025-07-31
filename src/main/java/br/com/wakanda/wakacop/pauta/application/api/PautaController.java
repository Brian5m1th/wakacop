package br.com.wakanda.wakacop.pauta.application.api;

import br.com.wakanda.wakacop.pauta.application.service.PautaService;
import br.com.wakanda.wakacop.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;

@Log4j2
@Controller
@RequiredArgsConstructor
public class PautaController implements PautaAPI {
    private final PautaService pautaService;

    @Override
    public PautaCadastradaResponse cadastrarPauta(NovaPautaRequest novaPautaRequest) {
        log.info("[start] PautaController - cadastrarPauta");
        Pauta novaPauta = pautaService.cadastrarPauta(novaPautaRequest);
        log.info("[finish] PautaController - cadastrarPauta");
        return new PautaCadastradaResponse(novaPauta);
    }
}
