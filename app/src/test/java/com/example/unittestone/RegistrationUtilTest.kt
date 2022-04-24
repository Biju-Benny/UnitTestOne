package com.example.unittestone


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"

            )
        assertThat(result).isFalse()

    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "John",
            "123",
            "123"

        )
        assertThat(result).isTrue()

    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "123"

        )
        assertThat(result).isFalse()

    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "John",
            "",
            ""

        )
        assertThat(result).isFalse()

    }

    @Test
    fun `password was repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "John",
            "123",
            "456"

        )
        assertThat(result).isFalse()

    }

    @Test
    fun `password contains less than 2 digits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "John",
            "1abc",
            "1abc"

        )
        assertThat(result).isFalse()

    }




}