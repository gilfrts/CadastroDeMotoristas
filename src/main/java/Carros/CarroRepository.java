package Carros;

import Viagem.ViagemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<CarroModel, Long> {
}
