package com.zaxxer.sansorm;

import java.sql.Connection;
import java.sql.SQLException;

@FunctionalInterface
public interface SqlClosureVarArgsFuncInterface<T>
{
   T execute(Connection connection, Object... args) throws SQLException;
}