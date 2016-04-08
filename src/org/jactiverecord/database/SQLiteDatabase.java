package org.jactiverecord.database;

import org.jactiverecord.database.configuration.SQLiteDatabaseConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Francis on 9/04/16.
 * Project Jactive-Record.
 */
public class SQLiteDatabase extends Database {

    /**
     * Constructs a new {@link SQLiteDatabase}
     *
     * @param configuration the database configuration object
     */
    public SQLiteDatabase(final SQLiteDatabaseConfiguration configuration) {
        super(configuration);
    }

    public Connection connect() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:" + super.configuration.address);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
