import zio._
import zio.http._

object MainApp extends ZIOAppDefault {

    val textRoute =
      Method.GET / "text" -> handler(Response.text("Hello World!"))

    val fruitRoute =
     Method.GET  / "fruits" / "b" -> handler(Response.text("banana"))
          
    val jsonRoute =
      Method.GET / "json" -> handler(Response.json("""{"greetings": "Hello World!"}"""))
  



    // Create HTTP route
    val app = Routes(textRoute, jsonRoute, fruitRoute).toHttpApp

    // Run it like any simple app
    override val run = Server.serve(app).provide(Server.default)
}
