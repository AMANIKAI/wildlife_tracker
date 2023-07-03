package ke.co.safaricom.database;

import org.sql2o.Sql2o;

public class Database {
    private static final Sql2o connection = new Sql2o(

            "jdbc:postgresql://localhost:5432/animals_tracker",
            "postgres",
            "IloveJesus2023"
    );
    public static Sql2o getConnect() { return connection; }
}
