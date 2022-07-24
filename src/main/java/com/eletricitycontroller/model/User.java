package com.eletricitycontroller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @NotEmpty(message = "Name can't be empty or null")
    private String name;
    @Column(unique = true)
    @NotEmpty(message = "Login can't be empty  or null")
    private String login;
    @NotEmpty(message = "Password can't be empty  or null")
    private String password;
    private String apiKey;

    @ManyToOne
    private UserExpense userExpenses;
}
