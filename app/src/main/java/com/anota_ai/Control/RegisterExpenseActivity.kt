package com.anota_ai.Control

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.anota_ai.Model.Expense
import com.anota_ai.R
import com.anota_ai.View.HomeActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.util.*
import kotlin.properties.Delegates


class RegisterExpenseActivity: AppCompatActivity()
{
    //lateinit means that the variable only will be initialize when the oncreate method pass through these lines
    private lateinit var descriptionExpense: EditText;
    private lateinit var priceExpense: EditText;
    private lateinit var dateExpense: Date;
    private var paidExpenseTrue by Delegates.notNull<Boolean>();
    private var paidExpenseFalse by Delegates.notNull<Boolean>();
    private lateinit var btnRegisterExpense:Button;

  /*  private lateinit var database: DatabaseReference
    database = Firebase.database.reference */
    private val database: FirebaseDatabase = FirebaseDatabase.getInstance()

    private lateinit var txt_descriptionExpense:String;
    private var txt_priceExpense by Delegates.notNull<Double>();
    private lateinit var txt_dateExpense:Date;
    private var txt_paidExpenseTrue by Delegates.notNull<Boolean>();
    private var txt_paidExpenseFalse by Delegates.notNull<Boolean>();

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_expense);

        descriptionExpense = findViewById(R.id.input_register_description);
        priceExpense = findViewById(R.id.input_register_price_expense);
       /* dateExpense = findViewById<>(R.id.input_register_expense_date);
        paidExpenseTrue = findViewById<>(R.id.radio_btn_register_expense_status_paid);
        paidExpenseFalse = findViewById<>(R.id.radio_btn_register_expense_status_open); */

    }

    private fun registerExpense(expenseId: String?, txt_descriptionExpense: String?)
    {
        val databaseReferenceInstance: DatabaseReference = database.getReference();
        var databaseReference: DatabaseReference = databaseReferenceInstance.child("expense");

        //databaseReference = database.getReference("expense");

        this.txt_descriptionExpense = descriptionExpense.toString();
        val expense = Expense.Expense(txt_descriptionExpense);

        if (expenseId != null) {
            databaseReference.child("expense").child(expenseId).setValue(expense);
        }
    }

  /*  fun registerExpense(view: View)
    {
        val databaseReferenceInstance: DatabaseReference = database.getReference();
        var databaseReference: DatabaseReference = databaseReferenceInstance.child("expense");

        txt_descriptionExpense = descriptionExpense.text.toString();

        databaseReference = database.getReference("expense");

        //setar dados na classe Expense

        /* Transfering data into Firebase object reference */
        userApp.setId(databaseReference.push().getKey());

        /* Data ransfered from object to Firebase database */
        databaseReference.child(userApp.getId()).setValue(userApp);

        val intent = Intent(this, HomeActivity::class.java);
        startActivity(intent);
    } */
}