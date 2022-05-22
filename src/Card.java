public enum Card {
    DALMUTI("달무티", 1, 1),
    ARCHBISHOP("대주교", 2, 2),
    EARL_MARSHAL("시종장", 3, 3),
    BARONESS("남작부인", 4, 4),
    ABBESS("수녀원장", 5, 5),
    KNIGHT("기사", 6, 6),
    SEAMSTRESS("재봉사", 7, 7),
    MASON("석공", 8, 8),
    COOK("요리사", 9, 9),
    SHEPHERDESS("양치기", 10, 10),
    STONECUTTER("광부", 11, 11),
    PEASANT("농노", 12, 12),
    JESTER("조커", 13, 2);
    private String name;
    private int value;
    private int quantity;

    public int getTotalNumberOfCards() {
        return 80;
    }
    public int getQuantity(Card card) {
        return card.quantity;
    }

    public String getName(Card card) {
        return card.name;
    }

    public int getValue(Card card) {
        return card.value;
    }
    Card(String name, int value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }
}
