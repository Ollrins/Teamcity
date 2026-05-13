package plaindoll;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import org.junit.Test;

public class WelcomerTest {
    
    @Test
    public void testGetHunterReplyContainsHunter() {
        Welcomer welcomer = new Welcomer();
        String reply = welcomer.getHunterReply();
        assertThat(reply, containsString("hunter"));
    }
}
