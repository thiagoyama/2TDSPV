package br.com.fiap.aula04.exercicio.swagger;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
    info = @Info(
            title = "API de gerenciamento do Blog",
            description = "Especificação dos endpoints da gestão de FIAP Blog",
            version = "1.0",
            contact = @Contact(name = "Thiago", email = "profthiagoy@fiap.com.br")
    ),
        security = @SecurityRequirement(name = "bearerJWT")
)
@SecurityScheme(
        name = "bearerJWT",
        description = "Autenticação por Token JWT",
        scheme = "bearer",
        bearerFormat = "JWT",
        type = SecuritySchemeType.HTTP,
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
