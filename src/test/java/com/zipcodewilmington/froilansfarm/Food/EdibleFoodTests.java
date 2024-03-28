package com.zipcodewilmington.froilansfarm.Food;
import org.junit.Test;
import org.junit.Assert;

public class EdibleFoodTests {

    @Test
    public void tomatoYieldTest() {
        Crop tomato1 = new Crop(true);
        Crop tomato2 = new Crop(true);
        Crop tomato3 = new Crop(true);

        CropRow tomatoCropRow = new CropRow(true, true);

        tomatoCropRow.add(tomato1, tomato2, tomato3);

        Integer expectedTomatoCropYield = 3;
        Integer actualTomatoCropRowYield = tomatoCropRow.yield();

        Assert.assertEquals(expectedTomatoCropYield, actualTomatoCropRowYield);
    }

    @Test
    public void tomatoYieldTest2() {
        Crop tomato1 = new Crop(true);
        Crop tomato2 = new Crop(true);
        Crop tomato3 = new Crop(true);
        Crop tomato4 = new Crop(true);
        Crop tomato5 = new Crop(true);

        CropRow tomatoCropRow = new CropRow(true, true);

        tomatoCropRow.add(tomato1, tomato2, tomato3, tomato4, tomato5);

        Integer expectedTomatoCropYield = 5;
        Integer actualTomatoCropRowYield = tomatoCropRow.yield();

        Assert.assertEquals(expectedTomatoCropYield, actualTomatoCropRowYield);
    }

    @Test
    public void cornYieldTest1() {
        Crop corn1 = new Crop(true);
        Crop corn2 = new Crop(true);
        Crop corn3 = new Crop(true);

        CropRow cornCropRow = new CropRow(true, true);

        cornCropRow.add(corn1, corn2, corn3);

        Integer expectedCornCropYield = 3;
        Integer actualCornCropYield = cornCropRow.yield();

        Assert.assertEquals(expectedCornCropYield, actualCornCropYield);
    }

    @Test
    public void cornYieldTest2() {
        Crop corn1 = new Crop(true);
        Crop corn2 = new Crop(true);
        Crop corn3 = new Crop(true);
        Crop corn4 = new Crop(true);
        Crop corn5 = new Crop(true);

        CropRow cornCropRow = new CropRow(true, true);

        cornCropRow.add(corn1, corn2, corn3, corn4, corn5);

        Integer expectedCornCropYield = 5;
        Integer actualCornCropYield = cornCropRow.yield();

        Assert.assertEquals(expectedCornCropYield, actualCornCropYield);
    }

    @Test
    public void potatoYieldTest1() {
        Crop potato1 = new Crop(true);
        Crop potato2 = new Crop(true);
        Crop potato3 = new Crop(true);

        CropRow potatoCropRow = new CropRow(true, true);

        potatoCropRow.add(potato1, potato2, potato3);

        Integer expectedPotatoCropYield = 3;
        Integer actualPotatoCropYield = potatoCropRow.yield();

        Assert.assertEquals(expectedPotatoCropYield, actualPotatoCropYield);
    }

    @Test
    public void potatoYieldTest2() {
        Crop potato1 = new Crop(true);
        Crop potato2 = new Crop(true);
        Crop potato3 = new Crop(true);
        Crop potato4 = new Crop(true);
        Crop potato5 = new Crop(true);

        CropRow potatoCropRow = new CropRow(true, true);

        potatoCropRow.add(potato1, potato2, potato3, potato4, potato5);

        Integer expectedPotatoCropYield = 5;
        Integer actualPotatoCropYield = potatoCropRow.yield();

        Assert.assertEquals(expectedPotatoCropYield, actualPotatoCropYield);
    }
}
