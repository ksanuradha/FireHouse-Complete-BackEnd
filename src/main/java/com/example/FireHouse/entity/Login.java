package com.example.FireHouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "login")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Login {
    @Id
    @Column(name = "user_name", length = 100)
    private String userName;

    @Column(name = "password", length = 100)
    private String password;
}
