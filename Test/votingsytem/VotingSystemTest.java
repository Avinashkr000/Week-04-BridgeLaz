package org.example.Day02.votingsytem;

import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {

    @org.junit.jupiter.api.Test
    void testCastVote() {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.castVote("CandidateA");
        votingSystem.castVote("CandidateB");
        votingSystem.castVote("CandidateA");
        votingSystem.displayResults();

        assertNotNull(votingSystem);
    }
}