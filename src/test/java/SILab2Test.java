import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;


import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void everyStatementTest(){
        List<String> case1 = List.of();
        List<String> case2 = List.of("0","#");

        IllegalArgumentException illegalGreater,illegalPerfect;

        illegalGreater = assertThrows(IllegalArgumentException.class, () -> SILab2.function(case1));
        assertTrue(illegalGreater.getMessage().contains("List length should be greater than 0"));

        illegalPerfect = assertThrows(IllegalArgumentException.class, () -> SILab2.function(case2));
        assertTrue(illegalPerfect.getMessage().contains("List length should be a perfect square"));

        List<String> case3 = List.of( "0","#","0", "#","0","#", "0","#","#");

        List<String> case3ExpectedOutput = List.of("2", "#", "2", "#", "4", "#", "2", "#", "#");

        assertEquals(SILab2.function(case3),case3ExpectedOutput);

    }

    @Test
    void everyBranchTest(){
        List<String> case1 = List.of();
        List<String> case2 = List.of("0","#");

        IllegalArgumentException illegalGreater,illegalPerfect;

        illegalGreater = assertThrows(IllegalArgumentException.class, () -> SILab2.function(case1));
        assertTrue(illegalGreater.getMessage().contains("List length should be greater than 0"));

        illegalPerfect = assertThrows(IllegalArgumentException.class, () -> SILab2.function(case2));
        assertTrue(illegalPerfect.getMessage().contains("List length should be a perfect square"));

        List<String> case3 = List.of( "0","#","0", "#","0","#", "0","#","#");

        List<String> case3ExpectedOutput = List.of("2", "#", "2", "#", "4", "#", "2", "#", "#");

        assertEquals(SILab2.function(case3),case3ExpectedOutput);

    }
}