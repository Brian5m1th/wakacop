package br.com.wakanda.wakacop.secaovotacao.application.api;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Value;

import java.util.Optional;
import java.util.UUID;

@Value
@Builder
public class SessaoAberturaRequest {
    @NotNull
    UUID idPauta;
    Integer tempoDuracao;

    public Optional<Integer> getTempoDuracao() {
        return Optional.ofNullable(this.tempoDuracao);
    }
}
