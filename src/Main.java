import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        List<String> totalCard = gameManager.getTotalCards();

        Player[] players = {new Player("A"),
                new Player("B"),
                new Player("C"),
                new Player("D"),
                new Player("E")
        };
        gameManager.distributeCard(players);

        for (Player p : players) {
            System.out.print(p.getNickName() + "\t");
            System.out.println(p.getDeck());
        }
    }
}

