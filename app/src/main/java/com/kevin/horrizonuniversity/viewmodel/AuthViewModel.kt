package com.kevin.horrizonuniversity.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kevin.horrizonuniversity.model.User
import com.kevin.horrizonuniversity.repository.UserRepository
import kotlinx.coroutines.launch

class AuthViewModel(private val repository: UserRepository) : ViewModel() {
    var loggedInUser: ((User?) -> Unit)? = null

    fun registerUser(user: User) {
        viewModelScope.launch {
            repository.registerUser(user)
        }
    }

    fun loginUser(email: String, password: String) {
        viewModelScope.launch {
            val user = repository.loginUser(email, password)
            loggedInUser?.invoke(user)
        }
    }
}