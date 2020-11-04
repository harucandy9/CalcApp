package jp.techachademy.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.support.v7.app.AlertDialog
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

        //入力値が空のときの処理
        if (num1EditText.getText().toString().equals("") || num2EditText.getText().toString().equals("")){
            showAleartDialog()
            return
        }

        //入力値を変換
        val num1 :Double = num1EditText.getText().toString().toDouble()
        val num2 :Double = num2EditText.getText().toString().toDouble()

        //計算
        val res = calc(v,num1,num2)

        //画面遷移と値渡し
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("res",res)
        startActivity(intent)
    }

    private fun calc(v: View?,num1:Double,num2:Double):Double{

        return when (v?.id) {
            R.id.plusButton -> num1 + num2
            R.id.minusButton ->  num1 - num2
            R.id.multiplyButton ->  num1 * num2
            R.id.divideButton ->  num1 / num2
            else -> 0.00
        }
    }

    private fun showAleartDialog(){

        // AlertDialog.Builderクラスを使ってAlertDialogの準備をする
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("入力値エラー")
        alertDialogBuilder.setMessage("なにか数値を入力してください")

        // 肯定ボタンに表示される文字列、押したときのリスナーを設定する
        alertDialogBuilder.setPositiveButton("OK"){dialog, which ->
        }
        // AlertDialogを作成して表示する
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()

    }

}