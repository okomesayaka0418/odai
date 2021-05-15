package app.yonezawa.yone.count_odai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    //残り時間のセット
    var second = 10

    //タイマーを設定する
    val timer: CountDownTimer = object : CountDownTimer(10000, 1000) {
        //タイマーが終了するときに呼ばれる
        override fun onFinish() {
            //STARTボタンを表示する
            sturtButton.isVisible = true
            //残り時間をリセットする
            second = 10
            //時間の表示を元に戻す
            secondText.text = second.toString()
        }

        override fun onTick(millisUntilFinished: Long) {
            //残り時間を1秒ずつ減らす
            second = second - 1
            //残り時間を表示する
            secondText.text = second.toString()
        }
    }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            //残り時間を表示する
            secondText.text = second.toString()
            //STARTボタンがタップされたとき
            sturtButton.setOnClickListener {
                //STARTボタンを見えない状況にする
                sturtButton.isVisible = false
                //タイマーを開始する
                timer.start()

            }

            var number: Int = 0
            numberTextViwe.text = "0"

            mickeyButton.setOnClickListener {
                number = number + 1
                numberTextViwe.text = number.toString()
            }

            MaxButton.setOnClickListener {
                number = number + 1
                numberTextViwe.text = number.toString()
            }
            LiloButton.setOnClickListener {
                number = number + 1
                numberTextViwe.text = number.toString()
            }
            chiristophButton.setOnClickListener {
                number = number + 1
                numberTextViwe.text = number.toString()
            }

            geratoniButton.setOnClickListener {
                number = number + 1
                numberTextViwe.text = number.toString()
            }
            minionButton.setOnClickListener {
                number = number - 1
                numberTextViwe.text = number.toString()
            }
            supidermanButton.setOnClickListener {
                number = number - 1
                numberTextViwe.text = number.toString()
            }
            snoopyButton.setOnClickListener {
                number = number - 1
                numberTextViwe.text = number.toString()
            }
            ElmoButton.setOnClickListener {
                number = number - 1
                numberTextViwe.text = number.toString()
            }
            kittyButton.setOnClickListener {
                number = number - 1
                numberTextViwe.text = number.toString()
            }

        }
    }

