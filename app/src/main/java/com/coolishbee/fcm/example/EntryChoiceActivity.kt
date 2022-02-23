package com.coolishbee.fcm.example

import android.content.Intent
import com.coolishbee.fcm.example.java.MainActivity

class EntryChoiceActivity : BaseChoiceActivity() {

    override fun getChoices(): List<Choice> {
        return kotlin.collections.listOf(
            Choice(
                "Java",
                "Run the Firebase Cloud Messaging quickstart written in Java.",
                Intent(this, MainActivity::class.java)
            ),
            Choice(
                "Kotlin",
                "Run the Firebase Cloud Messaging written in Kotlin.",
                Intent(this, com.coolishbee.fcm.example.kotlin.MainActivity::class.java))
        )
    }
}