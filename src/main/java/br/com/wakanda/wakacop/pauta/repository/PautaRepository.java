package br.com.wakanda.wakacop.pauta.repository;

import br.com.wakanda.wakacop.pauta.domain.Pauta;

import java.util.UUID;

public interface PautaRepository {
    Pauta save(Pauta pauta);
    Pauta getPautaPorId(UUID idPauta);
}
