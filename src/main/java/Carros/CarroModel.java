package Carros;

import Motoristas.MotoristaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_carros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "placa")
    private String placa;

    @OneToOne
    private MotoristaModel motorista;
}
