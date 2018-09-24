package com.chollet.homeshop;

public interface Writer {
    /**
     * Start writing
     */
    public void start();

    /**
     * Write on line
     * @param line
     */
    public void writeLine(String line);

    /**
     * Stop Writing
     */
    public void stop();
}
