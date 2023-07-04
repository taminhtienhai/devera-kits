package com.example.unest;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Unit test for simple App.
 */
@ExtendWith(MockitoExtension.class)
public class AppTest {

    public String setup;
    public Mathematic math;

    @BeforeEach
    void runBefore() {
        setup = "Setup";
        math = new Mathematic();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Assertions.assertEquals(Mathematic.sum(1, 1), 2);
        Assertions.assertEquals(math.localSum(1, 1), 2);
    }

    @Mock
    List<String> strs;

    @Test
    public void mock() {
        strs.add("a");
        strs.add("b");

        Mockito.when(strs.size()).thenReturn(2);
        // Mockito.doReturn(2).when(strs.size());

        Assertions.assertEquals(strs.size(), 2);
    }

    @Test
    public void spy() {
        List<Integer> ints = Mockito.spy(new ArrayList<>());

        ints.add(1);
        ints.add(2);

        Mockito.doReturn(3).when(ints.size());

        Assertions.assertEquals(ints.size(), 2);
    }

    @Test
    public void shouldFail() {

    }
}
