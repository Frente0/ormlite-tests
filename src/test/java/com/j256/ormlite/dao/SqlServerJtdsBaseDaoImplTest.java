package com.j256.ormlite.dao;

import org.junit.Ignore;
import org.junit.Test;

public class SqlServerJtdsBaseDaoImplTest extends JdbcBaseDaoImplTest {

	@Override
	protected void setDatabaseParams() {
		databaseHost = "wfs2.jprinc.net";
		databaseUrl = "jdbc:jtds:sqlserver://" + databaseHost + ":1433/ormlite;ssl=request";
		userName = "gwatson";
		password = "ormlite";
	}

	@Test
	@Override
	@Ignore
	public void testInsertAutoGeneratedId() throws Exception {
		// sql server needs some special flags to allow inserts into table
	}
}
