package by.itclass.configs;

import by.itclass.model.entities.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan("by.itclass")
public class ConfigApp {
    @Bean
    public ViewResolver viewResolver() {
        var resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public Configuration configuration() {
        var config = new Configuration();
        config.addAnnotatedClass(User.class);
        return config;
    }

    @Bean
    public SessionFactory sessionFactory(Configuration configuration) {
        var factory = configuration.buildSessionFactory();
        return factory;
    }
}
