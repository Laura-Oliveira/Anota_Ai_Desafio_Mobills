package com.anota_ai.Model

import android.text.format.DateUtils
import com.google.firebase.firestore.IgnoreExtraProperties
import java.util.*


public class Expense
{
    @IgnoreExtraProperties
    data class Expense(
        var expenseId: String? = "",
        var descriptionExpense: String? = "",
        var priceExpense: Double? = 0.0,
        var expensePaid: Boolean? = true
      //  var dateExpense: Date = 00-00-0000
    )

  /*  var description: String = "";
        init {
            this.description = description;
        }

    var price: Int = 0;
    init {
        this.price = price;
    }

 /*   var date: Date;
    init {
        this.date = date;
    } */

    var expensePaid: Boolean = true;
    init {
        this.expensePaid = expensePaid;
    } */

}