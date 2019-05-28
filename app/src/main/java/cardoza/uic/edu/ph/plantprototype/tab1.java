package cardoza.uic.edu.ph.plantprototype;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.content.Intent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class tab1 extends Fragment implements OnClickListener{

    FloatingActionButton button;

    public static tab1 newInstance() {
        return new tab1();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab1, null);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button = getView().findViewById(R.id.btn_new);

        // Capture button clicks
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View arg0) {

        // Start NewActivity.class
        Intent myIntent = new Intent(tab1.this.getActivity(), creategh.class);
        startActivity(myIntent);
    }
}
