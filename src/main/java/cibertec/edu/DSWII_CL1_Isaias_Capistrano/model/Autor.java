package cibertec.edu.DSWII_CL1_Isaias_Capistrano.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Setter
@Getter
@Entity
@Table(name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.Identify)
    private Integer idautor;
    private String nomautor;
    private String apeautor;
    private Date fechnautor;

}
