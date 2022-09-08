public class Lucian implements CanShoot, CanSurf  {


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
     * @return String return the pistols
     */
    public String getWeapon() {
        return weapon;
    }

    /**
     * @param weapon the pistols to set  
     */
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void surf() {
        
    }
    @Override
    public void shoot() {
            System.out.println("hair: " + hair + " weapon: " + weapon);
    }

}
