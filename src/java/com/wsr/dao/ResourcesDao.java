/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.wsr.dao;

import com.wsr.dto.*;
import com.wsr.exceptions.*;

public interface ResourcesDao
{
	/** 
	 * Inserts a new row in the resources table.
	 */
	public ResourcesPk insert(Resources dto) throws ResourcesDaoException;

	/** 
	 * Updates a single row in the resources table.
	 */
	public void update(ResourcesPk pk, Resources dto) throws ResourcesDaoException;

	/** 
	 * Deletes a single row in the resources table.
	 */
	public void delete(ResourcesPk pk) throws ResourcesDaoException;

	/** 
	 * Returns the rows from the resources table that matches the specified primary-key value.
	 */
	public Resources findByPrimaryKey(ResourcesPk pk) throws ResourcesDaoException;

	/** 
	 * Returns all rows from the resources table that match the criteria 'res_id = :resId'.
	 */
	public Resources findByPrimaryKey(int resId) throws ResourcesDaoException;

	/** 
	 * Returns all rows from the resources table that match the criteria ''.
	 */
	public Resources[] findAll() throws ResourcesDaoException;

	/** 
	 * Returns all rows from the resources table that match the criteria 'property_ID = :propertyId'.
	 */
	public Resources[] findByPropertyId(int propertyId) throws ResourcesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the resources table that match the specified arbitrary SQL statement
	 */
	public Resources[] findByDynamicSelect(String sql, Object[] sqlParams) throws ResourcesDaoException;

	/** 
	 * Returns all rows from the resources table that match the specified arbitrary SQL statement
	 */
	public Resources[] findByDynamicWhere(String sql, Object[] sqlParams) throws ResourcesDaoException;

}