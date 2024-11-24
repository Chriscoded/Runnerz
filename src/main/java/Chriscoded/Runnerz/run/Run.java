package Chriscoded.Runnerz.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String Title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location) {
}
