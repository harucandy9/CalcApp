package jp.techachademy.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import android.util.Log
import android.view.View

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val id = intent.getStringExtra("id")
        val num1 = intent.getDoubleExtra("num1",0.00)
        val num2 = intent.getDoubleExtra("num2", 0.00)

        Log.d("test",id)
        Log.d("test",num1.toString())
        Log.d("test",num2.toString())

        resTextView.text = calcNum(id,num1,num2).toString()

    }

    private fun calcNum : Double (id:String, num1:Double, num2:Double){
//        when(v.id){
//            R.id.plusButton -> return num1+num2
//            R.id.minusButton -> return num1-num2
//            R.id.multiplyButton -> return num1*num2
//            R.id.divideButton -> return num1/num2
//        }
//    }
}
