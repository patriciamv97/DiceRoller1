/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // and assign it to an immutable variable called rollButton
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{

            //  Remove the Toast and instead create a method called rollDice here. You can

            rollDice()
        }
        // Esta es mi rama donde ponga mi código
    }



    // text of the TextView
    private fun rollDice(){
        //  In rollDice get a Random int between 1 and 6

        // Se mete en la variable numeroAleatorio un numero aleatorio del 1 al 6
        val numeroAleatorio =Random().nextInt(6)+1
        //  In rollDice use findViewById to get a reference to the TextView
        // and assign it to an inmutable variable called resultText
        // Se accede al TextView del layout y al id del TextView
        val resultado : TextView = findViewById(R.id.result_text)
        //In rollDice set the random value that you got above as the
        // Se genera un número aleatorio y se pone en el TextView para que cuando le des el boton aparezca un numero aleatorio
        resultado.text = numeroAleatorio.toString()


    }
}
