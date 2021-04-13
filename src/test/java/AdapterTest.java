import br.com.oatsolutions.gof.classscope.structural.adapter.BugattiVeyron;
import br.com.oatsolutions.gof.classscope.structural.adapter.EuropeanMovableAdapter;
import br.com.oatsolutions.gof.classscope.structural.adapter.Movable;
import br.com.oatsolutions.gof.classscope.structural.adapter.MovableAdapter;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * File: AdapterTest
 * Project: DesignPatterns
 * File Created: 13/04/2021 16:59
 * Author: compadrejunior
 * Copyright (c) 2021 OAT Solutions, OAT Solutions. All rights reserved.
 */
public class AdapterTest {

    @Test
    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new EuropeanMovableAdapter(bugattiVeyron);

        Assert.assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312,
                0.00001);
    }
}
