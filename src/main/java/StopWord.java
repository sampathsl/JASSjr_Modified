import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class StopWord {

    private List<String> stopWordsList;

    public StopWord(String stopwordsFile) throws IOException {
        stopWordsList = Files.readAllLines(Paths.get(stopwordsFile));
    }

    public boolean isStopWord(String token) {
        return this.stopWordsList.contains(token.toLowerCase(Locale.getDefault()));
    }
}
