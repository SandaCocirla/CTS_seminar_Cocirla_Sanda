package teste;

import clase.PachetTuristic;
import dubluri.StubPersoanaMajora;
import dubluri.StubPersoanaMinora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoateRezervaTest {

    @Test
    void unMinorNuPoateRezerva() {
        StubPersoanaMinora persoana = new StubPersoanaMinora();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bucuresti",150.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    void unMajorPoateRezerva() {
        StubPersoanaMajora persoana = new StubPersoanaMajora();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bucuresti",150.0);
        assertTrue(pachetTuristic.poateRezerva());
    }
}