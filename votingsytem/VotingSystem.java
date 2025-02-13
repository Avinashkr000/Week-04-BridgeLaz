package org.example.Day02.votingsytem;

import java.util.*;

class VotingSystem {
    private HashMap<String, Integer> voteMap = new HashMap<>();
    private LinkedHashMap<String, Integer> orderedVoteMap = new LinkedHashMap<>();
    private TreeMap<Integer, List<String>> sortedVoteMap = new TreeMap<>(Collections.reverseOrder());

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderedVoteMap.put(candidate, orderedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayResults() {
        sortedVoteMap.clear();
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            sortedVoteMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        for (Map.Entry<Integer, List<String>> entry : sortedVoteMap.entrySet()) {
            System.out.println("Votes : " + entry.getKey() + " - " + entry.getValue());
        }
    }

    public void displayOrderedVotes() {
        for (Map.Entry<String, Integer> entry : orderedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
}

