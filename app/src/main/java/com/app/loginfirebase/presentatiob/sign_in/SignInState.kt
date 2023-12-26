package com.app.loginfirebase.presentatiob.sign_in

data class SignInState(
    val isSignInSuccessfil: Boolean = false,
    val signInError: String? = null,
)
