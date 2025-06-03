package com.example.project_1.viewmodel

class ClassEjercicio6 {
    fun isNameValid(name: String): Boolean = name.isNotBlank()

    fun isEmailValid(email: String): Boolean =
        android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()

    fun isPasswordValid(password: String): Boolean = password.length >= 6

    fun doPasswordsMatch(password: String, confirmPassword: String): Boolean =
        password == confirmPassword
}
