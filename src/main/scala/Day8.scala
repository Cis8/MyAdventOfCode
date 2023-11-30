package ema.cis8

import scala.io.Source
import scala.util.Using

object Day8 {
  @main def part1(): Unit = {
    println(System.getProperty("user.dir"))
    val forest = parse()
    println(printMatrix(forest))
    println(s"${forest.rows} x ${forest.columns}")
  }

  def parse(): Forest = {
    Using(Source.fromFile("./src/main/resources/day8.txt")) {
      src =>
        src.getLines()
          .map(r => r.toCharArray
            .map(v => (v.toInt - 48, false)))
          .toArray
    }.get
  }

  private def printMatrix[A](m: Array[Array[A]]) = m.map(r => r.mkString("", ", ", "")).mkString("", "\n", "")

  private type Tree = (Int, Boolean)

  extension (t: Tree)
    def show = s"(${t._1},${t._2})"

  private type Forest = Array[Array[Tree]]

  extension (f: Forest)
    private def columns: Int = f.length
    private def rows: Int = f(0).length

  def negativeOnes(n: Int) = Array.fill(n) {
    -1
  }

  def rightDownScan(forest: Forest) = {
    val columnsTallestTree = negativeOnes(forest.columns)
    val columnsTallestColumns = negativeOnes(forest.rows)

    forest.map(row => row.zipWithIndex.map((t, idx) => t match
      case (_, false) => if t._1 >=
    ))
  }

  class LeftUpScan(val forest: Forest)
}
