import com.google.api.server.spi.config.*;
import javax.inject.Named;
 
@Api(name = "myFirstApi", version = "v1")
public class MyApi {
 
    @ApiMethod(httpMethod="get", path="/hello/{name}")
    public Message hello(@Named("name") String name) {
        return new Message("Welcome! " + name);
    }
 
    class Message {
        private String message;
        public Message(String message) {
            this.message = message;
        }
        public String getMessage() {
            return message;
        }
    }
 
}
