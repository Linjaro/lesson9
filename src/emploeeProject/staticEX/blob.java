package emploeeProject.staticEX;

/*
Static variable are not instace cariables, which aooly to an individual abject. 
They are CLASS-LEVEL variables that aooly to the entire class.
Static methos - abilities of the entire CLASS and not of an individual object. 
These are run through the class itseld and not the object
*/

public class blob {
    private String name;
    //blobCount applies to entire class not individuals
    private static int blobCount= 0;
    public blob (String n){
        name = n;
        //when we construct a blob, count increases
        blobCount++;
    }
    public String getName(){
        return name;
    }
    //uses static mmethod to get a static pricate variable
    public static int getBlobCount(){
        return blobCount;
    }
}
