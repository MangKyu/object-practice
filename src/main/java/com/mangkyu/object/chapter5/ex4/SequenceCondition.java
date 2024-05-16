package com.mangkyu.object.chapter5.ex4;

public class SequenceCondition {

    private final int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.getSequence() == sequence;
    }
}
