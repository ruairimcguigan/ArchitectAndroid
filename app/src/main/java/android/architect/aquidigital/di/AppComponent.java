package android.architect.aquidigital.di;

import android.architect.aquidigital.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = { AppModule.class })
public interface AppComponent {

    void inject (MainActivity activity);
}
