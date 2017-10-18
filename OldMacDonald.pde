void setup()
{
	Cow firstCow = new Cow("cow", "moo");
	Chick firstChick = new Chick("chick", "cluck");
	Pig firstPig = new Pig("pig", "oink");
    System.out.println(firstCow.getType() + " goes " + firstCow.getSound());
    System.out.println(firstChick.getType() + " goes " + firstChick.getSound());
    System.out.println(firstPig.getType() + " goes " + firstPig.getSound());
}

