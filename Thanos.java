import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        Hero blackWid = new Hero("Black Widow", 34);
        Hero captAm = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero ironMan = new Hero("Iron man", 48);
        Hero scarlet = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero docStrange = new Hero("Doctor Strange", 42);
        Hero spidey = new Hero("Spider man", 24);


        heroes.add(blackWid);
        heroes.add(captAm);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarlet);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(docStrange);
        heroes.add(spidey);

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        for(Hero hero : heroes) {
            System.out.println(hero.getName() + " is " + hero.getAge() + " years old.");
        }

        System.out.println("");
        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(heroes);

        for(Hero hero : heroes) {
            System.out.println(hero.getName() + " is " + hero.getAge() + " years old.");
        }

        System.out.println("");


        // TODO 5 : Keep only the half of the list
        List<Hero> halfHeroes = heroes.subList(0, (int) heroes.size()/2);

        for(Hero hero : halfHeroes) {
            System.out.println(hero.getName() + " is " + hero.getAge() + " years old.");
        }

        System.out.println("");


        //TODO bonus : réordonne la liste par orbre alphbetique sur les noms
        List<Hero> sortedSavedHeroes = new ArrayList<>(halfHeroes);
        Collections.sort(sortedSavedHeroes, new Comparator<Hero>() {
            @Override
            public int compare(Hero h1, Hero h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for(Hero hero : sortedSavedHeroes) {
            System.out.println(hero.getName() + " is " + hero.getAge() + " years old.");
        }


    }
}
