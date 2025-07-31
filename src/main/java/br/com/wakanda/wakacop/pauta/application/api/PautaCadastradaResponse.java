package br.com.wakanda.wakacop.pauta.application.api;

import br.com.wakanda.wakacop.pauta.domain.Pauta;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

import java.util.UUID;

@Value
@Getter
public class PautaCadastradaResponse {
    UUID idPauta;

    public PautaCadastradaResponse(Pauta pauta) {
        this.idPauta = pauta.getIdPauta();
    }

}
