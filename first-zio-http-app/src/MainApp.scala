import zio._
import zio.http._

object MainApp extends ZIOAppDefault {

    val textRoute =
      Method.GET -> Root / "text" => handler(Response.text("Hello World!"))


          // Method.GET -> Root / "fruits" / "b" => handler(Response.text("banana")),
          
    val jsonRoute =
      Method.GET -> Root / "json" => handler(Response.json("""{"greetings": "Hello World!"}""")),
  



    // Create HTTP route
    val app = Routes(textRoute, jsonRoute).toHttpApp

    // Run it like any simple app
    override val run = Server.serve(app).provide(Server.default)
}
