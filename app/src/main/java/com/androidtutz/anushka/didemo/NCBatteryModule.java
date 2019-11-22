package com.androidtutz.anushka.didemo;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/*@Module
public class NCBatteryModule {

    @Provides
    Battery provideNCBattery(NickelCadmiumBattery nickelCadmiumBattery){
        nickelCadmiumBattery.showType();
        return nickelCadmiumBattery;
    }
} */

@Module
public abstract class NCBatteryModule{

    @Binds
    public abstract Battery bindNCBattery(NickelCadmiumBattery nickelCadmiumBattery);
}
