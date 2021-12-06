package studyTime;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
	public static void main(String[] args) throws IOException{
		Path p = Paths.get("studyTime");
		String currentFolder = p.toAbsolutePath().toString();
		System.out.println(currentFolder);
	}
}
