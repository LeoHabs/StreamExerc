import java.util.Arrays;

public class Prayer {
    public void prayer(){
        String prayer = "Oh Lord, won't you buy me a trash Mercedes Benz\n" +
                "My friends all drive trash Porsches, I must make trash amends\n" +
                "Worked hard all my trash lifetime, no help from my trash friends\n" +
                "So Lord, won't you buy me a trash Mercedes Benz";

        Arrays.stream(prayer.split(" ")).filter(e -> !e.equals("trash")).map(e -> e.toUpperCase()).forEach(e -> System.out.print(e + " "));

    }
}
