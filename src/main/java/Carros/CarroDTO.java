package Carros;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CarroDTO {

    private Long id;
    private String modelo;
    private String placa;

}
