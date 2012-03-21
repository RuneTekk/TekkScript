package org.runetekk;

/**
 * Main.java
 * @version 1.0.0
 * @author RuneTekk Development (SiniSoul)
 */
public final class Main {
    
    /**
     * The starting point for the program.
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        char[] chars = "if a do print(\"Hello\") end".toCharArray();
        String[] integers = new String[500];
        String[] strings = new String[500];
        boolean active = false;
        int offset = 0;
        for(int i = 0; i < chars.length; i++) {
            boolean lastState = active;
            if(chars[i] == '\"')                
                active = !active;
            if(lastState && !active)
                offset++;
            if(lastState && active) {
                if(strings[offset] == null)
                    strings[offset] = "";
                strings[offset] += chars[i];
            }
        }
        active = false;
        offset = 0;
        for(int i = 0; i < chars.length; i++) {
            boolean lastState = active;
            if((chars[i] >= '0' && chars[i] <= '9') ^ active)                
                active = !active;
            if(lastState && !active)
                offset++;
            if(active) {
                if(integers[offset] == null)
                    integers[offset] = "";
                integers[offset] += chars[i];
            }
        } 
    } 
}
