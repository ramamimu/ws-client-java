import java.io.ObjectOutputStream;
import java.net.Socket;

import progjar.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6666);

        ObjectOutputStream ous = new ObjectOutputStream(socket.getOutputStream());
        Person p = new Person();
        p.setFullName("Budi");
        p.setAge(20);

        ous.writeObject(p);
        ous.flush();

        ous.close();
        socket.close();
    }
}
