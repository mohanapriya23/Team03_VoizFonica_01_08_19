package com.example.voizfonica.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.*;

@Document
@Data
public class Register {
    @Id
    private String id;

    @NotBlank(message = "Name is required")
    @Size(min = 5, message = "Enter a valid name")
    @Pattern(regexp = "[A-Za-z]*", message = "Enter a valid name")
    private String name;

    @NotBlank(message = "Password is required")
    @Size(min = 5, message = "Enter a valid password")
    private String password;

    @NotBlank(message = "Password is required")
    @Size(min = 5, message = "Enter a valid password")
    private String cpassword;

    @NotBlank(message = "email is mandatory")
    @Email(message = "Enter the correct mail")
    private String email;

}
