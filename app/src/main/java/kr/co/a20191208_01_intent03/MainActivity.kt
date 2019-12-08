package kr.co.a20191208_01_intent03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.E

class MainActivity : AppCompatActivity() {

    val REQ_CODE_FOR_INPUT_NAME = 1000
//    1000이라는 숫자만 보면 어떤 의미로 쓰는 값인지 알기어렵다.
//    상수로 이름을 지어줘서 읽기 편하게 가공

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputName.setOnClickListener {
            val intent = Intent( this , edit_name::class.java)


            startActivityForResult(intent,REQ_CODE_FOR_INPUT_NAME)
        }
    }
}
