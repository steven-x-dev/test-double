package mock;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DoorPanelMock extends DoorPanel {

    private boolean closeCalled = false;

    @Override
    void close() {
        closeCalled = true;
        System.out.println("door panel mock close called");
    }

    void verifyCloseCalled() {
        assertTrue(closeCalled);
    }

}
