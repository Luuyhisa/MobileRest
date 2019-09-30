package za.ac.cput.Mob.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
public class SecurityCnfg extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder cutter)
            throws Exception{
        cutter.inMemoryAuthentication()
                .withUser("Lucky")
                .password(encoder().encode("7784"))
                .roles("CEO")
                .and()
                .withUser("YURA")
                .password("7784")
                .roles("CFO");
    }

    @Override
    protected void configure(HttpSecurity http)
            throws Exception{
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST,"restaurant/verifyUse/Warning/**/create/**").hasRole("CEO")
                .anyRequest()
                .authenticated().and()
                .httpBasic()
                .and()
                .csrf()
                .disable()
                .formLogin()
                .disable();

    }
    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }
}