import com.kodilla.collections.adv.immutble.exercises.dictionary.Dictionary;
import com.kodilla.collections.adv.immutble.exercises.dictionary.EnglishWord;
import com.kodilla.collections.adv.immutble.exercises.dictionary.PartOfSpeech;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DictionaryTestSuite {

    @Test
    public void testAddWord() {
        Dictionary dictionary = new Dictionary();
        String polishWord ="stos";
        EnglishWord englishWord= new EnglishWord(PartOfSpeech.NOUN,"stack");
        dictionary.addWord(polishWord,englishWord);

        assertEquals(1,dictionary.size());
    }

    Dictionary dictionary = new Dictionary();
    @Test
    public void testFindEnglishWords() {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB,"play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWords("gra");
        //then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        assertEquals(expectedList, result);
        assertEquals(2,result.size());
    }


    @Test
    public void testFindEnglishWordsWithPartOfSpeech(){
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN,"stack"));
        dictionary.addWord("brać",new EnglishWord(PartOfSpeech.NOUN,"broterhood"));
        dictionary.addWord("brać",new EnglishWord(PartOfSpeech.VERB,"take"));
      dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB,"play"));

        List<EnglishWord> result = dictionary.findEnglishWords("brać",PartOfSpeech.NOUN);
        List<EnglishWord>expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"broterhood"));
        assertEquals(expectedList,result);
        assertEquals(1,result.size());

    }
}
