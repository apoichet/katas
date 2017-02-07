package fr.alexandre.practice.bankocr.storyone;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.FileNotFoundException;

/**
 * Created by Alexandre on 15/01/2017.
 */
public class StoryOneTest {

    private StoryOne storyOne = new StoryOne();

    @Test
    public void should_recognize_one(){
        //Given
        String strOne = "     |  |   ";
        //When
        int one = storyOne.getNumber(strOne);
        //Then
        assertThat(one).isEqualTo(1);

    }

    @Test
    public void should_recognize_two(){
        //Given
        String strOne = " _   | _ |   _ ";
        //When
        int one = storyOne.getNumber(strOne);
        //Then
        assertThat(one).isEqualTo(2);

    }
    @Test
    public void should_recognize_three(){
        //Given
        String strOne = " _   | _   | _ ";
        //When
        int one = storyOne.getNumber(strOne);
        //Then
        assertThat(one).isEqualTo(3);

    }
    @Test
    public void should_recognize_four(){
        //Given
        String strOne = "   |   _   |   ";
        //When
        int one = storyOne.getNumber(strOne);
        //Then
        assertThat(one).isEqualTo(4);

    }

    @Test
    public void should_recognize_five(){
        //Given
        String strOne = " _ |   _   | _ ";
        //When
        int one = storyOne.getNumber(strOne);
        //Then
        assertThat(one).isEqualTo(5);

    }

    @Test
    public void should_recognize_six(){
        //Given
        String strOne = " _ |   _ | | _ ";
        //When
        int one = storyOne.getNumber(strOne);
        //Then
        assertThat(one).isEqualTo(6);

    }

    @Test
    public void should_recognize_seven(){
        //Given
        String strOne = " _   |  |   ";
        //When
        int one = storyOne.getNumber(strOne);
        //Then
        assertThat(one).isEqualTo(7);

    }

    @Test
    public void should_recognize_eight(){
        //Given
        String strOne = " _ | | _ | | _ ";
        //When
        int one = storyOne.getNumber(strOne);
        //Then
        assertThat(one).isEqualTo(8);

    }

    @Test
    public void should_recognize_nine(){
        //Given
        String strOne = " _ | | _   | _ ";
        //When
        int one = storyOne.getNumber(strOne);
        //Then
        assertThat(one).isEqualTo(9);

    }

    @Test
    public void should_find_file_accounts(){


    }

    @Test
    public void should_get_a_number_from_file(){
        //When
        int number = storyOne.getNumberFromFile();
        //Then
        assertThat(number).isNotEqualTo(0);
    }


}
