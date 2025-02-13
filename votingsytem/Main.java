package org.example.Day02.votingsytem;


public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Avinash");
        votingSystem.castVote("Kunal");
        votingSystem.castVote("Avinash");
        votingSystem.castVote("Kunal");
        votingSystem.castVote("Kunal");
        votingSystem.castVote("Ravi");

        System.out.println("Results Sorted by Votes :");
        votingSystem.displayResults();

        System.out.println("\nOrdered Votes:");
        votingSystem.displayOrderedVotes();
    }
}
