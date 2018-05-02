package ahmed.umer.rosca;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by AliAh on 11/04/2018.
 */

public class SharedPrefs {

    private SharedPrefs() {
    }

    public static void setUserPin(String pin){
        preferenceSetter("userPin",pin);
    }

    public static String getUserPin(){
        return preferenceGetter("userPin");
    }

    public static void preferenceSetter(String key, String value) {
        SharedPreferences pref = Rosca.getInstance().getApplicationContext().getSharedPreferences("user", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String preferenceGetter(String key) {
        SharedPreferences pref;
        String value = "";
        pref = Rosca.getInstance().getApplicationContext().getSharedPreferences("user", Context.MODE_PRIVATE);
        value = pref.getString(key, "");
        return value;
    }
}
