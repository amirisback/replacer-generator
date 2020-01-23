package com.frogobox;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * ReplacerGenerator
 * Copyright (C) 23/01/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox
 */
public class Helper {

    public String replacerVocal(String text, String character) {
        String listCharLower = "[aiueo]";
        String listCharUpper = "[AIUEO]";
        String newText = text.replaceAll(listCharLower, character.toLowerCase());
        newText = newText.replaceAll(listCharUpper, character.toUpperCase());
        return newText;
    }

}
