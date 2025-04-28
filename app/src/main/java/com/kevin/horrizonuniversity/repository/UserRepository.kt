package com.kevin.horrizonuniversity.repository

import com.kevin.horrizonuniversity.model.User
import com.kevin.horrizonuniversity.navigation.UserDao

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}