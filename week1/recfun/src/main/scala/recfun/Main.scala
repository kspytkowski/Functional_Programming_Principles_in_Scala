package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if (c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def loop(numberOfLeftParenthesis: Int, numberOfRightParenthesis: Int, chars: List[Char]): Boolean = {
      if (numberOfRightParenthesis > numberOfLeftParenthesis) false
      else if (chars.isEmpty) (numberOfLeftParenthesis == numberOfRightParenthesis)
      else if (chars.head == '(') loop(numberOfLeftParenthesis + 1, numberOfRightParenthesis, chars.tail)
      else if (chars.head == ')') loop(numberOfLeftParenthesis, numberOfRightParenthesis + 1, chars.tail)
      else loop(numberOfLeftParenthesis, numberOfRightParenthesis, chars.tail)
    }
    loop(0, 0, chars)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def loop(possibilities: Int, money: Int, coins: List[Int]): Int = {
      if (coins.isEmpty) 0
      else if (money == 0) 1
      else if (money > 0) loop(possibilities, money - coins.head, coins) + loop(possibilities, money, coins.tail)
      else loop(possibilities, money - coins.head, coins.tail)
    }
    loop(0, money, coins)
  }

}
