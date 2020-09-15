package stub;

import java.util.Arrays;
import java.util.List;

public class GradeSystemStub extends GradeSystem {

    @Override
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(80d, 90d, 100d);
    }
}
