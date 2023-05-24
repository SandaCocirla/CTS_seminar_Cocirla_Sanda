package Test;

import JUnit.ExceptionCNPNull;
import JUnit.ExceptionNenascut;
import JUnit.IPersoana;
import JUnit.Persoana;
import org.junit.jupiter.api.function.Executable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @org.junit.jupiter.api.Test
    void getVarstaTestRight() {
        IPersoana persoana = new Persoana("Andrei","1971457891236");
        assertEquals(25,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoudaryNouNascut() {
        IPersoana persoana = new Persoana("Andrei","5230524891236");
        assertEquals(0,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoudaryLimitaInferioara() {
        IPersoana persoana = new Persoana("Andrei","5000101891236");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoudaryLimitaSuperioara() {
        IPersoana persoana = new Persoana("Andrei","2991231891236");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoudaryLimitaInferioaraLuni() {
        IPersoana persoana = new Persoana("Andrei","2991231891236");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaTestBoudaryLimitaSuperioaraLuni() {
        IPersoana persoana = new Persoana("Andrei","2991231891236");
        assertEquals(23,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void getVarstaErrorConditions() {
        IPersoana persoana = new Persoana("Andrei","523061891236");
        assertThrows(ExceptionNenascut.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                persoana.getVarsta();
            }
        });
    }

    @org.junit.jupiter.api.Test
    void getVarstaPerformance(){
        IPersoana persoana = new Persoana("Andrei","6001231123456");
        assertTimeout(Duration.ofMillis(100),()-> persoana.getVarsta());

    }

    @org.junit.jupiter.api.Test
    void cnpCaractereCorrect(){
        Persoana persoana = new Persoana("Andrei","6001231123456");
        assertEquals(13,persoana.CNP.length());
    }

    @org.junit.jupiter.api.Test
    void testOrderingVarsta(){
        Persoana persoana1 = new Persoana("Andrei", "5000324123456");
        Persoana persoana2 = new Persoana("Alex", "5010524123456");
        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void testExistenceCNP(){
        Persoana persoana = new Persoana("Andrei", null);
        assertThrows(ExceptionCNPNull.class, persoana::getVarsta);
    }

    @org.junit.jupiter.api.Test
        void getVarstaCardinality(){
        Persoana persoana = new Persoana("Maria","5220515151234");
        assertEquals(1,persoana.getVarsta());
    }

    @org.junit.jupiter.api.Test
    void verificaConstructorCrosscheck(){
        Persoana persoana1 = new Persoana("Andrei", "5000324123456");
        Persoana persoana2 = new Persoana();
        persoana2.setNume("Andrei");
        persoana2.setCNP("5000324123456");
        assertEquals(persoana1.getNume(),persoana2.getNume());
        assertEquals(persoana1.getCNP(), persoana2.getCNP());
    }







}