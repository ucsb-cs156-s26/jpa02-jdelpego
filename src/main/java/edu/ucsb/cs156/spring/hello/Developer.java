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

        return "JOAQUIN RAMON";
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
        team.addMember("JOAQUIN RAMON");
        team.addMember("SOOME");
        team.addMember("ELISSA EYAD");
        team.addMember("ALEXIA");
        team.addMember("JOHN MIN-GYU");
        team.addMember("IBRAHIM");
        return team;
    }
}
