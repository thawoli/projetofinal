package oliveira.thawany.ProjetoFinal.model;


import lombok.*;
import org.hibernate.annotations.CollectionId;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "pessoas")
public class PessoasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pessoas")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cpf")
    private double cpf;

    @Column(name = "codigo")
    private double codigo;

}