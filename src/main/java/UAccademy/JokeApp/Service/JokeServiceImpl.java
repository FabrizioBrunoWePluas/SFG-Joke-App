package UAccademy.JokeApp.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    public ChuckNorrisQuotes chuckNorrisQuotes;



    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }

}
