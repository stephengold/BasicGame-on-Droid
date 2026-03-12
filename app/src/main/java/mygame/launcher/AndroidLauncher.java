package mygame.launcher;

import com.jme3.app.AndroidHarness;
import mygame.Main;

public class AndroidLauncher extends AndroidHarness {

    public AndroidLauncher() {
        this.appClass = Main.class.getCanonicalName();
    }
}
