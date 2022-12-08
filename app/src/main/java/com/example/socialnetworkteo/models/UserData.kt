package com.example.socialnetworkteo.models

import androidx.lifecycle.MutableLiveData
import com.example.socialnetworkteo.R

class UserData {
    private val onlineStatus = listOf(
        (1..59).random().toString() + " min ago",
        "Online",
        (1..23).random().toString() + " hours ago",
        "Yesterday",
        (1..11).random().toString() + " month ago"
    )

    private var _userList = MutableLiveData<List<User>>().apply {
        value = listOf(
            User(
                "Ivan Ivanov",
                "Admin",
                21,
                onlineStatus[(0..4).random()],
                "ivan.ivanov@gmail.com",
                R.drawable.avatar_6,
                "Cars",
                "Like fastest cars and drive!"
            ),

            User(
                "Petr Petrov",
                "User",
                44,
                onlineStatus[(0..4).random()],
                "petr.petrov@gmail.com",
                R.drawable.avatar_1,
                "Football",
                "Like watching football on TV and drink beer!"
            ),

            User(
                "Maria Marva",
                "User",
                18,
                onlineStatus[(0..4).random()],
                "maria@gmail.com",
                R.drawable.avatar_13,
                "Cooking",
                "Like cooking and eat tasty!"
            )
        )
    }
    var userList = _userList
}