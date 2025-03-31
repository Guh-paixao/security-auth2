package br.com.gustavo.springsecurity.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_roles")
@Data
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;
    private String name;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum Values {
        ADMIN(1L),
        BASIC(2L);

        Long roleId;
    }
}
