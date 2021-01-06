package com.company;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class toUpperCase{
    public String makeUpperCase(String sentence, char from, char to){
        return sentence.chars()
                .map(s -> (Character.toLowerCase(s) >= Character.toLowerCase(from) && Character.toLowerCase(s) <= Character.toLowerCase(to))? Character.toUpperCase(s) : s)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }
}

