package stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		Path path = Paths.get(StreamEx2.class.getResource("data.txt").toURI());
		System.out.println(StreamEx2.class.getResource("data.txt").toURI());
		Stream<String> stream = Files.lines(path,Charset.defaultCharset());
		stream.forEach(str -> System.out.println(str));
		stream.close();
	}

}
