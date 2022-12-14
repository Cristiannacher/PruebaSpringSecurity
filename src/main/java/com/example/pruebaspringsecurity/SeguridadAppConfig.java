package com.example.pruebaspringsecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class SeguridadAppConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder usuarios = User.withDefaultPasswordEncoder();
auth.inMemoryAuthentication()
        .withUser(usuarios.username("Juan").password("123").roles("administrador"))
        .withUser(usuarios.username("Antonio").password("123").roles("usuario"));

    }
}
