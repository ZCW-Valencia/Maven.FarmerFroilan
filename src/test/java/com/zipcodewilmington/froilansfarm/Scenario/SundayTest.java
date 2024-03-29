package com.zipcodewilmington.froilansfarm.Scenario;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.CropRow;
import org.junit.Assert;
import org.junit.Test;

public class SundayTest {
    @Test
    public void TestSunday(){
        Crop cornCrop = new Crop(true);
        Crop tomatoCrop = new Crop(true);
        Crop potatoCrop = new Crop(true);


        CropRow<Crop> cropRow1 = new CropRow<>(false, false);
        CropRow<Crop> cropRow2 = new CropRow<>(false, false);
        CropRow<Crop> cropRow3 = new CropRow<>(false, false);

        cropRow1.add(cornCrop);
        cropRow2.add(tomatoCrop);
        cropRow3.add(potatoCrop);



        Assert.assertEquals(true,cornCrop.getHasBeenPlanted());
        Assert.assertEquals(true,tomatoCrop.getHasBeenPlanted());
        Assert.assertEquals(true,potatoCrop.getHasBeenPlanted());
        Assert.assertEquals(1,cropRow1.size());
        Assert.assertEquals(1,cropRow2.size());
        Assert.assertEquals(1,cropRow3.size());



    }
}
