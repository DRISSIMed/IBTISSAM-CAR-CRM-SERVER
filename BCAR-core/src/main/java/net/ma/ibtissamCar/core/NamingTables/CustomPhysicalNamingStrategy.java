package net.ma.ibtissamCar.core.NamingTables;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CustomPhysicalNamingStrategy  extends SpringPhysicalNamingStrategy {
    public static final Map<String, String> prefixMapper = new HashMap<String, String>() {{

        put("Car", "BCAR_");
        put("TypeCar", "BCAR_");
        put("RangeCar", "BCAR_");
        put("Comment","BCAR_");
        put("Client","BCAR_");
        put("Reservation","BCAR_");
        put("Appartement","BCAR_");

    }};

    @Override
    public Identifier toPhysicalTableName(final Identifier identifier, final JdbcEnvironment jdbcEnv) {
        String name = super.toPhysicalTableName(identifier, jdbcEnv).getText();
        return Identifier.toIdentifier(prefixMapper.get(identifier.getText()) + name);
    }
}
