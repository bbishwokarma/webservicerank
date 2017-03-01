/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.wsr.jdbc;

import com.wsr.dao.*;
import com.wsr.factory.*;
import com.wsr.dto.*;
import com.wsr.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ServiceCategoryDaoImpl extends AbstractDAO implements ServiceCategoryDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT SC_ID, category_name FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( SC_ID, category_name ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET SC_ID = ?, category_name = ? WHERE SC_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE SC_ID = ?";

	/** 
	 * Index of column SC_ID
	 */
	protected static final int COLUMN_SC_ID = 1;

	/** 
	 * Index of column category_name
	 */
	protected static final int COLUMN_CATEGORY_NAME = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column SC_ID
	 */
	protected static final int PK_COLUMN_SC_ID = 1;

	/** 
	 * Inserts a new row in the service_category table.
	 */
	public ServiceCategoryPk insert(ServiceCategory dto) throws ServiceCategoryDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getScId() );
			stmt.setString( index++, dto.getCategoryName() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			reset(dto);
			return dto.createPk();
		}
		catch (Throwable _e) {
			throw new ServiceCategoryDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the service_category table.
	 */
	public void update(ServiceCategoryPk pk, ServiceCategory dto) throws ServiceCategoryDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getScId() );
			stmt.setString( index++, dto.getCategoryName() );
			stmt.setInt( 3, pk.getScId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
		}
		catch (Throwable _e) {
			throw new ServiceCategoryDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the service_category table.
	 */
	public void delete(ServiceCategoryPk pk) throws ServiceCategoryDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getScId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
		}
		catch (Throwable _e) {
			throw new ServiceCategoryDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the service_category table that matches the specified primary-key value.
	 */
	public ServiceCategory findByPrimaryKey(ServiceCategoryPk pk) throws ServiceCategoryDaoException
	{
		return findByPrimaryKey( pk.getScId() );
	}

	/** 
	 * Returns all rows from the service_category table that match the criteria 'SC_ID = :scId'.
	 */
	public ServiceCategory findByPrimaryKey(int scId) throws ServiceCategoryDaoException
	{
		ServiceCategory ret[] = findByDynamicSelect( SQL_SELECT + " WHERE SC_ID = ?", new Object[] {  new Integer(scId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the service_category table that match the criteria ''.
	 */
	public ServiceCategory[] findAll() throws ServiceCategoryDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY SC_ID", null );
	}

	/** 
	 * Returns all rows from the service_category table that match the criteria 'category_name = :categoryName'.
	 */
	public ServiceCategory[] findWhereCategoryNameEquals(String categoryName) throws ServiceCategoryDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE category_name = ? ORDER BY category_name", new Object[] { categoryName } );
	}

	/**
	 * Method 'ServiceCategoryDaoImpl'
	 * 
	 */
	public ServiceCategoryDaoImpl()
	{
	}

	/**
	 * Method 'ServiceCategoryDaoImpl'
	 * 
	 * @param userConn
	 */
	public ServiceCategoryDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "webservicerank.service_category";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected ServiceCategory fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			ServiceCategory dto = new ServiceCategory();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected ServiceCategory[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			ServiceCategory dto = new ServiceCategory();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		ServiceCategory ret[] = new ServiceCategory[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(ServiceCategory dto, ResultSet rs) throws SQLException
	{
		dto.setScId( rs.getInt( COLUMN_SC_ID ) );
		dto.setCategoryName( rs.getString( COLUMN_CATEGORY_NAME ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(ServiceCategory dto)
	{
	}

	/** 
	 * Returns all rows from the service_category table that match the specified arbitrary SQL statement
	 */
	public ServiceCategory[] findByDynamicSelect(String sql, Object[] sqlParams) throws ServiceCategoryDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Throwable _e) {
			throw new ServiceCategoryDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the service_category table that match the specified arbitrary SQL statement
	 */
	public ServiceCategory[] findByDynamicWhere(String sql, Object[] sqlParams) throws ServiceCategoryDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Throwable _e) {
			throw new ServiceCategoryDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}