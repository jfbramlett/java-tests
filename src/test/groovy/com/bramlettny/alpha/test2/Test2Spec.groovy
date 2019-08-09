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
    }
}
