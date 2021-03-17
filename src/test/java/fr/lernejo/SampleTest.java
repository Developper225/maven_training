package fr.lernejo;

import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    Sample samp=new Sample();
    @Test
    void op() {

        assertEquals(2,samp.op(ADD,1,1));
        assertEquals(4,samp.op(MULT, 2,2));
    }
}



