package com.serbaada.app.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.serbaada.app.R
import com.serbaada.app.data.model.AuthUser
import com.serbaada.app.databinding.ActivityAuthBinding
import com.serbaada.app.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {

    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSucces(user: AuthUser?){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }
}