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
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    // Extraemos la variable ImageView
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            rollDice()
        }
        // Inicializamos la variable ImageView aquí
        diceImage = findViewById(R.id.image)

    }
    // Función ramdon cambiada , antes : val numeroAleatorio =Random().nextInt(6)+1 , ahora :  val randomInt = (1 until 7).random()
    private fun rollDice(){
        val randomInt = (1 until 7).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.cara1
            2 -> R.drawable.cara2
            3 -> R.drawable.cara3
            4 -> R.drawable.cara4
            5 -> R.drawable.cara5
            else-> R.drawable.cara6
        }
        diceImage.setImageResource(drawableResource)
    }
    }

