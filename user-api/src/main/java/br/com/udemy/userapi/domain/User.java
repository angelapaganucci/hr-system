package br.com.udemy.userapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.EqualsAndHashCode.Include;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "TB_USER")
public class User {

    @Id
    @Include
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    private BigDecimal hourlyPrice;

}
