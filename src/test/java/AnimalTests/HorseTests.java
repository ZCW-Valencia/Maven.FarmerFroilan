package AnimalTests;

import org.junit.Assert;
import org.junit.Test;

public class HorseTests {

    @Test
    public void horseInheritanceTest1() {
        Animal horse = (Animal)(Object)new horse();
        Assert.assertTrue(horse instanceof Animal);
    }

    @Test
    public void horseInheritanceTest2() {
        Rideable horse = (Rideable)(Object)new horse();
        Assert.assertTrue(horse instanceof Rideable);
    }

    @Test
    public void horseImplementationTest1() {
        NoiseMaker horse = (NoiseMaker)(Object)new horse();
        Assert.assertTrue(horse instanceof NoiseMaker);
    }

    @Test
    public void horseImplementationTest2() {
        Eater horse = (Eater)(Object)new horse();
        Assert.assertTrue(horse instanceof Eater);
    }

    @Test
    public void makeNoiseTest() {
        Horse horse = new Horse();
        String expectedNoise = "Neigh!";
        String actualNoise = horse.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void eatTest() { // This test is intertwined with the hasEaten test
        Horse horse = new Horse();
        Corn corn = new Corn();
    }

    @Test
    public void hasEatenTest() {
        Horse horse = new Horse();
        Corn corn = new Corn();

        horse.eat(corn, 3);
        boolean result = horse.hasEaten();

        Assert.assertTrue(result);
    }

    @Test
    public void getIsMountedTest1() {
        Horse horse = new Horse();

        boolean isMounted = true;
        boolean result = horse.getIsMounted(isMounted);

        Assert.assertTrue(result);
    }

    @Test
    public void getIsMountedTest2() {
        Horse horse = new Horse();

        boolean isMounted = false;
        boolean result = horse.getIsMounted(isMounted);

        Assert.assertFalse(result);
    }

    @Test
    public void getIsBeingRiddenTest1() {
        Horse horse = new Horse();

        boolean isBeingRidden = true;
        boolean result = horse.getIsBeingRidden(isBeingRidden);

        Assert.assertTrue(result);
    }

    @Test
    public void getIsBeingRiddenTest2() {
        Horse horse = new Horse();

        boolean isBeingRidden = false;
        boolean result = horse.getIsBeingRidden(isBeingRidden);

        Assert.assertFalse(result);
    }

    @Test
    public void getIsDismountedTest1() {
        Horse horse = new Horse();

        boolean isDismounted = true;
        boolean result = horse.getIsDismounted(isDismounted);

        Assert.assertTrue(result);
    }

    @Test
    public void getIsDismountedTest2() {
        Horse horse = new Horse();

        boolean isDismounted = false;
        boolean result = horse.getIsDismounted(isDismounted);

        Assert.assertFalse(result);
    }

    @Test
    public void exerciseTest1() {
        Horse horse = new Horse();
        Farmer farmer = new Farmer();

        farmer.mount(horse);
        boolean result = horse.exercise();

        Assert.assertTrue(result);
    }

    @Test
    public void exerciseTest2() {
        Horse horse = new Horse();
        Farmer farmer = new Farmer();

        farmer.mount(horse);
        farmer.disMount(horse);
        boolean result = horse.exercise();

        Assert.assertFalse(result);
    }
}
