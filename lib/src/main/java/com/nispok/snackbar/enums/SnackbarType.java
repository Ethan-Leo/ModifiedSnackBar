package com.nispok.snackbar.enums;

public enum SnackbarType {

    /**
     * Snackbar with a single line
     */
    SINGLE_LINE(48, 48, 1),
    /**
     * Snackbar with two lines
     */
    MULTI_LINE(48, 80, 2),
    /**
     * Snackbar with two lines
     */
    TWO_LINE(48, 80, 2),
    /**
     * Snackbar with three lines
     */
    THREE_LINE(48, 112, 3),
    /**
     * Snackbar with four lines
     */
    FOUR_LINE(48, 144, 4),
    /**
     * Snackbar with five lines
     */
    FIVE_LINE(48, 176, 5);

    private int minHeight;
    private int maxHeight;
    private int maxLines;

    SnackbarType(int minHeight, int maxHeight, int maxLines) {
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.maxLines = maxLines;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxLines() {
        return maxLines;
    }
}
