import spock.lang.*

class HelloSpec extends Specification {
        def "canary"() {
            expect:
            a == b

            where:
            a << [false, false]
            b << [true, true]
        }
}