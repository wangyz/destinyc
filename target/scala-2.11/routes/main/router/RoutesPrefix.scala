
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vli/Documents/workspace/individual/destinyc/conf/routes
// @DATE:Fri May 05 18:59:03 EDT 2017


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
