package Java;

public class RestaurantFavoritesClassTypes {
   public static void main(String[] args) {
	   
	// Restaurant is a class type
	// favLunchPlace is the object
	// The new operator explicitly allocates an object of the specified class type
      Restaurant favLunchPlace = new Restaurant();
      favLunchPlace.setName("Central Deli");
      favLunchPlace.setRating(4);
	  
	// The dot is called the member access operator, is used to invoke a method on an object
	// bestSushi.setName("Sushi Station"); is another example of what is happening below. Below you are setting
	// the favDinnerPlace's name to "Friends Cafe".
      new Restaurant().setName("Friends Cafe");
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'setRating'");
   }
}

