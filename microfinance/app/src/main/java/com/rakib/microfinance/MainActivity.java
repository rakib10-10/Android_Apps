package com.rakib.microfinance;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText loan_amount;
    EditText loan_installment;
    EditText loan_percentage;
    TextView total_pay;
    TextView total_installment;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        loan_amount=findViewById(R.id.et_amount);
        loan_installment=findViewById(R.id.et_installment);
        loan_percentage =findViewById(R.id.et_percentage);
        total_pay =findViewById(R.id.tv_total_pay);
        total_installment =findViewById(R.id.tv_installment);
        submit =findViewById(R.id.btn_submit);





        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String price = loan_amount.getText().toString();
                String installment = loan_installment.getText().toString();
                String percentage = loan_percentage.getText().toString();

                Double v_price = Double.valueOf(price);
                Double v_installment = Double.valueOf(installment);
                Double v_percentage = Double.valueOf(percentage);

                Double v_pay=v_price+(v_price*(v_percentage/100));
                Double v_installment_req=v_pay/v_installment;

                total_pay.setVisibility(View.VISIBLE);
                total_installment.setVisibility(View.VISIBLE);

                total_pay.setText(String.valueOf(v_pay));
                total_installment.setText(String.valueOf(v_installment_req));
            }
        });

    }
}