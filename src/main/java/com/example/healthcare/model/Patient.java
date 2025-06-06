
package com.example.healthcare.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double temperature;
    private Integer heartRate;
    private Integer oxygenLevel;
    private LocalDateTime timestamp = LocalDateTime.now();
}
