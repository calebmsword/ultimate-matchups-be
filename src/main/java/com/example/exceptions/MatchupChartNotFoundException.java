package com.example.exceptions;

public class MatchupChartNotFoundException extends Exception {
    public MatchupChartNotFoundException() {
    }

    public MatchupChartNotFoundException(String message) {
        super(message);
    }

    public MatchupChartNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public MatchupChartNotFoundException(Throwable cause) {
        super(cause);
    }
}
