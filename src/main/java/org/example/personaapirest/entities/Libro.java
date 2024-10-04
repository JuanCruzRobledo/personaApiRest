package org.example.personaapirest.entities;

import jakarta.persistence.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Libro extends BaseEntidad{
    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;
    private String autor;

}
