package stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.mockito.Mockito.*;


public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {

        GradeSystem stub = mock(GradeSystem.class);
        when(stub.gradesFor(anyLong())).thenReturn(Arrays.asList(80d, 90d, 100d));

        GradeService gradeService = new GradeService(stub);
        Assertions.assertEquals(90.0, gradeService.calculateAverageGrades(-1));
    }
}
