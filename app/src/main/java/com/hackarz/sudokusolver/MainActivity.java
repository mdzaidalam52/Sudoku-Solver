package com.hackarz.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int[][] a;
    private Button solve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText e = findViewById(R.id.editTextNumber00);
        if(e.getText().toString().isEmpty())
        a = new int[9][9];
        solve = findViewById(R.id.solve_btn);
        solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a[0][0] = ((EditText)findViewById(R.id.editTextNumber00)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber00)).getText().toString().trim());
                a[0][1] = ((EditText)findViewById(R.id.editTextNumber01)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber01)).getText().toString().trim());
                a[0][2] = ((EditText)findViewById(R.id.editTextNumber02)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber02)).getText().toString().trim());
                a[0][3] = ((EditText)findViewById(R.id.editTextNumber03)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber03)).getText().toString().trim());
                a[0][4] = ((EditText)findViewById(R.id.editTextNumber04)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber04)).getText().toString().trim());
                a[0][5] = ((EditText)findViewById(R.id.editTextNumber05)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber05)).getText().toString().trim());
                a[0][6] = ((EditText)findViewById(R.id.editTextNumber06)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber06)).getText().toString().trim());
                a[0][7] = ((EditText)findViewById(R.id.editTextNumber07)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber07)).getText().toString().trim());
                a[0][8] = ((EditText)findViewById(R.id.editTextNumber08)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber08)).getText().toString().trim());

                a[1][0] = ((EditText)findViewById(R.id.editTextNumber10)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber10)).getText().toString().trim());
                a[1][1] = ((EditText)findViewById(R.id.editTextNumber11)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber11)).getText().toString().trim());
                a[1][2] = ((EditText)findViewById(R.id.editTextNumber12)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber12)).getText().toString().trim());
                a[1][3] = ((EditText)findViewById(R.id.editTextNumber13)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber13)).getText().toString().trim());
                a[1][4] = ((EditText)findViewById(R.id.editTextNumber14)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber14)).getText().toString().trim());
                a[1][5] = ((EditText)findViewById(R.id.editTextNumber15)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber15)).getText().toString().trim());
                a[1][6] = ((EditText)findViewById(R.id.editTextNumber16)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber16)).getText().toString().trim());
                a[1][7] = ((EditText)findViewById(R.id.editTextNumber17)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber17)).getText().toString().trim());
                a[1][8] = ((EditText)findViewById(R.id.editTextNumber18)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber18)).getText().toString().trim());

                a[2][0] = ((EditText)findViewById(R.id.editTextNumber20)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber20)).getText().toString().trim());
                a[2][1] = ((EditText)findViewById(R.id.editTextNumber21)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber21)).getText().toString().trim());
                a[2][2] = ((EditText)findViewById(R.id.editTextNumber22)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber22)).getText().toString().trim());
                a[2][3] = ((EditText)findViewById(R.id.editTextNumber23)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber23)).getText().toString().trim());
                a[2][4] = ((EditText)findViewById(R.id.editTextNumber24)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber24)).getText().toString().trim());
                a[2][5] = ((EditText)findViewById(R.id.editTextNumber25)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber25)).getText().toString().trim());
                a[2][6] = ((EditText)findViewById(R.id.editTextNumber26)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber26)).getText().toString().trim());
                a[2][7] = ((EditText)findViewById(R.id.editTextNumber27)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber27)).getText().toString().trim());
                a[2][8] = ((EditText)findViewById(R.id.editTextNumber28)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber28)).getText().toString().trim());

                a[3][0] = ((EditText)findViewById(R.id.editTextNumber30)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber30)).getText().toString().trim());
                a[3][1] = ((EditText)findViewById(R.id.editTextNumber31)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber31)).getText().toString().trim());
                a[3][2] = ((EditText)findViewById(R.id.editTextNumber32)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber32)).getText().toString().trim());
                a[3][3] = ((EditText)findViewById(R.id.editTextNumber33)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber33)).getText().toString().trim());
                a[3][4] = ((EditText)findViewById(R.id.editTextNumber34)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber34)).getText().toString().trim());
                a[3][5] = ((EditText)findViewById(R.id.editTextNumber35)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber35)).getText().toString().trim());
                a[3][6] = ((EditText)findViewById(R.id.editTextNumber36)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber36)).getText().toString().trim());
                a[3][7] = ((EditText)findViewById(R.id.editTextNumber37)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber37)).getText().toString().trim());
                a[3][8] = ((EditText)findViewById(R.id.editTextNumber38)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber38)).getText().toString().trim());

                a[4][0] = ((EditText)findViewById(R.id.editTextNumber40)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber40)).getText().toString().trim());
                a[4][1] = ((EditText)findViewById(R.id.editTextNumber41)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber41)).getText().toString().trim());
                a[4][2] = ((EditText)findViewById(R.id.editTextNumber42)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber42)).getText().toString().trim());
                a[4][3] = ((EditText)findViewById(R.id.editTextNumber43)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber43)).getText().toString().trim());
                a[4][4] = ((EditText)findViewById(R.id.editTextNumber44)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber44)).getText().toString().trim());
                a[4][5] = ((EditText)findViewById(R.id.editTextNumber45)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber45)).getText().toString().trim());
                a[4][6] = ((EditText)findViewById(R.id.editTextNumber46)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber46)).getText().toString().trim());
                a[4][7] = ((EditText)findViewById(R.id.editTextNumber47)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber47)).getText().toString().trim());
                a[4][8] = ((EditText)findViewById(R.id.editTextNumber48)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber48)).getText().toString().trim());

                a[5][0] = ((EditText)findViewById(R.id.editTextNumber50)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber50)).getText().toString().trim());
                a[5][1] = ((EditText)findViewById(R.id.editTextNumber51)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber51)).getText().toString().trim());
                a[5][2] = ((EditText)findViewById(R.id.editTextNumber52)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber52)).getText().toString().trim());
                a[5][3] = ((EditText)findViewById(R.id.editTextNumber53)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber53)).getText().toString().trim());
                a[5][4] = ((EditText)findViewById(R.id.editTextNumber54)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber54)).getText().toString().trim());
                a[5][5] = ((EditText)findViewById(R.id.editTextNumber55)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber55)).getText().toString().trim());
                a[5][6] = ((EditText)findViewById(R.id.editTextNumber56)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber56)).getText().toString().trim());
                a[5][7] = ((EditText)findViewById(R.id.editTextNumber57)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber57)).getText().toString().trim());
                a[5][8] = ((EditText)findViewById(R.id.editTextNumber58)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber58)).getText().toString().trim());

                a[6][0] = ((EditText)findViewById(R.id.editTextNumber60)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber60)).getText().toString().trim());
                a[6][1] = ((EditText)findViewById(R.id.editTextNumber61)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber61)).getText().toString().trim());
                a[6][2] = ((EditText)findViewById(R.id.editTextNumber62)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber62)).getText().toString().trim());
                a[6][3] = ((EditText)findViewById(R.id.editTextNumber63)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber63)).getText().toString().trim());
                a[6][4] = ((EditText)findViewById(R.id.editTextNumber64)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber64)).getText().toString().trim());
                a[6][5] = ((EditText)findViewById(R.id.editTextNumber65)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber65)).getText().toString().trim());
                a[6][6] = ((EditText)findViewById(R.id.editTextNumber66)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber66)).getText().toString().trim());
                a[6][7] = ((EditText)findViewById(R.id.editTextNumber67)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber67)).getText().toString().trim());
                a[6][8] = ((EditText)findViewById(R.id.editTextNumber68)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber68)).getText().toString().trim());

                a[7][0] = ((EditText)findViewById(R.id.editTextNumber70)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber70)).getText().toString().trim());
                a[7][1] = ((EditText)findViewById(R.id.editTextNumber71)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber71)).getText().toString().trim());
                a[7][2] = ((EditText)findViewById(R.id.editTextNumber72)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber72)).getText().toString().trim());
                a[7][3] = ((EditText)findViewById(R.id.editTextNumber73)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber73)).getText().toString().trim());
                a[7][4] = ((EditText)findViewById(R.id.editTextNumber74)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber74)).getText().toString().trim());
                a[7][5] = ((EditText)findViewById(R.id.editTextNumber75)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber75)).getText().toString().trim());
                a[7][6] = ((EditText)findViewById(R.id.editTextNumber76)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber76)).getText().toString().trim());
                a[7][7] = ((EditText)findViewById(R.id.editTextNumber77)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber77)).getText().toString().trim());
                a[7][8] = ((EditText)findViewById(R.id.editTextNumber78)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber78)).getText().toString().trim());

                a[8][0] = ((EditText)findViewById(R.id.editTextNumber80)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber80)).getText().toString().trim());
                a[8][1] = ((EditText)findViewById(R.id.editTextNumber81)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber81)).getText().toString().trim());
                a[8][2] = ((EditText)findViewById(R.id.editTextNumber82)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber82)).getText().toString().trim());
                a[8][3] = ((EditText)findViewById(R.id.editTextNumber83)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber83)).getText().toString().trim());
                a[8][4] = ((EditText)findViewById(R.id.editTextNumber84)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber84)).getText().toString().trim());
                a[8][5] = ((EditText)findViewById(R.id.editTextNumber85)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber85)).getText().toString().trim());
                a[8][6] = ((EditText)findViewById(R.id.editTextNumber86)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber86)).getText().toString().trim());
                a[8][7] = ((EditText)findViewById(R.id.editTextNumber87)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber87)).getText().toString().trim());
                a[8][8] = ((EditText)findViewById(R.id.editTextNumber88)).getText().toString().isEmpty() ? 0 : Integer.parseInt(((EditText)findViewById(R.id.editTextNumber88)).getText().toString().trim());
                Log.d("sudoku", "input taken");
                boolean bool = checkPossibility(a);
                Log.d("sudoku", "after checking possibility");
                if(solve(a, 0, 0)){
                    Log.d("sudoku", "after solving");
                    if(!bool) {
                        Toast.makeText(getApplicationContext(), "This sudoku puzzle can have more than one solution", Toast.LENGTH_SHORT).show();
                    }
                    ((EditText)findViewById(R.id.editTextNumber00)).setText(Integer.toString(a[0][0]));
                    ((EditText)findViewById(R.id.editTextNumber01)).setText(Integer.toString(a[0][1]));
                    ((EditText)findViewById(R.id.editTextNumber02)).setText(Integer.toString(a[0][2]));
                    ((EditText)findViewById(R.id.editTextNumber03)).setText(Integer.toString(a[0][3]));
                    ((EditText)findViewById(R.id.editTextNumber04)).setText(Integer.toString(a[0][4]));
                    ((EditText)findViewById(R.id.editTextNumber05)).setText(Integer.toString(a[0][5]));
                    ((EditText)findViewById(R.id.editTextNumber06)).setText(Integer.toString(a[0][6]));
                    ((EditText)findViewById(R.id.editTextNumber07)).setText(Integer.toString(a[0][7]));
                    ((EditText)findViewById(R.id.editTextNumber08)).setText(Integer.toString(a[0][8]));

                    ((EditText)findViewById(R.id.editTextNumber10)).setText(Integer.toString(a[1][0]));
                    ((EditText)findViewById(R.id.editTextNumber11)).setText(Integer.toString(a[1][1]));
                    ((EditText)findViewById(R.id.editTextNumber12)).setText(Integer.toString(a[1][2]));
                    ((EditText)findViewById(R.id.editTextNumber13)).setText(Integer.toString(a[1][3]));
                    ((EditText)findViewById(R.id.editTextNumber14)).setText(Integer.toString(a[1][4]));
                    ((EditText)findViewById(R.id.editTextNumber15)).setText(Integer.toString(a[1][5]));
                    ((EditText)findViewById(R.id.editTextNumber16)).setText(Integer.toString(a[1][6]));
                    ((EditText)findViewById(R.id.editTextNumber17)).setText(Integer.toString(a[1][7]));
                    ((EditText)findViewById(R.id.editTextNumber18)).setText(Integer.toString(a[1][8]));

                    ((EditText)findViewById(R.id.editTextNumber20)).setText(Integer.toString(a[2][0]));
                    ((EditText)findViewById(R.id.editTextNumber21)).setText(Integer.toString(a[2][1]));
                    ((EditText)findViewById(R.id.editTextNumber22)).setText(Integer.toString(a[2][2]));
                    ((EditText)findViewById(R.id.editTextNumber23)).setText(Integer.toString(a[2][3]));
                    ((EditText)findViewById(R.id.editTextNumber24)).setText(Integer.toString(a[2][4]));
                    ((EditText)findViewById(R.id.editTextNumber25)).setText(Integer.toString(a[2][5]));
                    ((EditText)findViewById(R.id.editTextNumber26)).setText(Integer.toString(a[2][6]));
                    ((EditText)findViewById(R.id.editTextNumber27)).setText(Integer.toString(a[2][7]));
                    ((EditText)findViewById(R.id.editTextNumber28)).setText(Integer.toString(a[2][8]));

                    ((EditText)findViewById(R.id.editTextNumber31)).setText(Integer.toString(a[3][1]));
                    ((EditText)findViewById(R.id.editTextNumber32)).setText(Integer.toString(a[3][2]));
                    ((EditText)findViewById(R.id.editTextNumber33)).setText(Integer.toString(a[3][3]));
                    ((EditText)findViewById(R.id.editTextNumber34)).setText(Integer.toString(a[3][4]));
                    ((EditText)findViewById(R.id.editTextNumber35)).setText(Integer.toString(a[3][5]));
                    ((EditText)findViewById(R.id.editTextNumber36)).setText(Integer.toString(a[3][6]));
                    ((EditText)findViewById(R.id.editTextNumber37)).setText(Integer.toString(a[3][7]));
                    ((EditText)findViewById(R.id.editTextNumber38)).setText(Integer.toString(a[3][8]));
                    ((EditText)findViewById(R.id.editTextNumber30)).setText(Integer.toString(a[3][0]));

                    ((EditText)findViewById(R.id.editTextNumber40)).setText(Integer.toString(a[4][0]));
                    ((EditText)findViewById(R.id.editTextNumber41)).setText(Integer.toString(a[4][1]));
                    ((EditText)findViewById(R.id.editTextNumber42)).setText(Integer.toString(a[4][2]));
                    ((EditText)findViewById(R.id.editTextNumber43)).setText(Integer.toString(a[4][3]));
                    ((EditText)findViewById(R.id.editTextNumber44)).setText(Integer.toString(a[4][4]));
                    ((EditText)findViewById(R.id.editTextNumber45)).setText(Integer.toString(a[4][5]));
                    ((EditText)findViewById(R.id.editTextNumber46)).setText(Integer.toString(a[4][6]));
                    ((EditText)findViewById(R.id.editTextNumber47)).setText(Integer.toString(a[4][7]));
                    ((EditText)findViewById(R.id.editTextNumber48)).setText(Integer.toString(a[4][8]));

                    ((EditText)findViewById(R.id.editTextNumber50)).setText(Integer.toString(a[5][0]));
                    ((EditText)findViewById(R.id.editTextNumber51)).setText(Integer.toString(a[5][1]));
                    ((EditText)findViewById(R.id.editTextNumber52)).setText(Integer.toString(a[5][2]));
                    ((EditText)findViewById(R.id.editTextNumber53)).setText(Integer.toString(a[5][3]));
                    ((EditText)findViewById(R.id.editTextNumber54)).setText(Integer.toString(a[5][4]));
                    ((EditText)findViewById(R.id.editTextNumber55)).setText(Integer.toString(a[5][5]));
                    ((EditText)findViewById(R.id.editTextNumber56)).setText(Integer.toString(a[5][6]));
                    ((EditText)findViewById(R.id.editTextNumber57)).setText(Integer.toString(a[5][7]));
                    ((EditText)findViewById(R.id.editTextNumber58)).setText(Integer.toString(a[5][8]));


                    ((EditText)findViewById(R.id.editTextNumber60)).setText(Integer.toString(a[6][0]));
                    ((EditText)findViewById(R.id.editTextNumber61)).setText(Integer.toString(a[6][1]));
                    ((EditText)findViewById(R.id.editTextNumber62)).setText(Integer.toString(a[6][2]));
                    ((EditText)findViewById(R.id.editTextNumber63)).setText(Integer.toString(a[6][3]));
                    ((EditText)findViewById(R.id.editTextNumber64)).setText(Integer.toString(a[6][4]));
                    ((EditText)findViewById(R.id.editTextNumber65)).setText(Integer.toString(a[6][5]));
                    ((EditText)findViewById(R.id.editTextNumber66)).setText(Integer.toString(a[6][6]));
                    ((EditText)findViewById(R.id.editTextNumber67)).setText(Integer.toString(a[6][7]));
                    ((EditText)findViewById(R.id.editTextNumber68)).setText(Integer.toString(a[6][8]));

                    ((EditText)findViewById(R.id.editTextNumber70)).setText(Integer.toString(a[7][0]));
                    ((EditText)findViewById(R.id.editTextNumber71)).setText(Integer.toString(a[7][1]));
                    ((EditText)findViewById(R.id.editTextNumber72)).setText(Integer.toString(a[7][2]));
                    ((EditText)findViewById(R.id.editTextNumber73)).setText(Integer.toString(a[7][3]));
                    ((EditText)findViewById(R.id.editTextNumber74)).setText(Integer.toString(a[7][4]));
                    ((EditText)findViewById(R.id.editTextNumber75)).setText(Integer.toString(a[7][5]));
                    ((EditText)findViewById(R.id.editTextNumber76)).setText(Integer.toString(a[7][6]));
                    ((EditText)findViewById(R.id.editTextNumber77)).setText(Integer.toString(a[7][7]));
                    ((EditText)findViewById(R.id.editTextNumber78)).setText(Integer.toString(a[7][8]));

                    ((EditText)findViewById(R.id.editTextNumber80)).setText(Integer.toString(a[8][0]));
                    ((EditText)findViewById(R.id.editTextNumber81)).setText(Integer.toString(a[8][1]));
                    ((EditText)findViewById(R.id.editTextNumber82)).setText(Integer.toString(a[8][2]));
                    ((EditText)findViewById(R.id.editTextNumber83)).setText(Integer.toString(a[8][3]));
                    ((EditText)findViewById(R.id.editTextNumber84)).setText(Integer.toString(a[8][4]));
                    ((EditText)findViewById(R.id.editTextNumber85)).setText(Integer.toString(a[8][5]));
                    ((EditText)findViewById(R.id.editTextNumber86)).setText(Integer.toString(a[8][6]));
                    ((EditText)findViewById(R.id.editTextNumber87)).setText(Integer.toString(a[8][7]));
                    ((EditText)findViewById(R.id.editTextNumber88)).setText(Integer.toString(a[8][8]));
                    Log.d("sudoku", "Updated ui");
                }else{
                    Toast.makeText(getApplicationContext(), "Can't solve this sudoku puzzle. Please check the puzzle once more.", Toast.LENGTH_LONG).show();
                }



            }
        });

    }

    private boolean checkPossibility(int[][] a) {
        int k = 0;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(a[i][j] != 0){
                    k++;
                    if(k > 17){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean solve(int[][] a, int x, int y) {
        boolean bool = false;
        if(a[x][y] != 0) {
            if(x == 8 && y == 8) {
                return true;
            }else if(y == 8) {
                return solve(a, x+1, 0);
            }else {
                return solve(a, x, y+1);
            }
        }else {
            bool = true;
            for(int i = 1; i <= 9; i++) {
                if(check(a, x, y, i)) {
                    a[x][y] = i;

                    if(x == 8 && y == 8) {
                        return true;
                    }else if(y == 8) {
                        if(solve(a, x+1, 0)){
                            return true;
                        }
                    }else {
                        if(solve(a, x, y+1)) {
                            return true;
                        }
                    }
                }

            }
        }
        if(bool)
            a[x][y] = 0;
        return false;
    }

    private boolean check(int[][] a, int x, int y, int k) {

        for(int i = 0 ; i < 9; i++)
            if(a[i][y] == k || a[x][i] == k)
                return false;

        for(int i = 3*(x/3); i < 3*(x/3) + 3; i++)
            for(int j = 3*(y/3); j < 3*(y/3) + 3; j++)
                if(a[i][j] == k)
                    return false;

        return true;
    }
}