package org.example.personaapirest.entities;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Domicilio extends BaseEntidad{
    private String calle;
    private int numero;

}
