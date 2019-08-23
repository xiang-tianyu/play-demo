// @GENERATOR:play-routes-compiler
// @SOURCE:/home/dev2/Documents/Dacreed/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Fri Aug 23 11:39:36 NZST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
