package ema.cis8

object Day8 {
  @main def part1(): Unit = {

  }

  def parse(): Nothing = ???

  private type Tree = Int

  private type Forest = Array[Array[Tree]]

  extension (f: Forest)
    def columns: Int = f.length
    //def rows: Int = f[0].length

  private type VisibilityMap = Array[Array[Boolean]]

  class RightDownScan(
                       val forest: Forest,
                       val visibilityMap: VisibilityMap) {
    val rowTallestTree: Array[Tree] = Array.fill(forest.length) { -1 }
    val columnTallestTree: Array[Tree] = Array.fill(forest.length) { -1 }
  }

  class LeftUpScan(val forest: Forest)
}
