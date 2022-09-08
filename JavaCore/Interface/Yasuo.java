public class Yasuo implements CanShoot {
    private String hair;
    private String weapon;

    /**
     * @return String return the hair
     */
    public String getHair() {
        return hair;
    }

    /**
     * @param hair the hair to set
     */
    public void setHair(String hair) {
        this.hair = hair;
    }

    /**
     * @return String return the sword
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * @param weapon the sword to set
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void shoot() {
        System.out.println("hair: " + hair + " weapon: " + weapon);
        
    }

}
