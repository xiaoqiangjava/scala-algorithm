package com.xq.learn

/*
 * 爬楼梯：每次只能移动1步或者2步，计算爬到楼梯顶部总共有几种方式
 */
object Solution70 {
  /*
   * 使用Dynamic Programming思想来实现
   */
  def climbStairs(n: Int): Int = {
    if (n < 2) {
      return 1
    }
    // 记录前n-1和n-2到达top的路数
    var (first, second) = (1, 1)
    for (_ <- 2 to n) {
      // DP function: F[n] = F[n -1] + F[n - 2]
      val res = first + second
      first = second
      second = res
    }

    second
  }
}
