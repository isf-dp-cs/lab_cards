package model;

public class Card {
    private String suit;
    private int rank;

    // Constructor to create a Card with a specific suit and rank.
    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // accessor for suit of the card.
    public String getSuit() {
        return suit;
    }

    // mutator for the suit of the card.
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // accessor for the rank of the card.
    public int getRank() {
        return rank;
    }

    // mutator for the rank of the card.
    public void setRank(int rank) {
        this.rank = rank;
    }

    // check if this card has the same rank as another card.
    public boolean isEqual(Card otherCard) {
        return this.rank == otherCard.getRank();
    }

    // check if this card has a higher rank than another card.
    public boolean isHigherThan(Card otherCard) {
        return this.rank > otherCard.getRank();
    }

    // Override toString
    // Converts the card to a readable string representation.
    @Override
    public String toString() {
        String rankString;
        if (rank >= 2 && rank <= 10) {
            rankString = String.valueOf(rank);
        } else if (rank == 11) {
            rankString = "Jack";
        } else if (rank == 12) {
            rankString = "Queen";
        } else if (rank == 13) {
            rankString = "King";
        } else if (rank == 1) {
            rankString = "Ace";
        } else {
            rankString = "Invalid Rank";
        }
        return rankString + " of " + suit;
    }
}
