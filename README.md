rendere verdi questi test

@Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        Assert.assertEquals("1", fizzBuzz.getResult(1));
        Assert.assertEquals("2", fizzBuzz.getResult(2));
        Assert.assertEquals("4", fizzBuzz.getResult(4));
    }


    @Test
    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
        Assert.assertEquals("fizz", fizzBuzz.getResult(3));
    }


    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
        Assert.assertEquals("buzz", fizzBuzz.getResult(5));
        Assert.assertEquals("buzz", fizzBuzz.getResult(10));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
        Assert.assertEquals("fizzBuzz", fizzBuzz.getResult(15));
        Assert.assertEquals("fizzBuzz", fizzBuzz.getResult(30));
    }
