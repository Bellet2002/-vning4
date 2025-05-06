import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Exercise4 {
	private Graph<Node> graph = new ListGraph<>();

    public void loadLocationGraph(String fileName){
      try (BufferedReader bReader = new BufferedReader(new FileReader(fileName))) {
         //Läs inledande lång rad med noder och lägg in i en String[]
         //Ett alternativ är då en simpel for-loop med i += 3 som läser in relevant info utifrån i och lägger den nya locationen direkt i graph
         //Därefter är varje line en connection, vi kan återigen dela upp infon i en String[]
         //namn på från-nod; namn på till-nod; edge namnet; vikt;
         //Hitta från-nod i graph genom att jämföra .getName()
         //Hitta till-noden på samma sätt
         //Använd connect för att sätta ihop dessa
         //Repetera tills filen är tom
      } catch (FileNotFoundException e) {
         System.err.println("File not found: " + fileName);
      } catch (IOException e) {
         e.printStackTrace();
      }
    }

    public SortedMap<Integer, SortedSet<Record>> getAlsoLiked(Record item) {
      SortedMap<Integer, SortedSet<Record>> result = new TreeMap<>();
      //Gå genom nodens edges
      //För varje person/node gå genom edges
      //Om noden inte existerar i temp lägg till den (computeIfAbsent()) tillsammans med resultatet från getPopularity
       return result;
    }

    public int getPopularity(Record item) {
      //Hämta en collection med edges från noden med hjälv av getEdgesFrom
      //Returnera antalet
       return -1;
    }

    public SortedMap<Integer, Set<Record>> getTop5() {
      SortedMap<Integer, Set<Record>> result = new TreeMap<>();
      //Gå genom grafen
      //Om noden är en record lägg till med resultatet från getPopularity som key
      //Ta bort överflödiga noder 
      return result;
    }

    public void loadRecommendationGraph(String fileName) {
      try (BufferedReader bReader = new BufferedReader(new FileReader(fileName))) {
         //personNamn; titel på skiva; skivans artist;
         //Dela upp linen i en String[]
         //Skapa en ny Person och lägg in i graph
         //Skapa en ny Record och lägg in i graph
         //Repetera
         //Behöver nog ändra på edge-konstruktorn eftersom namnet och vikten ska vara blanka
      } catch (FileNotFoundException e) {
         System.err.println("FIle not found: " + fileName);
      } catch (IOException e) {
         e.printStackTrace();
      }
    }

}
