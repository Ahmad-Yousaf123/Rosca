package ahmed.umer.rosca;

import android.app.Application;

/**
 * Created by AliAh on 11/04/2018.
 */

public class Rosca  extends Application{
    private static Rosca instance;

    public static Rosca getInstance(){
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
