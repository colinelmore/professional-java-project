import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.professional.service.ServiceLayer;
import com.professional.frontend.ConsoleApp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ConsoleAppTest {
    private ConsoleApp consoleApp;
    private ServiceLayer serviceLayer;
    private final InputStream originalSystemIn = System.in;
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    public void setUp() {
        serviceLayer = mock(ServiceLayer.class);
        consoleApp = new ConsoleApp(serviceLayer);
    }

    @Test
    public void testAddEntity() {
        String input = "1\nTest Entity\nTest Description\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        consoleApp.run(); // Assuming run() method starts the console application

        verify(serviceLayer).addEntity(any());
    }

    @Test
    public void testGetEntity() {
        when(serviceLayer.getEntity(1)).thenReturn(new Entity(1, "Test Entity", "Test Description"));

        String input = "2\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        consoleApp.run();

        verify(serviceLayer).getEntity(1);
    }

    @Test
    public void testModifyEntity() {
        String input = "3\n1\nUpdated Entity\nUpdated Description\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        consoleApp.run();

        verify(serviceLayer).modifyEntity(any());
    }

    @Test
    public void testRemoveEntity() {
        String input = "4\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        consoleApp.run();

        verify(serviceLayer).removeEntity(1);
    }

    @AfterEach
    public void restoreSystemState() {
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }
}