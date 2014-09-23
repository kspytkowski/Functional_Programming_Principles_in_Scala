package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  println(FunSets.toString(map(x => x == 1 || x == 3 || x == 4 || x == 5 || x == 7 || x == 1000, x => x - 1)))
  println(map(x => x == 4, x => x + 1)(5))
  printSet(map(x => x == 1 || x == 3 || x == 4 || x == 5 || x == 7 || x == 1000, x => x - 1))
}
