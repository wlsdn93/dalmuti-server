import java.util.List;

public class Player {

    private int playerId;
    private String nickName;
    private int games;
    private int defeats;
    private int rating;
    private List<String> deck;

    Player(String nickName) {
        this.nickName = nickName;
    }
    public void setDeck(List<String> deck) {
        this.deck = deck;
    }

    public List<String> getDeck() {
        return deck;
    }

    public String getNickName() {
        return nickName;
    }
}
