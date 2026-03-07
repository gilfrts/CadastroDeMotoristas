package Motoristas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_motoristas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MotoristaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "lotacao")
    private String lotacao;

    @Column(name = "telefone")
    private String telefone;
}
