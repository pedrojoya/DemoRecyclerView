package es.iessaladillo.pedrojoya.demorecyclerview.ui.main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import es.iessaladillo.pedrojoya.demorecyclerview.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Use setContentView from data binding library and save the binding as field.
        setContentView(R.layout.activity_main);

        // TODO: Obtain viewModel (better using MainActivityViewModelFactory).

        // TODO: Give viewModel to binding.
        // TODO: Give lifecycle to binding.
        setupViews();
        // TODO: Observe data from viewModel, giving them to adapter
        // TODO: Observe emptyView visibility state.
    }

    private void setupViews() {
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        // TODO: Create adapter. Set listeners of adapter.
        // TODO: Setup recyclerView. Give adapter to recyclerview.
    }

}
