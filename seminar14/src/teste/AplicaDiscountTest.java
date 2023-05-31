package teste;

import clase.PachetTuristic;
import dubluri.FakePersoana;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicaDiscountTest {

    @Test
    void testNuSeAplicaDiscount() {
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setGetVarstaValue(6);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana,"Euforie",1000.0);
        pachetTuristic.aplicaDiscountVarstnici(70);
        assertEquals(1000,pachetTuristic.getPret());
    }
    @Test
    void testSeAplicaDiscount() {
        FakePersoana fakePersoana = new FakePersoana();
        fakePersoana.setGetVarstaValue(66);
        PachetTuristic pachetTuristic = new PachetTuristic(fakePersoana,"Euforie",1000.0);
        pachetTuristic.aplicaDiscountVarstnici(70);
        assertEquals(300,pachetTuristic.getPret());
    }
}