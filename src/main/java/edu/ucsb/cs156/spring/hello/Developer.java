package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {

        return "Joaquin D";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "jdelpego";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s26-05");
        team.addMember("Joaquin D");
        team.addMember("Soome");
        team.addMember("Elissa");
        team.addMember("Alexia");
        team.addMember("John K");
        team.addMember("Ibrahim");
        return team;
    }
}
