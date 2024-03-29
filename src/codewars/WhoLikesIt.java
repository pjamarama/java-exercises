/*
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures
or other items. We want to create the text that should be displayed next to such an item.

Implement a function likes :: [String] -> String, which must take in input array, containing the names
of people who like an item. It must return the display text as shown in the examples:

likes {} // must be "no one likes this"
likes {"Peter"} // must be "Peter likes this"
likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
 */

package codewars;

public class WhoLikesIt {

    public static void main(String[] args) {
        String[] noOne = new String[0];
        String[] one = {"Peter"};
        String[] two = {"Jacob", "Alex"};
        String[] three = {"Max", "John", "Mark"};
        String[] four = {"Alex", "Jacob", "Mark", "Max"};

        System.out.println(whoLikesIt(noOne));
        System.out.println(whoLikesIt(one));
        System.out.println(whoLikesIt(two));
        System.out.println(whoLikesIt(three));
        System.out.println(whoLikesIt(four));
    }

    public static String whoLikesIt(String... names) {

        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return String.format("%s likes this", names[0]);
            case 2:
                return String.format("%s and %s like this", names[0], names[1]);
            case 3:
                return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        }

        return String.format("%s, %s and %d others like ths", names[0], names[1], names.length - 2);
    }

}
