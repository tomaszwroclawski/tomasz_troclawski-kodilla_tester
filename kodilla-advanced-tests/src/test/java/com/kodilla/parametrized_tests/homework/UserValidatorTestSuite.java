package com.kodilla.parametrized_tests.homework;

import jdk.internal.joptsimple.internal.Strings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Tomasz","teomo","breslauer","teOmoBreslauER","TomaszWroclawskiTeomo"})
    public void shouldValidateName(String userName){
        boolean result = userValidator.validateUsername(userName);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"teomo@nbd","   ","teomo@","$^&#(*Whyudi"})
    public void shouldNotValidateUsername(String username){
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"teomo@outlook.com","amiya@amiya-group.eu","gugu@gugu.pl"})
    public void shouldValidateEmail(String email){
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"teomika@@fert@jui.com","  ","asfgh578(*&^%$@.com@","tomasz"})
    public void shouldNotValidateEmail(String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

}