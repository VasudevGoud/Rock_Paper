package dk.vasu.games.rockpaperscissor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @GetMapping("/play")
    public String playGame(@RequestParam(value = "choice") int playerChoice) {
        int computerChoice = 1 + (int) (Math.random() * 3);
        if (playerChoice < 1 || playerChoice > 3) {
            return "Invalid input. Please enter 1, 2, or 3.";
        }

        String result;
        if ((playerChoice == 1 && computerChoice == 2) ||
                (playerChoice == 2 && computerChoice == 3) ||
                (playerChoice == 3 && computerChoice == 1)) {
            result = "Computer wins.";
        } else if (playerChoice == computerChoice) {
            result = "It's a draw.";
        } else {
            result = "Player wins.";
        }

        return String.format("Player chose: %d, Computer chose: %d. %s", playerChoice, computerChoice, result);
    }
}
