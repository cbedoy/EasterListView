package cbedoy.easterlist.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

import cbedoy.easterlist.R;
import cbedoy.easterlist.ViewCell;


public class MainActivity extends ActionBarActivity {

    private ListView listView;
    private ArrayList<HashMap<String, Object>> dataModel;
    private ViewCell viewCell;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildMockData();
        listView = (ListView) findViewById(R.id.listView);
        viewCell = new ViewCell(dataModel);
        listView.setAdapter(viewCell);
        viewCell.notifyDataSetChanged();
    }
    

    private void buildMockData()
    {
        dataModel = new ArrayList<>();
        HashMap<String, Object> model;
        model = new HashMap<>();    model.put("value", "Beer");             dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Pokemon");          dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Skate");            dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Coffe");            dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Xbox 360");         dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Montana");          dataModel.add(model);
        model = new HashMap<>();    model.put("value", "GYM");              dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Pointer");          dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Girld friend");     dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Pademobile");       dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Maruchan");         dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Subway");           dataModel.add(model);
        model = new HashMap<>();    model.put("value", "CFE");              dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Bus");              dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Mouse");            dataModel.add(model);
        model = new HashMap<>();    model.put("value", "iMAC");             dataModel.add(model);
        model = new HashMap<>();    model.put("value", "iPhone");           dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Hipster");          dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Pull & Bear");      dataModel.add(model);
        model = new HashMap<>();    model.put("value", "HP");               dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Matematics");       dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Bills");            dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Trova");            dataModel.add(model);
        model = new HashMap<>();    model.put("value", "Fingerstyle");      dataModel.add(model);
    }

}
