package exercice3;

import java.util.List;
/*
 * 
 *a user can have a list of other user to add his friend.
 *It also have a list of places for add the favorite place.
 *With this configuration we can have the favorite place of a friend
 *Or we can think a friend have a list of map witch contain a list of places.
 */
public class User {
	public String name;
	public String position;
	public String password;
	public String email;
	public List<Map> Lmap;
	public List<User> Lfriends;
	public List<Itinerary> Litinerary;
	
}
