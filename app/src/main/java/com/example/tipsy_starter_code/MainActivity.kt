package com.example.tipsy_starter_code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

private const val TAG = "MainActivity"
private const val INITIAL_TIP_PERCENT = 15

class MainActivity : AppCompatActivity() {
    private lateinit var tipsyBaseAmount: EditText
    private lateinit var seekTipsy: SeekBar
    private lateinit var tipsyPercentage: TextView
    private lateinit var tipsyTipAmount: TextView
    private lateinit var totalTipsyAmount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tipsyBaseAmount = findViewById(R.id.etBase)
        seekTipsy = findViewById(R.id.seekTipsy)
        tipsyPercentage = findViewById(R.id.tipsyPercentage)
        tipsyTipAmount = findViewById(R.id.tipsyTipAmount)
        totalTipsyAmount = findViewById(R.id.totalTipsyAmount)

        seekTipsy.progress = INITIAL_TIP_PERCENT
        tipsyPercentage.text = "$INITIAL_TIP_PERCENT%"
        seekTipsy.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(SeekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.i(TAG, "onProgressChanged $progress")
                tipsyPercentage.text = "$progress%"
                computeTipAndTotal()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
        tipsyBaseAmount.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(p0: Editable?) {
                Log.i(TAG, "afterTextChanged $p0")
                computeTipAndTotal()
            }
        })
    }

    private fun computeTipAndTotal() {
        // 1. Get the value of the Base Amount and Tip Percent

        // 2. Compute the Tip Amount and Total Amount

        // 3. Update the UI with Tip Amount and Total Amount


    }

}
