/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @modifier Muskan Muskan
 */
public abstract class Player {

    private String name; //the unique name for this player

    /**
     * create constructor
  
     */
    public Player(String name) {
        this.name = name;
    }

    //getter ans setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// create an abstract method play
    public abstract void play();

}
