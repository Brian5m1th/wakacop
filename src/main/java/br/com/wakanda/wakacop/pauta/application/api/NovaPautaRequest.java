package br.com.wakanda.wakacop.pauta.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Value
public class NovaPautaRequest {
    @NotBlank
    String titulo;
    @NotBlank
    String descricao;
    @NotBlank
    UUID idAssociadoAutor;
    @DateTimeFormat
    LocalDateTime dataCriacao;
}
