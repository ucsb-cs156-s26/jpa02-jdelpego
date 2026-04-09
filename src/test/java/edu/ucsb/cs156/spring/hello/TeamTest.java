package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");
    }

    @Test
    public void getName_returns_correct_name() {
        assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void default_constructor_creates_empty_team() {
        Team t = new Team();
        assertEquals("", t.getName());
        assertEquals(0, t.getMembers().size());
    }

    @Test
    public void setName_sets_name() {
        team.setName("new-name");
        assertEquals("new-name", team.getName());
    }

    @Test
    public void setMembers_sets_members() {
        java.util.ArrayList<String> members = new java.util.ArrayList<>();
        members.add("Alice");
        team.setMembers(members);
        assertEquals(members, team.getMembers());
    }

    @Test
    public void equals_same_object() {
        assertEquals(team, team);
    }

    @Test
    public void equals_different_type() {
        assertNotEquals(team, "not a team");
    }

    @Test
    public void equals_same_name_same_members() {
        Team t2 = new Team("test-team");
        assertEquals(team, t2);
    }

    @Test
    public void equals_same_name_different_members() {
        Team t2 = new Team("test-team");
        t2.addMember("Alice");
        assertNotEquals(team, t2);
    }

    @Test
    public void equals_different_name_same_members() {
        Team t2 = new Team("other-team");
        assertNotEquals(team, t2);
    }

    @Test
    public void equals_different_name_different_members() {
        Team t2 = new Team("other-team");
        t2.addMember("Alice");
        assertNotEquals(team, t2);
    }

    @Test
    public void hashCode_equal_objects_have_equal_hashcodes() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
    }

    @Test
    public void hashCode_returns_expected_value() {
        Team t = new Team();
        t.setName("foo");
        t.addMember("bar");
        int expected = "foo".hashCode() | t.getMembers().hashCode();
        assertEquals(expected, t.hashCode());
    }
}
