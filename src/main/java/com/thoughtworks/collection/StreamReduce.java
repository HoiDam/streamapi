package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {

        return numbers.stream()
                .filter(number -> number%2==1)
                .reduce(0,(accum,number)-> {
                    return number;
                });
    }

    public String getLongest(List<String> words) {

        return words.stream()
                .reduce("",(identity,word)-> {
                    return word.length() > identity.length() ? word : identity;
                });
    }

    public int getTotalLength(List<String> words) {
        return words.stream()
                .map(word -> word.length())
                .reduce(0,(wordL,n) -> wordL+n);
    }
}
