package org.example.personaapirest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Persona extends BaseEntidad {

    private String nombre;
    private String apellido;
    private int dni;


}
