package blackjack.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Players {

    private final List<Participant> players;

    private Players(List<Participant> players) {
        this.players = new ArrayList<>(players);
    }

    public static Players from(final List<String> names) {
        return new Players(names.stream()
            .map(Player::new)
            .collect(Collectors.toList()));
    }

    public void drawCardMultiple(Deck deck, int number) {
        for (Participant player : players) {
            player.drawCardMultiple(deck, number);
        }
    }

    public List<Participant> getPlayers() {
        return Collections.unmodifiableList(players);
    }
}