import spock.lang.Specification

class SubSpec extends Specification {
  def "it should test sub"() {
    expect:
    new Sub().subtract(2,1) == 1;

  }

}