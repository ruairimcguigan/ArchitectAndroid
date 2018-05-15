package android.architect.aquidigital;

import android.app.Application;
import android.architect.aquidigital.di.AppComponent;
import android.architect.aquidigital.di.AppModule;
import android.architect.aquidigital.di.DaggerAppComponent;

public class App extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getComponent() {
        return component;
    }
}
