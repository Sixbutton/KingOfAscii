import java.util.Scanner;

public class Basic
{
    private String name;
    private String region;
    private String lightP;
    private String heavyP;
    private String lightK;
    private String heavyK;
    private String specialMove;




    public Basic(String name, String region, String lightP, String heavyP, String lightK, String heavyK, String specialMove)
    {
        this.name = name;
        this.region = region;
        this.lightP = lightP;
        this.heavyP = heavyP;
        this.lightK = lightK;
        this.heavyK = heavyK;
        this.specialMove = specialMove;

    }

    public Basic()
    {
        name = "";
        region = "";
        lightP = "";
        heavyP = "";
        lightK = "";
        heavyK = "";
        specialMove = "";

    }

    public String getName()
    {
        return name;
    }

    public void setName(String theName)
    {
        name = theName;
    }

    public String getRegion()
    {
        return region;
    }

    public void setRegion(String theRegion)
    {
        region = theRegion;
    }

    public String getOne() // for context, in most games a "1" refers to the light punch 
    {
        return lightP;
    }

    public void setOne(String one)
    {
        lightP = one;
    }


    public String getTwo()
    {
        return heavyP;
    }

    public void setTwo(String two)
    {
        heavyP = two;
    }


    public String getThree()
    {
        return lightK;
    }

    public void setThree(String three)
    {
        lightK = three;
    }


    public String getFour()
    {
        return heavyK;
    }

    public void setFour(String four)
    {
        heavyK = four;
    }

    public String getSpecial()
    {
        return specialMove;
    }

    public void setSpecial(String special)
    {
        specialMove = special;
    }


    public void start()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat is the name of your character?");
        String theirName = scanner.nextLine();
        setName(theirName);

        System.out.println("\nWhere do they come from?");
        String theirRegion = scanner.nextLine();
        setRegion(theirRegion);


        System.out.println("\nWhat is the name of your light punch?");
        String lP = scanner.nextLine();
        setOne(lP);

        System.out.println("\nWhat is the name of your heavy punch");
        String hP = scanner.nextLine();
        setTwo(hP);

        System.out.println("\nWhat is the name of your light kick?");
        String lK = scanner.nextLine();
        setThree(lK);

        System.out.println("\nWhat is the name of your heavy kick?");
        String hK = scanner.nextLine();
        setFour(hK);

        System.out.println("\nWhat is the name of your special?");
        String spec = scanner.nextLine();
        setSpecial(spec);


    }

    public String toString()
    {
        return "\n  Our main character, " + name + ", coming from " + region + ",\nseeks ultimate battle among the greatest!" + "\n" + "Will they become the King of Ascii,\nor will they succumb to defeat?" + "\n" +  "May the best fighter win!";
    }


}