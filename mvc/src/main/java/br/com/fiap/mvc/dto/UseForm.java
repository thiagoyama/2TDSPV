package br.com.fiap.mvc.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class UseForm {

    private String username;
    private String password;
    private List<String> roles;
}
