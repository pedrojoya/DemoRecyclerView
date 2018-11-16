package es.iessaladillo.pedrojoya.demorecyclerview.ui.main;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import es.iessaladillo.pedrojoya.demorecyclerview.data.local.Database;

class MainActivityViewModelFactory implements ViewModelProvider.Factory {

    private final Database database;

    MainActivityViewModelFactory(Database database) {
        this.database = database;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        //noinspection unchecked
        return (T) new MainActivityViewModel(database);
    }

}
