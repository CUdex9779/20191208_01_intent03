package kr.co.a20191208_01_intent03

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class Edit_nick_nameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        cancelBtn.setOnClickListener {
            finish()
        }

        okBtn.setOnClickListener {
            val inputNickName = inputNick.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("name",inputNickName)

            setResult(Activity.RESULT_OK,resultIntent)

            finish()
        }
    }
}
