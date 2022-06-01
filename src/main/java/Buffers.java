import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;

public class Buffers {
    public static void main(String[] args) throws IOException {
        String pathFile = "/home/boris/Programs/JavaProjects/TestLessons/src/main/resources/Text";
        Path path = Path.of(pathFile);
        FileChannel channel = FileChannel.open(path);
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        channel.read(byteBuffer);
        byteBuffer.flip();
        for (int i = 0; i < byteBuffer.capacity(); i++) {
            System.out.print((char)byteBuffer.get());
        }
    }
}
