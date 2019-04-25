import br.com.tempus.iot.sdk.*;
import br.com.tempus.iot.sdk.errors.*;

import java.util.Date;

public class Sample1 {
    public static void main(String[] args) {
        Connector connector = new Connector();
        try {
            connector.connect("API_KEY");
            for (int i = 0; i < 10; i++) {
                long timestamp = new Date().getTime();
                Record r = new Record(timestamp, "S1", Record.SensorTypes.RFID);
                r.Data().setTag("e20068060000000000000021");
                connector.send(r);
            }
        }
        catch (InvalidKeyException e) {
            System.err.println("INVALID_KEY_Exception: Please make sure to use correct API_KEY in the code.");
            return;
        }
        catch (InitializationException e) {
            throw e;
        }
        catch (RuntimeException e) {
            throw e;
        }
        finally {
            connector.flush();
            connector.close();
        }
        System.out.println("Done.");
    }
}
