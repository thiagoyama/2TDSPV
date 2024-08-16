package br.com.fiap.aula04.exercicio.security;

import br.com.fiap.aula04.exercicio.repository.UsuarioRepository;
import br.com.fiap.aula04.exercicio.service.TokenService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //Recuperar o token JWT da requisição
        String token = request.getHeader("Authorization");
        //Validar se o token existe
        if (token != null){
            //Tirar a palavra "Bearer" do token
            token = token.replace("Bearer ", "");
            //Recuperar o usuário do token
            var subject = tokenService.getSubject(token);
            //Pesquisar o usuário no banco de dados
            var usuario = usuarioRepository.findByLogin(subject);
            //Criar o Token de autenticacao
            var autenticationToken = new UsernamePasswordAuthenticationToken(usuario,
                                                        null, usuario.getAuthorities());
            //Setar a autenticacao no contexto
            SecurityContextHolder.getContext().setAuthentication(autenticationToken);
        }
        //Chamar o próximo filtro
        filterChain.doFilter(request, response);
    }
}
