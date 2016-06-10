package com.jimdo.myapplication

import spock.lang.Specification

class NonsenseSpec extends Specification {
  def "it should add something"() {
    then:
    new Nonsense().add(1, 1) == 2
  }
}
