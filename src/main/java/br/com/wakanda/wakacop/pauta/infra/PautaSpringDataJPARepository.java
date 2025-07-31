package br.com.wakanda.wakacop.pauta.infra;

import br.com.wakanda.wakacop.pauta.domain.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PautaSpringDataJPARepository extends JpaRepository<Pauta, UUID> {
}
