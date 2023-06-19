import zio._
import zio.http._

object MainApp extends ZIOAppDefault {

  val app: App[Any] =
    Http.collect[Request] {
      case Method.GET -> Root / "text" => Response.text("Hello World!")
      case Method.GET -> Root / "fruits" / "b" => Response.text("banana")
      case Method.GET -> Root / "json" => Response.json("""{"greetings": "Hello World!"}""")
    }

  override val run =
    Server.serve(app).provide(Server.default)
}
