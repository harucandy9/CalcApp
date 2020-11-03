package jp.techachademy.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener(this)
        minusButton.setOnClickListener(this)
        multiplyButton.setOnClickListener(this)
        divideButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        var num1 = num1EditText.getText().toString().toFloat()
        var num2 = num2EditText.getText().toString().toFloat()

        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("id",v?.id)
        intent.putExtra("num1",num1)
        intent.putExtra("num2",num2)
        startActivity(intent)
    }
}
