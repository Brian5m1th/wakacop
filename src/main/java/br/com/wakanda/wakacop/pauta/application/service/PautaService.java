package br.com.wakanda.wakacop.pauta.application.service;

import br.com.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import br.com.wakanda.wakacop.pauta.domain.Pauta;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public interface PautaService {
    Pauta cadastrarPauta(NovaPautaRequest novaPautaRequest);
    Pauta getPautaPorId(@NotNull UUID idPauta);
}
