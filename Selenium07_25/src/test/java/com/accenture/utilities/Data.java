package com.accenture.utilities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="data")
public class Data {
	private String Firstname;
	private String Lastname;

	@XmlElement(name="firstName")
	public void setFirstname(String f)
	{
		this.Firstname=f;
	}
	public String getFirstname()
	{
		return Firstname;
	}
	@XmlElement(name="lastName")
	public void setLastname(String l)
	{
		this.Lastname=l;
	}
	public String getLastname()
	{
		return Lastname;
	}

}