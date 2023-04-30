import java.util.Scanner;
public class Rushdown extends Basic {

    private String dashAttack;

    public Rushdown (String name, String region, String lightP, String heavyP, String lightK, String heavyK, String specialMove, String dashAttack)
    {
        super(name, region, lightP, heavyP, lightK, heavyK, specialMove);
        this.dashAttack = dashAttack;
    }

    public Rushdown ()
    {
        super("", "", "", "", "", "", "");
        dashAttack = "";
    }

    public String getDash()
    {
        return dashAttack;
    }

    public void setDash(String dash)
    {
        dashAttack = dash;
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

        System.out.println("\nWhat is your dash attack?");
        String theDash = scanner.nextLine();
        setDash(theDash);

    }
}