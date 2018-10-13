public class Pets 
{ 
    //instance variables 
    String name; 
    
    String breed; 
    
    int age; 
    
    String colour; 
  
    //constructor declaration of Class 
    public Pets(String name, String breed, 
                   int age, String colour) 
    { //header = public Pets
      //parameter name, breed, age, colour
      
        this.name = name; 
        
        this.breed = breed; 
        
        this.age = age; 
        
        this.colour = colour; 
    } 
  
    //method 1 
    public String getName() 
    { 
        return name; 
    }
  
    //method 2 
    public String getBreed() 
    { 
        return breed; 
    } 
  
    //method 3 
    public int getAge() 
    { 
        return age; 
    } 
  
    //method 4 
    public String getColour() 
    { 
        return colour; 
    }

    //method 5
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ 
               ".\nMy breed,age and colour are " + 
               this.getBreed()+"," + this.getAge()+ 
               ","+ this.getColour()); 
        //prints the colour age breed of the pet 
        //\n makes a line break
    }
}