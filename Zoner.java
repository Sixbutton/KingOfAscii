import java.util.Scanner;
public class Zoner extends Basic {
    private String projectile;

    public Zoner (String name, String region, String lightP, String heavyP, String lightK, String heavyK, String specialMove, String projectile)
    {
        super(name, region, lightP, heavyP, lightK, heavyK, specialMove);
        this.projectile = projectile;
    }

    public Zoner ()
    {
        super("", "", "", "", "", "", "");
        projectile = "";
    }

    public String getProjectile()
    {
        return projectile;
    }

    public void setProjectile(String proj)
    {
        projectile = proj;
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

        System.out.println("\nWhat is your projectile?");
        String theProjectile = scanner.nextLine();
        setProjectile(theProjectile);

    }
}