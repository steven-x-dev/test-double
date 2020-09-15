package mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */

    private SecurityCenter securityCenter;
    private DoorPanel mock;

    @BeforeEach
    public void setUp() {
        mock = mock(DoorPanel.class);
        securityCenter = new SecurityCenter(mock);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(mock, times(1)).close();
    }
}
