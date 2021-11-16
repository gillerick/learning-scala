package demo

import models._

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class DemoTest extends FunSuite with BeforeAndAfterEach {


  test("testAddition") {
    val result = Demo.addition(2, 3)
    assert(result === 5)
  }

  test("Print Full Name"){
    val p = new Person("Gill", "Erick")
    val result: Unit = p.printFullName()
    assert(result === println("Gill Erick"))
  }


  test("Addition Test (assertResult)"){
    assertResult(7){
      Demo.addition(4, 3)
    }
  }

}
