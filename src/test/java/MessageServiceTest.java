import com.hello.MessageService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Nico on 8/11/16 11:52.
 */
public class MessageServiceTest {

    private MessageService messageService;

    @Before
    public void setUp() {
        messageService = new MessageService();
    }
    @Test
    public void getMessage() {
        Assert.assertEquals("Hello World!", messageService.getMessage());
    }

}
