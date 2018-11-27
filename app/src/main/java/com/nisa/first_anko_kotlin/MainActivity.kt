package com.nisa.first_anko_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        verticalLayout {

            val a = editText {
                hint ="input something"
                textSize = 12F
            }
            val  b = editText {
                hint = "input something"
                textSize = 12F
            }

            button {
                text = "submit"
                // anko common
                onClick {
                    toast(a.text.toString())


                }
            }

            button {
                text = "ini alert"

                alert {
                    title = "judul"
                    message = ""
                    yesButton {  }
                    noButton {  }
                }.show()
            }

            button {
                text = "pindah"
                startActivity<Main2Activity>("a" to 1 , "b" to "nisa")
            }
        }
    }
}
