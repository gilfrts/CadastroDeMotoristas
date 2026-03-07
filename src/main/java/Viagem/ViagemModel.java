package Viagem;

import Carros.CarroModel;
import Motoristas.MotoristaModel;
import Paciente.PacienteModel;

import java.time.LocalDate;

public class ViagemModel {

    private Long id;
    private LocalDate data;
    private String destino;

    private PacienteModel paciente;
    private MotoristaModel motorista;
    private CarroModel carro;
}
