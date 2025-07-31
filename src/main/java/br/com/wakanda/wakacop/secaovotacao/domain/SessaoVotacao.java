package br.com.wakanda.wakacop.secaovotacao.domain;

import br.com.wakanda.wakacop.secaovotacao.application.api.SessaoAberturaRequest;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SessaoVotacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    UUID idSessaoVotacao;
    UUID idPauta;
    Integer tempoDuracao;
    LocalDateTime dataAbertura;

    public SessaoVotacao(SessaoAberturaRequest sessaoAberturaRequest) {
        this.idPauta = sessaoAberturaRequest.getIdPauta();
        this.tempoDuracao = sessaoAberturaRequest.getTempoDuracao().orElse(1)    ;
        this.dataAbertura = LocalDateTime.now();
    }
}
