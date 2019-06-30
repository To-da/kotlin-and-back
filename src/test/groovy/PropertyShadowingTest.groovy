import com.toda.backtojava.PropertyShadowingSubclass
import spock.lang.Specification
import spock.lang.Unroll

class PropertyShadowingTest extends Specification {

    @Unroll
    def 'getName should return whatever name is given'() {
        given: 'create testable instance'
        PropertyShadowingSubclass testable = new PropertyShadowingSubclass()

        when:
        String result = testable.intToString(inputNumber)

        then:
        result == expectedResultString

        where:
        inputNumber || expectedResultString
        1           || "1"
        -2          || "-2"
        0           || "0"
    }
}
