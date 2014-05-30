
package Model;
import java.io.*;

public class ProfilePic {
    String user_id;
    InputStream pic;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public InputStream getPic() {
        return pic;
    }

    public void setPic(InputStream pic) {
        this.pic = pic;
    }

    
    
}
