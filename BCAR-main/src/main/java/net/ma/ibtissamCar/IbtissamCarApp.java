package net.ma.ibtissamCar;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@SpringBootApplication
public class IbtissamCarApp {

    public static void main(String[] args) {
        SpringApplication.run(IbtissamCarApp.class, args);
    }
/*  @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
  }*/

    //Testing connection with server database
    @Bean
    DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setMaximumPoolSize(2);
        config.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        config.setJdbcUrl("jdbc:sqlserver://DESKTOP-LF57B2N\\SQLEXPRESS;databaseName=ibtissamCar;encrypt=true;trustServerCertificate=true");
        config.setUsername("sa");
        config.setPassword("Mohamed123456");
        return new HikariDataSource(config);
    }

    @Test
    public void test1() throws SQLException {
        try (Connection connection = this.dataSource().getConnection()) {

            System.out.println("catalog:" + connection.getCatalog());
        }
    }

}
