# SI_lab2_181149
Теа Оскакач 181149



2. CFG
![CFG](https://user-images.githubusercontent.com/82409781/171909167-d3469efa-49e7-41ac-8ffb-82cfb99b7ecc.jpg)
3. Цикломатската комплексност во оваа ситуација е 9.  Односно, таа се пресметува со Р+1, тука имаме 7 if услови и една одлука во for циклусот. Па резултатот е 7+1+1=9.
4 и 5.
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
