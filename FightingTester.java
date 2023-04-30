import java.util.Scanner;

public class FightingTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("     ⣠⣶⣶⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣶⣦⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⢿⣿⣿⣿⠀⠀⠀⢀⣀⣠⣤⣄⠀⢿⣿⣿⣿⠇⠀");
        System.out.println("⠀⠀⠀⠀⠀⠈⣉⣩⣥⣶⣶⣿⣿⣿⡿⠿⠋⣀⣀⣉⣉⡁⠀⠀");
        System.out.println("⠀⠀⠀⣠⣾⣿⣿⣿⣿⡟⠛⠋⠉⠀⣠⣴⣿⣿⣿⣿⣿⣧⠀");
        System.out.println("⣴⣾⣿⣿⣿⣿⣿⣿⢁⣤⣶⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⠀");
        System.out.println("⠻⠿⣿⣿⣿⣿⣿⠇⠈⠻⠟⠋⠉⠁⢰⣿⣿⣿⣿⣿⣿⡿⠂");
        System.out.println("⠀⢠⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⡏⠀⠀⠀⠀");
        System.out.println("⠀⣸⣿⣿⠟⣿⣿⣧⠀⠀⠀⠀⣰⣿⣿⡿⣿⣿⣷⠀⠀⠀⠀");
        System.out.println("⠀⣿⣿⡟⠀⠘⣿⣿⡇⠀⠀⢰⣿⣿⠟⠀⠸⣿⣿⡄⠀⠀⠀");
        System.out.println("⣰⣿⣿⠃⠀⠀⣿⣿⡇⠀⠀⢸⣿⣿⠀⠀⠀⢿⣿⣧⠀⠀⠀");
        System.out.println("⣿⣿⠇⠀⠀⠀⣿⣿⡇⠀⠀⢸⣿⣿⠀⠀⠀⠘⣿⣿⡆⠀⠀");
        System.out.println("⠉⠉⠀⠀⠀⠀⠈⠉⠀⠀⠀⠀⠉⠉⠀⠀⠀⠀⠈⠉⠀⠀⠀");
        System.out.println("KING OF ASCII: A TEXT-BASED FIGHTER BY NOAH SUTTON \n");

        System.out.println("What kind of character do you wish to play? (Any other number to exit)");
        System.out.println("1 - Basic (Standard Fighter)");
        System.out.println("2 - Grappler (Extremely powerful close ranged attack, weak range)");
        System.out.println("3 - Zoner (Good distance projectile, bad close range)");
        System.out.println("4 - Rushdown (Good close, bad far, good mobility) \n");

        int num = scanner.nextInt();


        if(num == 1)
        {

            // create a basic void object 
            Basic player = new Basic();
            player.start();
            System.out.println(player);

            ArenaStats playerStats = new ArenaStats(player, num);

            ArenaStats enemyStats = null;

            System.out.println("\nWho do you wish to fight?");
            System.out.println("1 - Mario (Basic) ");
            System.out.println("2 - Zangief (Grappler)");
            System.out.println("3 - Ryu (Zoner)");
            System.out.println("4 - Kazuya (Rushdown) \n");

            int opSel = scanner.nextInt();

            if(opSel == 2)
            {

                Grappler Zangief = new Grappler("Zangief", "Brooklyn", "simple jab", "down heavy", "tap kick", "sweep", "Atomic Buster", "Flying Power Bomb");
                enemyStats = new ArenaStats(Zangief, 2);
                System.out.println(player.getName() + " VS. " + Zangief.getName());

            }

            else if(opSel == 3)
            {

                Zoner Ryu = new Zoner("Ryu", "Japan", "simple jab", "down heavy punish", "tap kick", "sweep", "Satsuo Hadoken", "Hadoken");
                enemyStats = new ArenaStats(Ryu, 3);
                System.out.println(player.getName() + " VS. " + Ryu.getName());

            }

            else if(opSel == 4)
            {
                Rushdown Kazuya = new Rushdown("Kazuya", "Japan", "One", "Two", "Three", "Four", "Devil Form", "Hellsweep");
                enemyStats = new ArenaStats(Kazuya, 4);
                System.out.println(player.getName() + " VS. " + Kazuya.getName());
            }

            else
            {
                Basic Mario = new Basic("Mario", "Brooklyn", "simple jab", "down heavy punish", "tap kick", "sweep", "Super Mario");
                enemyStats = new ArenaStats(Mario, 1);
                System.out.println(player.getName() + " VS. " + Mario.getName());
            }


            Arena fight = new Arena(playerStats, enemyStats);




            while(playerStats.getHealth() > 0 && enemyStats.getHealth() > 0)
            {
                fight.turn();
                fight.ai();
                fight.results();
                fight.reset();
            }

            if(playerStats.getHealth() > 0)
            {
                System.out.println("Congratulations! You are the King of Ascii! Thank you for playing!");
            }

            else
            {
                System.out.println("You have LOST the tournament... Try again or face eternal defeat!");
            }
        }

        else if(num == 2)
        {
            // create a grappler void object 
            Grappler player = new Grappler();
            player.start();
            System.out.println(player);
            ArenaStats playerStats = new ArenaStats(player, num);

            ArenaStats enemyStats = null;

            System.out.println("\nWho do you wish to fight?");
            System.out.println("1 - Mario (Basic) ");
            System.out.println("2 - Zangief (Grappler)");
            System.out.println("3 - Ryu (Zoner)");
            System.out.println("4 - Kazuya (Rushdown) \n");

            int opSel = scanner.nextInt();

            if(opSel == 2)
            {

                Grappler Zangief = new Grappler("Zangief", "Brooklyn", "simple jab", "down heavy", "tap kick", "sweep", "Atomic Buster", "Flying Power Bomb");
                enemyStats = new ArenaStats(Zangief, 2);
                System.out.println(player.getName() + " VS. " + Zangief.getName());

            }

            else if(opSel == 3)
            {

                Zoner Ryu = new Zoner("Ryu", "Japan", "simple jab", "down heavy punish", "tap kick", "sweep", "Satsuo Hadoken", "Hadoken");
                enemyStats = new ArenaStats(Ryu, 3);
                System.out.println(player.getName() + " VS. " + Ryu.getName());

            }

            else if(opSel == 4)
            {
                Rushdown Kazuya = new Rushdown("Kazuya", "Japan", "One", "Two", "Three", "Four", "Devil Form", "Hellsweep");
                enemyStats = new ArenaStats(Kazuya, 4);
                System.out.println(player.getName() + " VS. " + Kazuya.getName());
            }

            else
            {
                Basic Mario = new Basic("Mario", "Brooklyn", "simple jab", "down heavy punish", "tap kick", "sweep", "Super Mario");
                enemyStats = new ArenaStats(Mario, 1);
                System.out.println(player.getName() + " VS. " + Mario.getName());
            }


            Arena fight = new Arena(playerStats, enemyStats);




            while(playerStats.getHealth() > 0 && enemyStats.getHealth() > 0)
            {
                fight.turn();
                fight.ai();
                fight.results();
                fight.reset();
            }

            if(playerStats.getHealth() > 0)
            {
                System.out.println("Congratulations! You are the King of Ascii! Thank you for playing!");
            }

            else
            {
                System.out.println("You have LOST the tournament... Try again or face eternal defeat!");
            }
        }

        else if(num == 3)
        {
            // create a zoner void object 
            Zoner player = new Zoner();
            player.start();
            System.out.println(player);

            ArenaStats playerStats = new ArenaStats(player, num);

            ArenaStats enemyStats = null;

            System.out.println("\nWho do you wish to fight?");
            System.out.println("1 - Mario (Basic) ");
            System.out.println("2 - Zangief (Grappler)");
            System.out.println("3 - Ryu (Zoner)");
            System.out.println("4 - Kazuya (Rushdown) \n");

            int opSel = scanner.nextInt();

            if(opSel == 2)
            {

                Grappler Zangief = new Grappler("Zangief", "Brooklyn", "simple jab", "down heavy", "tap kick", "sweep", "Atomic Buster", "Flying Power Bomb");
                enemyStats = new ArenaStats(Zangief, 2);
                System.out.println(player.getName() + " VS. " + Zangief.getName());

            }

            else if(opSel == 3)
            {

                Zoner Ryu = new Zoner("Ryu", "Japan", "simple jab", "down heavy punish", "tap kick", "sweep", "Satsuo Hadoken", "Hadoken");
                enemyStats = new ArenaStats(Ryu, 3);
                System.out.println(player.getName() + " VS. " + Ryu.getName());

            }

            else if(opSel == 4)
            {
                Rushdown Kazuya = new Rushdown("Kazuya", "Japan", "One", "Two", "Three", "Four", "Devil Form", "Hellsweep");
                enemyStats = new ArenaStats(Kazuya, 4);
                System.out.println(player.getName() + " VS. " + Kazuya.getName());
            }

            else
            {
                Basic Mario = new Basic("Mario", "Brooklyn", "simple jab", "down heavy punish", "tap kick", "sweep", "Super Mario");
                enemyStats = new ArenaStats(Mario, 1);
                System.out.println(player.getName() + " VS. " + Mario.getName());
            }


            Arena fight = new Arena(playerStats, enemyStats);




            while(playerStats.getHealth() > 0 && enemyStats.getHealth() > 0)
            {
                fight.turn();
                fight.ai();
                fight.results();
                fight.reset();
            }

            if(playerStats.getHealth() > 0)
            {
                System.out.println("Congratulations! You are the King of Ascii! Thank you for playing!");
            }

            else
            {
                System.out.println("You have LOST the tournament... Try again or face eternal defeat!");
            }
        }

        else if(num == 4)
        {
            // create a rushdown void object 
            Rushdown player = new Rushdown();
            player.start();
            System.out.println(player);

            ArenaStats playerStats = new ArenaStats(player, num);

            ArenaStats enemyStats = null;

            System.out.println("\nWho do you wish to fight?");
            System.out.println("1 - Mario (Basic) ");
            System.out.println("2 - Zangief (Grappler)");
            System.out.println("3 - Ryu (Zoner)");
            System.out.println("4 - Kazuya (Rushdown) \n");

            int opSel = scanner.nextInt();

            if(opSel == 2)
            {

                Grappler Zangief = new Grappler("Zangief", "Brooklyn", "simple jab", "down heavy", "tap kick", "sweep", "Atomic Buster", "Flying Power Bomb");
                enemyStats = new ArenaStats(Zangief, 2);
                System.out.println(player.getName() + " VS. " + Zangief.getName());

            }

            else if(opSel == 3)
            {

                Zoner Ryu = new Zoner("Ryu", "Japan", "simple jab", "down heavy punish", "tap kick", "sweep", "Satsuo Hadoken", "Hadoken");
                enemyStats = new ArenaStats(Ryu, 3);
                System.out.println(player.getName() + " VS. " + Ryu.getName());

            }

            else if(opSel == 4)
            {
                Rushdown Kazuya = new Rushdown("Kazuya", "Japan", "One", "Two", "Three", "Four", "Devil Form", "Hellsweep");
                enemyStats = new ArenaStats(Kazuya, 4);
                System.out.println(player.getName() + " VS. " + Kazuya.getName());
            }

            else
            {
                Basic Mario = new Basic("Mario", "Brooklyn", "simple jab", "down heavy punish", "tap kick", "sweep", "Super Mario");
                enemyStats = new ArenaStats(Mario, 1);
                System.out.println(player.getName() + " VS. " + Mario.getName());
            }


            Arena fight = new Arena(playerStats, enemyStats);




            while(playerStats.getHealth() > 0 && enemyStats.getHealth() > 0)
            {
                fight.turn();
                fight.ai();
                fight.results();
                fight.reset();
            }

            if(playerStats.getHealth() > 0)
            {
                System.out.println("Congratulations! You are the King of Ascii! Thank you for playing!");
            }

            else
            {
                System.out.println("You have LOST the tournament... Try again or face eternal defeat!");
            }
        }

        else
        {
            System.out.println("Thanks for playing!");
        }






    }
}