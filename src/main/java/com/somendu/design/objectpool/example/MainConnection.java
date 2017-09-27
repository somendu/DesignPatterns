/**
 * 
 */
package com.somendu.design.objectpool.example;

import java.sql.Connection;

/**
 * @author Somendu
 *
 */
public class MainConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Do something...
		// ...

		// Create the ConnectionPool:
		JDBCConnectionPool pool = new JDBCConnectionPool("org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb", "sa",
				"secret");

		// Get a connection:
		Connection con = pool.checkOut();

		// Use the connection
		// ...

		// Return the connection:
		pool.checkIn(con);

	}

}
