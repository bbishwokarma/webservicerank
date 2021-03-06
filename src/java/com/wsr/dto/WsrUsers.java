/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.wsr.dto;

import com.wsr.dao.*;
import com.wsr.factory.*;
import com.wsr.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class WsrUsers implements Serializable
{
	/** 
	 * This attribute maps to the column userid in the wsr_users table.
	 */
	protected int userid;

	/** 
	 * This attribute maps to the column username in the wsr_users table.
	 */
	protected String username;

	/** 
	 * This attribute maps to the column password in the wsr_users table.
	 */
	protected String password;

	/** 
	 * This attribute maps to the column login_type in the wsr_users table.
	 */
	protected String loginType = "user";

	/** 
	 * This attribute maps to the column name in the wsr_users table.
	 */
	protected String name;

	/** 
	 * This attribute maps to the column adress in the wsr_users table.
	 */
	protected String address;

	/** 
	 * This attribute maps to the column email in the wsr_users table.
	 */
	protected String email;

	/** 
	 * This attribute maps to the column reg_date in the wsr_users table.
	 */
	protected Date regDate;

	/** 
	 * This attribute maps to the column reffered_by in the wsr_users table.
	 */
	protected int refferedBy;

	/**
	 * Method 'WsrUsers'
	 * 
	 */
	public WsrUsers()
	{
	}

	/**
	 * Method 'getUserid'
	 * 
	 * @return int
	 */
	public int getUserid()
	{
		return userid;
	}

	/**
	 * Method 'setUserid'
	 * 
	 * @param userid
	 */
	public void setUserid(int userid)
	{
		this.userid = userid;
	}

	/**
	 * Method 'getUsername'
	 * 
	 * @return String
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * Method 'setUsername'
	 * 
	 * @param username
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * Method 'getPassword'
	 * 
	 * @return String
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Method 'setPassword'
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * Method 'getLoginType'
	 * 
	 * @return String
	 */
	public String getLoginType()
	{
		return loginType;
	}

	/**
	 * Method 'setLoginType'
	 * 
	 * @param loginType
	 */
	public void setLoginType(String loginType)
	{
		this.loginType = loginType;
	}

	/**
	 * Method 'getName'
	 * 
	 * @return String
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Method 'setName'
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Method 'getAddress'
	 * 
	 * @return String
	 */
	public String getAddress()
	{
		return address;
	}

	/**
	 * Method 'setAdress'
	 * 
	 * @param adress
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}

	/**
	 * Method 'getEmail'
	 * 
	 * @return String
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * Method 'setEmail'
	 * 
	 * @param email
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * Method 'getRegDate'
	 * 
	 * @return Date
	 */
	public Date getRegDate()
	{
		return regDate;
	}

	/**
	 * Method 'setRegDate'
	 * 
	 * @param regDate
	 */
	public void setRegDate(Date regDate)
	{
		this.regDate = regDate;
	}

	/**
	 * Method 'getRefferedBy'
	 * 
	 * @return int
	 */
	public int getRefferedBy()
	{
		return refferedBy;
	}

	/**
	 * Method 'setRefferedBy'
	 * 
	 * @param refferedBy
	 */
	public void setRefferedBy(int refferedBy)
	{
		this.refferedBy = refferedBy;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof WsrUsers)) {
			return false;
		}
		
		final WsrUsers _cast = (WsrUsers) _other;
		if (userid != _cast.userid) {
			return false;
		}
		
		if (username == null ? _cast.username != username : !username.equals( _cast.username )) {
			return false;
		}
		
		if (password == null ? _cast.password != password : !password.equals( _cast.password )) {
			return false;
		}
		
		if (loginType == null ? _cast.loginType != loginType : !loginType.equals( _cast.loginType )) {
			return false;
		}
		
		if (name == null ? _cast.name != name : !name.equals( _cast.name )) {
			return false;
		}
		
		if (address == null ? _cast.address != address : !address.equals( _cast.address )) {
			return false;
		}
		
		if (email == null ? _cast.email != email : !email.equals( _cast.email )) {
			return false;
		}
		
		if (regDate == null ? _cast.regDate != regDate : !regDate.equals( _cast.regDate )) {
			return false;
		}
		
		if (refferedBy != _cast.refferedBy) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + userid;
		if (username != null) {
			_hashCode = 29 * _hashCode + username.hashCode();
		}
		
		if (password != null) {
			_hashCode = 29 * _hashCode + password.hashCode();
		}
		
		if (loginType != null) {
			_hashCode = 29 * _hashCode + loginType.hashCode();
		}
		
		if (name != null) {
			_hashCode = 29 * _hashCode + name.hashCode();
		}
		
		if (address != null) {
			_hashCode = 29 * _hashCode + address.hashCode();
		}
		
		if (email != null) {
			_hashCode = 29 * _hashCode + email.hashCode();
		}
		
		if (regDate != null) {
			_hashCode = 29 * _hashCode + regDate.hashCode();
		}
		
		_hashCode = 29 * _hashCode + refferedBy;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return WsrUsersPk
	 */
	public WsrUsersPk createPk()
	{
		return new WsrUsersPk(userid);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.wsr.dto.WsrUsers: " );
		ret.append( "userid=" + userid );
		ret.append( ", username=" + username );
		ret.append( ", password=" + password );
		ret.append( ", loginType=" + loginType );
		ret.append( ", name=" + name );
		ret.append( ", adress=" + address );
		ret.append( ", email=" + email );
		ret.append( ", regDate=" + regDate );
		ret.append( ", refferedBy=" + refferedBy );
		return ret.toString();
	}

}
