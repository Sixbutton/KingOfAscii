public class ArenaStats {

    private Basic basic;
    private Grappler grappler;
    private Rushdown rushdown;
    private Zoner zoner;
    private boolean high;
    private double health;
    private int distance;
    private double frames;
    private double damage;
    private int charID;
    private int specialMeter;
    private boolean block;
    private boolean fireball;


    public ArenaStats(Basic basic, int charID) {

        if (basic instanceof Grappler)
        {
            Grappler grappler = (Grappler) basic;
            this.grappler = new Grappler(grappler.getName(), grappler.getRegion(), grappler.getOne(), grappler.getTwo(), grappler.getThree(), grappler.getFour(), grappler.getSpecial(), grappler.getGrab());
        }

        else if (basic instanceof Rushdown)
        {
            Rushdown rushdown = (Rushdown) basic;
            this.rushdown = new Rushdown(rushdown.getName(), rushdown.getRegion(), rushdown.getOne(), rushdown.getTwo(), rushdown.getThree(), rushdown.getFour(), rushdown.getSpecial(), rushdown.getDash());
        }

        else if (basic instanceof Zoner)
        {
            Zoner zoner = (Zoner) basic;
            this.zoner = new Zoner(zoner.getName(), zoner.getRegion(), zoner.getOne(), zoner.getTwo(), zoner.getThree(), zoner.getFour(), zoner.getSpecial(), zoner.getProjectile());
        }

        else
        {
            this.basic = new Basic(basic.getName(), basic.getRegion(), basic.getOne(), basic.getTwo(), basic.getThree(), basic.getFour(), basic.getSpecial());
        }

        this.high = true;
        this.health = 100;
        this.distance = 5;
        this.frames = 0;
        this.damage = 0;
        this.charID = charID;
        this.specialMeter = 0;
        this.block = false;
        this.fireball = false;

    }



    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public Grappler getGrappler() {
        return grappler;
    }

    public void setGrappler(Grappler grappler) {
        this.grappler = grappler;
    }

    public Rushdown getRushdown() {
        return rushdown;
    }

    public void setRushdown(Rushdown rushdown) {
        this.rushdown = rushdown;
    }

    public Zoner getZoner() {
        return zoner;
    }

    public void setZoner(Zoner zoner) {
        this.zoner = zoner;
    }

    public boolean isHigh() {
        return high;
    }

    public void setHigh(boolean high) {
        this.high = high;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getFrames() {
        return frames;
    }

    public void setFrames(double frames) {
        this.frames = frames;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getCharID() {
        return charID;
    }

    public void setCharID(int charID) {
        this.charID = charID;
    }

    public int getSpecialMeter() {
        return specialMeter;
    }

    public void setSpecialMeter(int specialMeter) {
        this.specialMeter = specialMeter;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public boolean isFireball() {
        return fireball;
    }

    public void setFireball(boolean fireball) {
        this.fireball = fireball;
    }

    public void setRecover()
    {
        frames = 0;
        damage = 0;
        block = false;
        fireball = false;

        if(specialMeter < 100)
        {
            specialMeter = getSpecialMeter() + 5;
        }

    }
}