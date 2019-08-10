package com.bramlettny.alpha.test2

import spock.lang.Specification

class Test2Spec extends Specification {

    def "see if there is a subarray whose sum equals a given value"() {
        expect:
        Test2.findSubarryWithSum(input, sum) == found

        where:
        input           | sum   | found
        [1, 2, 3, 4]    | 7     | true
        [5, 6, 7, 8]    | 33    | false
        [1, 2, 3, 4]    | 5     | true
        [5, 1, 4, 6]    | 10    | true
    }

    def "see if there is a subarray whose sum equals a given value - 2"() {
        expect:
        Test2.findSubarryWithSum2(input, sum) == found

        where:
        input           | sum   | found
        [1, 2, 3, 4]    | 7     | true
        [5, 6, 7, 8]    | 33    | false
        [1, 2, 3, 4]    | 5     | true
        [5, 1, 4, 6]    | 10    | true
    }

}
