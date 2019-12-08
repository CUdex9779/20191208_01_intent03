package kr.co.a20191208_01_intent03

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.E

class MainActivity : AppCompatActivity() {

    val REQ_CODE_FOR_INPUT_NAME = 1000
//    1000이라는 숫자만 보면 어떤 의미로 쓰는 값인지 알기어렵다.
//    상수로 이름을 지어줘서 읽기 편하게 가공
    val REQ_CODE_FOR_INPUT_NICK = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputName.setOnClickListener {
            val intent = Intent( this , edit_name::class.java)


            startActivityForResult(intent,REQ_CODE_FOR_INPUT_NAME)
        }

        inputName2.setOnClickListener {
            val intent = Intent (this,Edit_nick_nameActivity::class.java)

            startActivityForResult(intent,REQ_CODE_FOR_INPUT_NICK)
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

//        어떤 요청에 대한 결과를 가져온건지 확인
        if(requestCode == REQ_CODE_FOR_INPUT_NAME){


//            확인 버튼을 누른게 맞는지 확인
            if (resultCode == Activity.RESULT_OK){

//                결과를 담아둔 Intent가 실제 할때에만 실행됨.
                if (data != null){

                    val inputName = data.getStringExtra("name")

                    nameTxt.text = inputName

                }

            }

        }

        else if(requestCode == REQ_CODE_FOR_INPUT_NICK){


//            확인 버튼을 누른게 맞는지 확인
            if (resultCode == Activity.RESULT_OK){

//                결과를 담아둔 Intent가 실제 할때에만 실행됨.
                if (data != null){

                    val inputName = data.getStringExtra("name")

                    nameTxt2.text = inputName

                }

            }

        }
    }
}
