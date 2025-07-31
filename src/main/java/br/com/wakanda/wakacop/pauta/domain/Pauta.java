package br.com.wakanda.wakacop.pauta.domain;

import br.com.wakanda.wakacop.pauta.application.api.NovaPautaRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@ToString
@Getter
@NoArgsConstructor
public class Pauta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    UUID idPauta;
    String titulo;
    String descricao;
    UUID idAssociadoAutor;
    LocalDateTime dataCriacao;

    public Pauta(NovaPautaRequest novaPautaRequest) {
        this.titulo = novaPautaRequest.getTitulo();
        this.descricao = novaPautaRequest.getDescricao();
        this.idAssociadoAutor = novaPautaRequest.getIdAssociadoAutor();
        this.dataCriacao = LocalDateTime.now();
    }


}
