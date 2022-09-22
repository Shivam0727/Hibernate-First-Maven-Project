package com.Shivam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Students_Records")
public class Student 
{
    
	private int id ;
	private String Name ;
	private String City ;
	private String Contact ;
	private String Graduation_Percentage ;
	
	@Id
	public int getid()
	{
		return id;
	}
	public void setid(int Id) 
	{
		id = Id;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name)
	{
		Name = name;
	}
	public String getCity() 
	{
		return City;
	}
	public void setCity(String city) 
	{
		City = city;
	}
	public String getContact() 
	{
		return Contact;
	}
	public void setContact(String contact) 
	{
		Contact = contact;
	}
	public String getGraduation_Percentage() 
	{
		return Graduation_Percentage;
	}
	public void setGraduation_Percentage(String graduation_Percentage) 
	{
		Graduation_Percentage = graduation_Percentage;
	}
	
	public Student(int Id, String name, String city, String contact, String graduation_Percentage) 
	{
		super();
		id = Id;
		Name = name;
		City = city;
		Contact = contact;
		Graduation_Percentage = graduation_Percentage;
	}
	
	
	public Student() 
	{
		super();
	}

	@Override
	public String toString() 
	{
		return "Student [ Id = " + id + " , Name = " + Name + " , City = " + City + " , Contact = " + Contact
				+ " , Graduation_Percentage = " + Graduation_Percentage + " ]";
	}
	
}
