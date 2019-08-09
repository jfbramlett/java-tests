package com.bramlettny.alpha.test1

import spock.lang.Specification

class Test1Spec extends Specification {
    def "find the length of the longest substring without repeating characters"() {
        expect:
        Test1.findLongestSubstring(input) == size

        where:
        input       | size
        "abcabcbb"  | 3
        "bbbbb"     | 1
        "pwwkew"    | 3
    }
}
