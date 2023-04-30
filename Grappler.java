import java.util.Scanner;
public class Grappler extends Basic {
    private String commandGrab;

    public Grappler (String name, String region, String lightP, String heavyP, String lightK, String heavyK, String specialMove, String commandGrab)
    {
        super(name, region, lightP, heavyP, lightK, heavyK, specialMove);
        this.commandGrab = commandGrab;
    }

    public Grappler ()
    {
        super("", "", "", "", "", "", "");
        commandGrab = "";
    }

    public String getGrab()
    {
        return commandGrab;
    }

    public void setGrab(String grab)
    {
        commandGrab = grab;
    }

    @Override
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


        System.out.println("\nWhat is your command grab?");
        String theGrab = scanner.nextLine();
        setGrab(theGrab);

    }
}