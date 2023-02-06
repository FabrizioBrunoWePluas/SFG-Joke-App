package UAccademy.JokeApp.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JokeServiceImpl implements JokeService{

    public ChuckNorrisQuotes joke;



    public String getJoke(){
        return joke.getRandomQuote();
    }

}
