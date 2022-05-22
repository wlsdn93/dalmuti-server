import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GameManager {
    private List<String> totalCards = new ArrayList<>();
    public void makeCardList() {
        Set<Card> cards = EnumSet.allOf(Card.class);
        for (Card card : cards) {
             for(int i = 0; i < card.getQuantity(card); i++) {
                 totalCards.add("("+card.getValue(card)+")"+card.getName(card));
             }
        }
        Collections.shuffle(totalCards);
    }
    public List<String> getTotalCards() {
        return this.totalCards;
    }

    public void distributeCard(Player... players) {
        int playerNums = players.length;
        int remainCards = totalCards.size() % playerNums;
        int share= totalCards.size() / playerNums;
        if (remainCards == 0) {
            int headIdx = 0;
            int tailIdx = share;
            for (Player p : players) {
                p.setDeck(totalCards.subList(headIdx, tailIdx)
                        .stream()
                        .sorted()
                        .collect(Collectors.toList()));
                headIdx += share;
                tailIdx += share;
            }
        }
    }
    GameManager() {
        makeCardList();
    }

}
