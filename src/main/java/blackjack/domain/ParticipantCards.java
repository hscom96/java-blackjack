package blackjack.domain;

import java.util.List;

public class ParticipantCards {
    private final List<Card> cards;

    public ParticipantCards(List<Card> cards) {
        this.cards = cards;
    }

    public void addCards(List<Card> drawCards) {
        cards.addAll(drawCards);
    }

    public int sumCardScore() {


        int score = 0;

        for(Card card : cards){

        }

        return 1;
    }
}
