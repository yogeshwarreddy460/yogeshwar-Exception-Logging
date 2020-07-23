package com.epam.ConstCost;


import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


import java.util.Scanner;


public class App

{
	private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(com.epam.Exception_logging.App.class);

    
	public static Scanner obj = new Scanner(System.in);
 
        public static String getMaterial()
  
        {
     
   		Logger.info("Choose from type of materials : ");

        	TypeOfMaterials[] typeofmaterials = TypeOfMaterials.values();
 
       		for(TypeOfMaterials t : typeofmaterials)
      
  		{	
            
			Logger.info(t);

        	}

       		 Logger.info("Chose the Material Type :");
   
       		 String material = obj.next();

       		 return material;

    	}	
   
        public static void main( String[] args )

    	{
        
		double area;

        	String material;
 
       		boolean automation = false;

 
       		Logger.info("Enter the area : ");
  
      		area = obj.nextDouble();

        	material = getMaterial();


       		 if(material.toLowerCase().equals(TypeOfMaterials.highStandard.toString().toLowerCase()))
        
		{

        		    Logger.info("Is there automation :(True/False):");

        		    automation = obj.nextBoolean();

        	}


        	Calculate calculate  = new Calculate();
 
       		try
		{

        	    Logger.info(calculate.getInterest(area,material,automation));

        	}	

        	catch(InvalidMaterialSelect e)

        	{

        	    Logger.error(e);

       		 }

    }

}