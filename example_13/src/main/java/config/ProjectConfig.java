package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"beans","services","implementation"})
@ComponentScan(basePackageClasses= {beans.Vehicle.class, beans.Person.class})
public class ProjectConfig {

}
