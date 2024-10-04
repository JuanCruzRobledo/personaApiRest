package org.example.personaapirest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Autor extends BaseEntidad {
    private String nombre;
    private String apellido;
    @Column(length = 1500)
    private String  biografia;

}
