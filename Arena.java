import java.util.Scanner;

public class Arena {
    private ArenaStats mainCharacter;
    private ArenaStats mainOpponent;


    public Arena(ArenaStats mainCharacter, ArenaStats mainOpponent)
    {
        this.mainCharacter = mainCharacter;
        this.mainOpponent = mainOpponent;



    }

    public void turn()
    {
        Scanner scanner = new Scanner(System.in);
        if(mainCharacter.getCharID() == 1)
        {
            System.out.println("\nWhat do you want to do for your turn?");
            System.out.println("1. Light Punch");
            System.out.println("2. Heavy Punch");
            System.out.println("3. Light Kick");
            System.out.println("4. Heavy Kick");
            System.out.println("5. Special (If meter is full)");
            System.out.println("Meter: " + mainCharacter.getSpecialMeter());
            System.out.println("\n6. Crouch/Uncrouch");

            if(mainCharacter.isHigh() == true)
            {
                System.out.println("Current Stance: Standing");
            }
            else
            {
                System.out.println("Current Stance: Crouching");
            }

            System.out.println("\n7. Move Forward");
            System.out.println("8. Move Back");
            System.out.println("Current Position: " + mainCharacter.getDistance());
            System.out.println("Foe's Position: " + mainOpponent.getDistance());
            System.out.println("\n9. Block\n");



            int i = scanner.nextInt();

            if(i == 1)
            {
                mainCharacter.setDamage(5);
                mainCharacter.setHigh(true);
                mainCharacter.setFrames(1 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getBasic().getOne());

            }

            if(i == 2)
            {
                mainCharacter.setDamage(10);
                mainCharacter.setHigh(true);
                mainCharacter.setFrames(2 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getBasic().getTwo());
            }

            if(i == 3)
            {
                mainCharacter.setDamage(5);
                mainCharacter.setHigh(false);
                mainCharacter.setFrames(1 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getBasic().getThree());
            }

            if(i == 4)
            {
                mainCharacter.setDamage(10);
                mainCharacter.setHigh(false);
                mainCharacter.setFrames(2 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getBasic().getFour());
            }

            if(i == 5)
            {
                if(mainCharacter.getSpecialMeter() == 100)
                {
                    mainCharacter.setDamage(25);
                    mainCharacter.setFrames(3 + Math.random());
                    System.out.println("\nYou are using your special, " + mainCharacter.getBasic().getSpecial() + "!!!!");
                }
                else
                {
                    System.out.println("\nFailed! You don't have enough meter!");
                }
            }

            if(i == 6)
            {
                mainCharacter.setHigh(!mainCharacter.isHigh());
            }

            if(i == 7)
            {
                if(mainCharacter.getDistance() < 10)
                {
                    mainCharacter.setDistance(mainCharacter.getDistance() + 1);
                }

                else
                {
                    System.out.println("\nYou are the wall of the arena!");
                }
            }

            if(i == 8)
            {
                if(mainCharacter.getDistance() > 0)
                {
                    mainCharacter.setDistance(mainCharacter.getDistance() - 1);
                }

                else
                {
                    System.out.println("\nYou are the wall of the arena!");
                }

            }

            if(i == 9)
            {
                mainCharacter.setBlock(true);
            }
        }

        else if(mainCharacter.getCharID() == 2)
        {
            System.out.println("\nWhat do you want to do for your turn?");
            System.out.println("1. Light Punch");
            System.out.println("2. Heavy Punch");
            System.out.println("3. Light Kick");
            System.out.println("4. Heavy Kick");
            System.out.println("5. Special (If meter is full)");
            System.out.println("Meter: " + mainCharacter.getSpecialMeter());
            System.out.println("\n6. Crouch/Uncrouch");
            if(mainCharacter.isHigh() == true)
            {
                System.out.println("Current Stance: Standing");
            }
            else
            {
                System.out.println("Current Stance: Crouching");
            }

            System.out.println("\n7. Move Forward");
            System.out.println("8. Move Back");
            System.out.println("Current Position: " + mainCharacter.getDistance());
            System.out.println("Foe's Position: " + mainOpponent.getDistance());
            System.out.println("\n9. Block");
            System.out.println("10. Command Grab\n");

            int i = scanner.nextInt();

            if(i == 1)
            {
                mainCharacter.setDamage(5);
                mainCharacter.setHigh(true);
                mainCharacter.setFrames(1 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getGrappler().getOne());

            }

            if(i == 2)
            {
                mainCharacter.setDamage(10);
                mainCharacter.setHigh(true);
                mainCharacter.setFrames(2 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getGrappler().getTwo());
            }

            if(i == 3)
            {
                mainCharacter.setDamage(5);
                mainCharacter.setHigh(false);
                mainCharacter.setFrames(1 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getGrappler().getThree());
            }

            if(i == 4)
            {
                mainCharacter.setDamage(10);
                mainCharacter.setHigh(false);
                mainCharacter.setFrames(2 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getGrappler().getFour());
            }

            if(i == 5)
            {
                if(mainCharacter.getSpecialMeter() == 100)
                {
                    mainCharacter.setDamage(25);
                    mainCharacter.setFrames(3 + Math.random());
                    System.out.println("\nYou are using your special, " + mainCharacter.getGrappler().getSpecial() + "!!!!");
                }
                else
                {
                    System.out.println("\nFailed! You don't have enough meter!");
                }
            }

            if(i == 6)
            {
                mainCharacter.setHigh(!mainCharacter.isHigh());
            }

            if(i == 7)
            {
                if(mainCharacter.getDistance() < 10)
                {
                    mainCharacter.setDistance(mainCharacter.getDistance() + 1);
                }

                else
                {
                    System.out.println("\nYou are the wall of the arena!");
                }
            }

            if(i == 8)
            {
                if(mainCharacter.getDistance() > 0)
                {
                    mainCharacter.setDistance(mainCharacter.getDistance() - 1);
                }

                else
                {
                    System.out.println("\nYou are the wall of the arena!");
                }

            }

            if(i == 9)
            {
                mainCharacter.setBlock(true);
            }

            if(i == 10)
            {
                mainCharacter.setDamage(15);
                mainCharacter.setHigh(true);
                mainCharacter.setFrames(3 + Math.random());
                System.out.println("You are using your grab " + mainCharacter.getGrappler().getGrab());
            }

        }

        else if(mainCharacter.getCharID() == 3)
        {
            System.out.println("\nWhat do you want to do for your turn?");
            System.out.println("1. Light Punch");
            System.out.println("2. Heavy Punch");
            System.out.println("3. Light Kick");
            System.out.println("4. Heavy Kick");
            System.out.println("5. Special (If meter is full)");
            System.out.println("Meter: " + mainCharacter.getSpecialMeter());
            System.out.println("\n6. Crouch/Uncrouch");
            if(mainCharacter.isHigh() == true)
            {
                System.out.println("Current Stance: Standing");
            }
            else
            {
                System.out.println("Current Stance: Crouching");
            }

            System.out.println("\n7. Move Forward");
            System.out.println("8. Move Back");
            System.out.println("Current Position: " + mainCharacter.getDistance());
            System.out.println("Foe's Position: " + mainOpponent.getDistance());
            System.out.println("\n9. Block");
            System.out.println("10. Projectile\n");

            int i = scanner.nextInt();


            if(i == 1)
            {
                mainCharacter.setDamage(5);
                mainCharacter.setHigh(true);
                mainCharacter.setFrames(1 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getZoner().getOne());

            }

            if(i == 2)
            {
                mainCharacter.setDamage(10);
                mainCharacter.setHigh(true);
                mainCharacter.setFrames(2 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getZoner().getTwo());
            }

            if(i == 3)
            {
                mainCharacter.setDamage(5);
                mainCharacter.setHigh(false);
                mainCharacter.setFrames(1 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getZoner().getThree());
            }

            if(i == 4)
            {
                mainCharacter.setDamage(10);
                mainCharacter.setHigh(false);
                mainCharacter.setFrames(2 + Math.random());
                System.out.println("You are using your move, " + mainCharacter.getZoner().getFour());
            }

            if(i == 5)
            {
                if(mainCharacter.getSpecialMeter() == 100)
                {
                    mainCharacter.setDamage(25);
                    mainCharacter.setFrames(3 + Math.random());
                    System.out.println("\nYou are using your special, " + mainCharacter.getZoner().getSpecial() + "!!!!");
                }
                else
                {
                    System.out.println("\nFailed! You don't have enough meter!");
                }
            }

            if(i == 6)
            {
                mainCharacter.setHigh(!mainCharacter.isHigh());
            }

            if(i == 7)
            {
                if(mainCharacter.getDistance() < 10)
                {
                    mainCharacter.setDistance(mainCharacter.getDistance() + 1);
                }

                else
                {
                    System.out.println("\nYou are the wall of the arena!");
                }
            }

            if(i == 8)
            {
                if(mainCharacter.getDistance() > 0)
                {
                    mainCharacter.setDistance(mainCharacter.getDistance() - 1);
                }

                else
                {
                    System.out.println("\nYou are the wall of the arena!");
                }

            }

            if(i == 9)
            {
                mainCharacter.setBlock(true);
            }

            if(i == 10)
            {
                mainCharacter.setDamage(5);
                mainCharacter.setFrames(1 + Math.random());
                mainCharacter.setFireball(true);
                System.out.println("\nYou are using your projectile, " + mainCharacter.getZoner().getProjectile());

            }



        }

        else if(mainCharacter.getCharID() == 4)
        {
            System.out.println("\nWhat do you want to do for your turn?");
            System.out.println("1. Light Punch");
            System.out.println("2. Heavy Punch");
            System.out.println("3. Light Kick");
            System.out.println("4. Heavy Kick");
            System.out.println("5. Special (If meter is full)");
            System.out.println("Meter: " + mainCharacter.getSpecialMeter());
            System.out.println("\n6. Crouch/Uncrouch");
            if(mainCharacter.isHigh() == true)
            {
                System.out.println("Current Stance: Standing");
            }
            else
            {
                System.out.println("Current Stance: Crouching");
            }
            System.out.println("\n7. Move Forward");
            System.out.println("8. Move Back");
            System.out.println("Current Position: " + mainCharacter.getDistance());
            System.out.println("Foe's Position: " + mainOpponent.getDistance());
            System.out.println("\n9. Block");
            System.out.println("10. Rush Attack\n");
            int i = scanner.nextInt();
            if(i == 1)
            {
                mainCharacter.setDamage(5);
                mainCharacter.setHigh(true);
                mainCharacter.setFrames(1 + Math.random());

            }
            if(i == 2)
            {
                mainCharacter.setDamage(10);
                mainCharacter.setHigh(true);
                mainCharacter.setFrames(2 + Math.random());
            }
            if(i == 3)
            {
                mainCharacter.setDamage(5);
                mainCharacter.setHigh(false);
                mainCharacter.setFrames(1 + Math.random());
            }
            if(i == 4)
            {
                mainCharacter.setDamage(10);
                mainCharacter.setHigh(false);
                mainCharacter.setFrames(2 + Math.random());
            }
            if(i == 5)
            {
                if(mainCharacter.getSpecialMeter() == 100)
                {
                    mainCharacter.setDamage(25);
                    mainCharacter.setFrames(3 + Math.random());
                }
                else
                {
                    System.out.println("\nFailed! You don't have enough meter!");
                }
            }
            if(i == 6)
            {
                mainCharacter.setHigh(!mainCharacter.isHigh());
            }
            if(i == 7)
            {
                if(mainCharacter.getDistance() < 10)
                {
                    mainCharacter.setDistance(mainCharacter.getDistance() + 1);
                }

                else
                {
                    System.out.println("\nYou are the wall of the arena!");
                }
            }
            if(i == 8)
            {
                if(mainCharacter.getDistance() > 0)
                {
                    mainCharacter.setDistance(mainCharacter.getDistance() - 1);
                }
                else
                {
                    System.out.println("\nYou are the wall of the arena!");
                }
            }
            if(i == 9)
            {
                mainCharacter.setBlock(true);
            }
            if(i == 10)
            {
                mainCharacter.setDamage(15);
                mainCharacter.setHigh(true);
                mainCharacter.setFrames(3 + Math.random());
                mainCharacter.setDistance(mainOpponent.getDistance());
            }
        }

        System.out.println("\nPress enter to continue...");
        System.out.println("...");
        System.out.println("...");
        String h1 = scanner.nextLine();
        String h2 = scanner.nextLine();
    }

    public void ai()
    {


        System.out.println("\nComputating AI's turn.... (Press Enter to Continue Once More)");
        System.out.println("....");
        System.out.println("....");
        System.out.println("....");
        System.out.println("....");



        int i = (int) (Math.random() * 10) + 1;
        if (i == 1)
        {
            mainOpponent.setDamage(5);
            mainOpponent.setHigh(true);
            mainOpponent.setFrames(1 + Math.random());

        }
        else if (i == 2)
        {
            mainOpponent.setDamage(10);
            mainOpponent.setHigh(true);
            mainOpponent.setFrames(2 + Math.random());
        }
        else if (i == 3)
        {
            mainOpponent.setDamage(5);
            mainOpponent.setHigh(false);
            mainOpponent.setFrames(1 + Math.random());
        }
        else if (i == 4)
        {
            mainOpponent.setDamage(10);
            mainOpponent.setHigh(false);
            mainOpponent.setFrames(2 + Math.random());
        }
        else if (i == 5)
        {
            if (mainOpponent.getSpecialMeter() == 100)
            {
                mainOpponent.setDamage(25);
                mainOpponent.setFrames(3 + Math.random());
            }
            else
            {
                System.out.print("");
            }
        }
        else if (i == 6)
        {
            mainOpponent.setHigh(!mainOpponent.isHigh());
        }
        else if (i == 7)
        {
            if (mainOpponent.getDistance() < 10)
            {
                mainOpponent.setDistance(mainOpponent.getDistance() + 1);
            }
            else
            {
                System.out.print("");
            }
        }
        else if (i == 8)
        {
            if (mainOpponent.getDistance() > 0)
            {
                mainOpponent.setDistance(mainOpponent.getDistance() - 1);
            }
            else
            {
                System.out.print("");
            }
        }
        else if (i == 9)
        {
            mainOpponent.setBlock(true);
        }
        else if (i == 10 && mainOpponent.getCharID() == 2)
        {
            mainOpponent.setDamage(15);
            mainOpponent.setHigh(true);
            mainOpponent.setFrames(3 + Math.random());
        }
        else if (i == 10 && mainOpponent.getCharID() == 3)
        {
            mainOpponent.setDamage(5);
            mainOpponent.setFrames(1 + Math.random());
        }
        else if (i == 10 && mainOpponent.getCharID() == 4)
        {
            mainOpponent.setDamage(15);
            mainOpponent.setHigh(true);
            mainOpponent.setFrames(3 + Math.random());
            mainOpponent.setDistance(mainCharacter.getDistance());
        }
        else
        {
            System.out.print("");
        }
    }
    public void results()
    {
        if(mainCharacter.isFireball() || mainOpponent.isFireball())
        {

            if(mainOpponent.isFireball() && mainCharacter.isBlock() == true)
            {
                System.out.println("Opponent Hit!");
                mainCharacter.setHealth(mainCharacter.getHealth() - mainOpponent.getDamage());
                System.out.println("Main character's health is now " + mainCharacter.getHealth());
            }

            else if(mainCharacter.isFireball() && mainCharacter.isBlock() == true)
            {
                System.out.println("Main character Hit!");
                mainOpponent.setHealth(mainOpponent.getHealth() - mainCharacter.getDamage());
                System.out.println("Opponent's health is now " + mainOpponent.getHealth());
            }
            // Note: While this DOES favor the AI it is for good reason
            // I wanted to reduce the main person spamming fireballs 
            // as a way to balance the zoner, who from what I can tell is pretty powerful 
            // unless against a Rushdown character

            else
            {
                System.out.println("All moves miss!");
            }
        }

        else if(mainCharacter.getDistance() == mainOpponent.getDistance())
        {
            if(mainCharacter.getFrames() > mainOpponent.getFrames() && mainOpponent.getFrames() > 0)
            {
                if(mainCharacter.isHigh() == true)
                {
                    if(mainOpponent.isBlock() == true)
                    {
                        System.out.println("You blocked the attacked!");
                    }

                    else
                    {
                        System.out.println("You got hit!");
                        mainCharacter.setHealth(mainCharacter.getHealth() - mainOpponent.getDamage());
                        System.out.println("Main character's health is now " + mainCharacter.getHealth());
                    }

                }

                else if(mainCharacter.isHigh() == false && mainOpponent.isHigh() == false)
                {
                    if(mainOpponent.isBlock() == true)
                    {
                        System.out.println("You blocked the attacked!");
                    }

                    else
                    {
                        System.out.println("You got hit!");
                        mainCharacter.setHealth(mainCharacter.getHealth() - mainOpponent.getDamage());
                        System.out.println("Main character's health is now " + mainCharacter.getHealth());
                    }
                }


            }



            else if(mainOpponent.getFrames() > mainCharacter.getFrames() && mainCharacter.getFrames() > 0)
            {
                if(mainOpponent.isHigh() == true)
                {
                    if(mainCharacter.isBlock() == true)
                    {
                        System.out.println("They blocked the attacked!");
                    }

                    else
                    {
                        System.out.println("Opponent hit!");
                        mainOpponent.setHealth(mainOpponent.getHealth() - mainCharacter.getDamage());
                        System.out.println("Opponent's health is now " + mainOpponent.getHealth());
                    }

                }

                else if(mainCharacter.isHigh() == false && mainOpponent.isHigh() == false)
                {
                    if(mainCharacter.isBlock() == true)
                    {
                        System.out.println("They blocked the attacked!");
                    }

                    else
                    {
                        System.out.println("Opponent hit!");
                        mainOpponent.setHealth(mainOpponent.getHealth() - mainCharacter.getDamage());
                        System.out.println("Opponent's health is now " + mainOpponent.getHealth());
                    }
                }
            }

            else
            {
                System.out.println("All moves Miss!");
            }



        }

        else
        {
            System.out.println("All moves miss!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press Enter to Continue");
        String hhh = scanner.nextLine();

    }

    public void reset()
    {
        mainCharacter.setRecover();
        mainOpponent.setRecover();
    }

}