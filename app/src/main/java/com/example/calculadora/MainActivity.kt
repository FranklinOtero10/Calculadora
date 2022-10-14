package com.example.calculadora


import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sqrt

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var txvOperacion: TextView
    private lateinit var txvResultado: TextView
    var operacion: Int = 0
    var num1: Double = 0.0
    var num2: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        txvOperacion = findViewById(R.id.txvOperacion)
        txvResultado = findViewById(R.id.txvResultado)
        inicializar()

    }

    private fun inicializar() {
        val btnNumero0: Button = findViewById(R.id.btnNumero0)
        btnNumero0.setOnClickListener(this)
        val btnNumero1: Button = findViewById(R.id.btnNumero1)
        btnNumero1.setOnClickListener(this)
        val btnNumero2: Button = findViewById(R.id.btnNumero2)
        btnNumero2.setOnClickListener(this)
        val btnNumero3: Button = findViewById(R.id.btnNumero3)
        btnNumero3.setOnClickListener(this)
        val btnNumero4: Button = findViewById(R.id.btnNumero4)
        btnNumero4.setOnClickListener(this)
        val btnNumero5: Button = findViewById(R.id.btnNumero5)
        btnNumero5.setOnClickListener(this)
        val btnNumero6: Button = findViewById(R.id.btnNumero6)
        btnNumero6.setOnClickListener(this)
        val btnNumero7: Button = findViewById(R.id.btnNumero7)
        btnNumero7.setOnClickListener(this)
        val btnNumero8: Button = findViewById(R.id.btnNumero8)
        btnNumero8.setOnClickListener(this)
        val btnNumero9: Button = findViewById(R.id.btnNumero9)
        btnNumero9.setOnClickListener(this)
        val btnClearAll: Button = findViewById(R.id.btnClearAll)
        btnClearAll.setOnClickListener(this)
        val btnPunto: Button = findViewById(R.id.btnPunto)
        btnPunto.setOnClickListener(this)
        val btnPorcentaje: Button = findViewById(R.id.btnPorcentaje)
        btnPorcentaje.setOnClickListener(this)
        val btnSuma: Button = findViewById(R.id.btnSuma)
        btnSuma.setOnClickListener(this)
        val btnResta: Button = findViewById(R.id.btnResta)
        btnResta.setOnClickListener(this)
        val btnMultiplicacion: Button = findViewById(R.id.btnMultiplicacion)
        btnMultiplicacion.setOnClickListener(this)
        val btnDivision: Button = findViewById(R.id.btnDivision)
        btnDivision.setOnClickListener(this)
        val btnIgual: Button = findViewById(R.id.btnIgual)
        btnIgual.setOnClickListener(this)
        val btnRaiz: Button = findViewById(R.id.btnSQRT)
        btnRaiz.setOnClickListener(this)
    }

    fun asignarNumero() {
        val num = txvResultado.text.toString()
        val texto: String = num + "0"
        txvResultado.text = texto
    }

    fun asignarNumero1() {
        val num = txvResultado.text.toString()
        val texto: String = num + "1"
        txvResultado.text = texto
    }

    fun asignarNumero2() {
        val num = txvResultado.text.toString()
        val texto: String = num + "2"
        txvResultado.text = texto
    }

    fun asignarNumero3() {
        val num = txvResultado.text.toString()
        val texto: String = num + "3"
        txvResultado.text = texto
    }

    fun asignarNumero4() {
        val num = txvResultado.text.toString()
        val texto: String = num + "4"
        txvResultado.text = texto
    }

    fun asignarNumero5() {
        val num = txvResultado.text.toString()
        val texto: String = num + "5"
        txvResultado.text = texto
    }

    fun asignarNumero6() {
        val num = txvResultado.text.toString()
        val texto: String = num + "6"
        txvResultado.text = texto
    }

    fun asignarNumero7() {
        val num = txvResultado.text.toString()
        val texto: String = num + "7"
        txvResultado.text = texto
    }

    fun asignarNumero8() {
        val num = txvResultado.text.toString()
        val texto: String = num + "8"
        txvResultado.text = texto
    }

    fun asignarNumero9() {
        val num = txvResultado.text.toString()
        val texto: String = num + "9"
        txvResultado.text = texto
    }

    fun asignarPunto() {
        val num = txvResultado.text.toString()
        //val texto:String = num + "."
        var texto: String = ""
        if (num.isEmpty()) {
            texto = "0."
            txvResultado.text = texto
        } else if (num.contains(".")) {
            texto = num
            txvResultado.text = texto
        }/*else if (num.contains("+") || num.contains("-") || num.contains("*") || num.contains("/")){

        }*/ else {
            texto = num + "."
            txvResultado.text = texto
        }
    }

    fun asignarSuma() {
        operacion = 1
        num1 = txvResultado.text.toString().toDouble()
        txvResultado.text = ""
        val texto: String = num1.toString() + "+"
        txvOperacion.text = texto

    }

    fun asignarResta() {
        operacion = 2
        num1 = txvResultado.text.toString().toDouble()
        txvResultado.text = ""
        val texto: String = num1.toString() + "-"
        txvOperacion.text = texto

    }

    fun asignarMultiplicacion() {
        operacion = 3
        num1 = txvResultado.text.toString().toDouble()
        txvResultado.text = ""
        val texto: String = num1.toString() + "X"
        txvOperacion.text = texto

    }

    fun asignarDivision() {
        operacion = 4
        num1 = txvResultado.text.toString().toDouble()
        txvResultado.text = ""
        val texto: String = num1.toString() + "/"
        txvOperacion.text = texto

    }

    fun asignarPorcentaje() {
        num1 = txvResultado.text.toString().toDouble()
        var resultado:Double = 0.0
        var texto:String = ""

        resultado = num1 / 100
        texto = num1.toString() + "%"
        txvOperacion.text = texto

        txvResultado.text = resultado.toString()

    }

    fun asignarRaiz(){
        operacion = 5
        val num = txvOperacion.text.toString()
        val texto:String = "√" + num
        txvResultado.text = ""
        txvOperacion.text = texto
    }

    //Equivale al boton igual =
    fun procesarOperacion() {
        num2 = txvResultado.text.toString().toDouble()
        var resultado: Double = 0.0

        when (operacion) {
            1 -> {
                resultado = num1 + num2
                //val proceso = num1.toString() + "+" + num2.toString()
                val proceso = "$num1+$num2"
                txvOperacion.text = proceso
            }
            2 -> {
                resultado = num1 - num2
                val proceso = "$num1-$num2"
                txvOperacion.text = proceso
            }
            3 -> {
                resultado = num1 * num2
                val proceso = num1.toString() + "X" + num2.toString()
                txvOperacion.text = proceso
            }
            4 -> {
                if (num2 != 0.0 && num1 != 0.0) {
                    resultado = num1 / num2
                    val proceso = "$num1/$num2"
                    txvOperacion.text = proceso
                } else {
                    txvOperacion.text = ""
                    resultado = 0.0
                    Toast.makeText(
                        this.applicationContext,
                        "El formato no es válido",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            5 -> {
                resultado = sqrt(num2)
                val proceso = "√" + num2.toString()
                txvOperacion.text = proceso
            }
        }
        txvResultado.text = resultado.toString()
    }

    fun clearAll() {
        txvOperacion.text = ""
        txvResultado.text = ""
        operacion = 0
        num1 = 0.0
        num2 = 0.0
    }

    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.btnNumero0 -> {
                asignarNumero()
            }
            R.id.btnNumero1 -> {
                asignarNumero1()
            }
            R.id.btnNumero2 -> {
                asignarNumero2()
            }
            R.id.btnNumero3 -> {
                asignarNumero3()
            }
            R.id.btnNumero4 -> {
                asignarNumero4()
            }
            R.id.btnNumero5 -> {
                asignarNumero5()
            }
            R.id.btnNumero6 -> {
                asignarNumero6()
            }
            R.id.btnNumero7 -> {
                asignarNumero7()
            }
            R.id.btnNumero8 -> {
                asignarNumero8()
            }
            R.id.btnNumero9 -> {
                asignarNumero9()
            }
            R.id.btnClearAll -> {
                clearAll()
            }
            R.id.btnPunto -> {
                asignarPunto()
            }
            R.id.btnPorcentaje -> {
                val num = txvResultado.text.toString()
                if (num.isEmpty()) {
                    Toast.makeText(
                        this.applicationContext,
                        "El formato no es válido",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                } else {
                    asignarPorcentaje()
                }
            }
            R.id.btnSuma -> {
                val num = txvResultado.text.toString()
                if (num.isEmpty()){
                    Toast.makeText(
                        this.applicationContext,
                        "El formato no es válido",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }else{
                    asignarSuma()
                }
            }
            R.id.btnResta -> {
                val num = txvResultado.text.toString()
                if (num.isEmpty()){
                    Toast.makeText(
                        this.applicationContext,
                        "El formato no es válido",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }else{
                    asignarResta()
                }
            }
            R.id.btnMultiplicacion -> {
                val num = txvResultado.text.toString()
                if (num.isEmpty()){
                    Toast.makeText(
                        this.applicationContext,
                        "El formato no es válido",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }else{
                    asignarMultiplicacion()
                }
            }
            R.id.btnDivision -> {
                val num = txvResultado.text.toString()
                if (num.isEmpty()){
                    Toast.makeText(
                        this.applicationContext,
                        "El formato no es válido",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }else{
                    asignarDivision()
                }
            }
            R.id.btnIgual -> {
                val num = txvResultado.text.toString()
                if (num.isEmpty()){
                    Toast.makeText(
                        this.applicationContext,
                        "El formato no es válido",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }else{
                    procesarOperacion()
                }
            }
            R.id.btnSQRT ->{
                asignarRaiz()
            }
        }
    }
}