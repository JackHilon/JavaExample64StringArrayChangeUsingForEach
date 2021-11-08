
package javaexample64stringarraychangeusingforeach;


public class JavaExample64StringArrayChangeUsingForEach {

    
    public static void main(String[] args) {
        
        
        StringBuilder[] myArray= new StringBuilder[] {new StringBuilder("First"),
            new StringBuilder("Second"), new StringBuilder("Third"), new StringBuilder("Fourth")};
        
        System.out.print("Your Array is ");
        PrintStringBuilderArray(myArray);
        
        System.out.println();
        
        StringBuilder e = new StringBuilder("XXXXX");
        
        ChangeStringBuilderArrayUsingFoureachLoop(myArray, e);
        
        System.out.print("Your Array is ");
        PrintStringBuilderArray(myArray);
        
        
        
    }
    private static void PrintStringBuilderArray(StringBuilder[] array)
    {
        if (array== null) 
            return;
        System.out.print("[ ");
        for (StringBuilder str : array) {
            System.out.print(str+" ");
        }
        System.out.println("]");
    }
    
    private static void ChangeStringBuilderArrayUsingFoureachLoop(StringBuilder[] array, StringBuilder element)
    {
        if (array== null) 
            return;
                
        for (StringBuilder str : array) {
            str.append(element);
        }
    }
    
}
