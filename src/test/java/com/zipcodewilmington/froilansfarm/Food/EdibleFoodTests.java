package com.zipcodewilmington.froilansfarm.Food;
import com.zipcodewilmington.froilansfarm.*;
import org.junit.Test;
import org.junit.Assert;

public class EdibleFoodTests {

    @Test
    public void tomatoYieldTest() {
        Crop tomato1 = new Crop(true);
        Crop tomato2 = new Crop(true);
        Crop tomato3 = new Crop(true);

        CropRow<Crop> tomatoCropRow = new CropRow<>(true, true);

        tomatoCropRow.add(tomato1);
        tomatoCropRow.add(tomato2);
        tomatoCropRow.add(tomato3);

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

        CropRow<Crop> tomatoCropRow = new CropRow<>(true, true);

        tomatoCropRow.add(tomato1);
        tomatoCropRow.add(tomato2);
        tomatoCropRow.add(tomato3);
        tomatoCropRow.add(tomato4);
        tomatoCropRow.add(tomato5);

        Integer expectedTomatoCropYield = 5;
        Integer actualTomatoCropRowYield = tomatoCropRow.yield();

        Assert.assertEquals(expectedTomatoCropYield, actualTomatoCropRowYield);
    }

    @Test
    public void cornYieldTest1() {
        Crop corn1 = new Crop(true);
        Crop corn2 = new Crop(true);
        Crop corn3 = new Crop(true);

        CropRow<Crop> cornCropRow = new CropRow(true, true);

        cornCropRow.add(corn1);
        cornCropRow.add(corn2);
        cornCropRow.add(corn3);

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

        CropRow<Crop> cornCropRow = new CropRow<>(true, true);

        cornCropRow.add(corn1);
        cornCropRow.add(corn2);
        cornCropRow.add(corn3);
        cornCropRow.add(corn4);
        cornCropRow.add(corn5);

        Integer expectedCornCropYield = 5;
        Integer actualCornCropYield = cornCropRow.yield();

        Assert.assertEquals(expectedCornCropYield, actualCornCropYield);
    }

    @Test
    public void potatoYieldTest1() {
        Crop potato1 = new Crop(true);
        Crop potato2 = new Crop(true);
        Crop potato3 = new Crop(true);

        CropRow<Crop> potatoCropRow = new CropRow(true, true);

        potatoCropRow.add(potato1);
        potatoCropRow.add(potato2);
        potatoCropRow.add(potato3);

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

        CropRow<Crop> potatoCropRow = new CropRow(true, true);

        potatoCropRow.add(potato1);
        potatoCropRow.add(potato2);
        potatoCropRow.add(potato3);
        potatoCropRow.add(potato4);
        potatoCropRow.add(potato5);

        Integer expectedPotatoCropYield = 5;
        Integer actualPotatoCropYield = potatoCropRow.yield();

        Assert.assertEquals(expectedPotatoCropYield, actualPotatoCropYield);
    }

    @Test
    public void cornIsEdibleTest() {
        Corn corn = new Corn();
        Assert.assertTrue(corn.isEdible());
    }

    @Test
    public void tomatoIsEdibleTest() {
        Tomato tomato = new Tomato();
        Assert.assertTrue(tomato.isEdible());
    }

    @Test
    public void potatoIsEdibleTest() {
        Potato potato = new Potato();
        Assert.assertTrue(potato.isEdible());
    }

    @Test
    public void eggIsEdibleTest() {
        Egg egg = new Egg();
        Assert.assertTrue(egg.isEdible());
    }
}
