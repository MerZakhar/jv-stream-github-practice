package practice;

import java.util.Objects;
import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {
    @Override
    public boolean test(Candidate c) {
        String[] parts = c.getPeriodsInUkr().split("-");
        int start = Integer.parseInt(parts[0]);
        int end = Integer.parseInt(parts[1]);
        return c.getAge() >= 35
                && c.isAllowedToVote()
                && Objects.equals(c.getNationality(), "Ukrainian")
                && end - start >= 10;
    }
}
