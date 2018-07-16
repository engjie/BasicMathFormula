package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;
    ArrayList<MathItem> alMathList;
    CustomAdapter caEmployeeInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMath = findViewById(R.id.listViewMath);

       alMathList = new ArrayList<>();

       MathItem E1 = new MathItem("Area of Rectangle","length*length");
       MathItem E2 = new MathItem("Area of triangle","(length of base * length)/2");
       MathItem E3 = new MathItem("Volume of cube","length*length* length");


        alMathList.add(E1);
        alMathList.add(E2);
        alMathList.add(E3);


        caEmployeeInfo = new CustomAdapter(this, R.layout.math_item,alMathList);
        lvMath.setAdapter(caEmployeeInfo);





    }
}
