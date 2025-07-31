package br.com.wakanda.wakacop.pauta.application.service;

import br.com.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import br.com.wakanda.wakacop.pauta.domain.Pauta;

public interface PautaService {
    Pauta cadastrarPauta(NovaPautaRequest novaPautaRequest);
}
