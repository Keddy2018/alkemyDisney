/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recostawalter.disney.servicio;

import com.recostawalter.disney.Enumeradores.PermisosEnumerador;
import com.recostawalter.disney.dto.login.PostLoginDto;
import com.recostawalter.disney.dto.login.PostRegistroDto;
import com.recostawalter.disney.entidad.Usuario;
import com.recostawalter.disney.repositorio.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author recos
 */
@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;
    @Autowired
    JavaMailSenderImpl javaMailSender;

    public void registrarUsuario(PostRegistroDto usuario) {
        Usuario user = new Usuario();
        user.setUser(usuario.getUser());
        user.setMail(usuario.getMail());
        user.setPermiso(PermisosEnumerador.USER);
        String claveEncriptada = new BCryptPasswordEncoder().encode(usuario.getClave());
        user.setClave(claveEncriptada);

        usuarioRepositorio.save(user);

        try {
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setTo(user.getMail());
            msg.setFrom("walterdesarrolloweb@gmail.com");
            msg.setText("Bienbenido !!! " + user.getUser() + ". Ya formas parte del mundo de disney");
            msg.setSubject("REGISTRO CORRECTO");
            javaMailSender.send(msg);

        } catch (MailException e) {
            System.out.println("Mensaje: " + e.getLocalizedMessage());
        }

    }

    public void logearUsuario(PostLoginDto postLoginDto) {
        try {
            Usuario usuario = usuarioRepositorio.buscarUsuarioPorMail(postLoginDto.getMailUser());
            if(usuario != null){
                if(usuario.getClave().equals(postLoginDto.getClave())){
                    loadUserByUsername(usuario.getMail());
                }
            }
        } catch (Exception e) {
            System.out.println("USUARIO O CLAVE INCORRECTA");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepositorio.buscarUsuarioPorMail(mail);

        if (usuario != null) {

            List<GrantedAuthority> permisos = new ArrayList<>();

            //Creo una lista de permisos! 
            GrantedAuthority p1 = new SimpleGrantedAuthority("ROLE_" + PermisosEnumerador.USER);
            //GrantedAuthority p2 = new SimpleGrantedAuthority("ROLE_" + PermisosEnumerador.ADMIN);
            permisos.add(p1);
            //permisos.add(p2);

            //Esto me permite guardar el OBJETO USUARIO LOG, para luego ser utilizado
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usuariosession", usuario); // llave + valor

            User user = new User(usuario.getMail(), usuario.getClave(), permisos);

            return user;

        } else {
            return null;
        }

    }

}
