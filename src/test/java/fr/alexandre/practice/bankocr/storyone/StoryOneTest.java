package fr.alexandre.practice.bankocr.storyone;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Alexandre on 15/01/2017.
 */
public class StoryOneTest {

    private StoryOne storyOne = new StoryOne();

    @Test
    public void should_recognize_one(){
        //Given
        String strOne = ".....|..|...";
        //When
        int one = storyOne.getNumber(strOne);
        //Then
        assertThat(one).isEqualTo(1);

    }


}
