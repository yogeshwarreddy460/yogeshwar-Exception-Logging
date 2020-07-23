package com.epam.ConstCost;


public class Calculate
{

    private final  double standardMaterial =1200;

    private final  double mediumMaterial =1500;

    private final  double highMaterial = 1800;
   
    private final  double highMaterialAndAutomation = 2500;

 
    public double getInterest(double area ,String material , boolean automation) throws InvalidMaterialSelect 
    {

        double getCost = check(material,automation);

        return area*getCost;

    }
    
	public double check(String material , boolean automation) throws InvalidMaterialSelect
   
	 {

        if(material.toLowerCase().equals(TypeOfMaterials.standard.toString().toLowerCase()))
        
{

            return standardMaterial;

        }
        
else if(material.toLowerCase().equals(TypeOfMaterials.mediumStandard.toString().toLowerCase()))
        
{

            return mediumMaterial;

        }

        else

        {
 
           boolean materials = material.toLowerCase().equals(TypeOfMaterials.highStandard.toString().toLowerCase());
            
	{

                if(materials && !automation)

                {

                    return  highMaterial;
 
               }

                else if(materials && automation)
 
               {

                    return highMaterialAndAutomation;
 
               }

            }

            throw new InvalidMaterialSelect();
    
    }
    
}

}