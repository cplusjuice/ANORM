package com.cplusjuice.anorm;

public enum SqlDriver {
    SQLITE("org.sqlite.JDBC", "jdbc:sqlite:"),
    PG_SQL("org.postgresql.Driver", "jdbc:postgresql:");

    private String driverClass;
    private String driverPrefix;

    SqlDriver(String driverClass, String driverPrefix) {
        this.driverClass  = driverClass;
        this.driverPrefix = driverPrefix;
    }

    protected String getDriverClass() {
        return driverClass;
    }

    protected String getDriverPrefix() {
        return driverPrefix;
    }
}
