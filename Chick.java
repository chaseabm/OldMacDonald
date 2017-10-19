class Chick implements Animal 
{     
    private String myType;
    private String mySound;
/*    public Chick(String type, String sound)
    {
        myType = type;
        mySound = sound;
    } */
    public Chick(String type)
    {
        myType = type;
        mySound = getSound();
    }
    public Chick()
    {         
        myType = "unknown";
        mySound = "unknown";
    }
    public String getSound(){
    	if (Math.random() < .5)
        	return "cheep";
        else
        	return "cluck";
    }
    public String getType(){return myType;}
}
