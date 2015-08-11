import scala.concurrent.ExecutionContext.Implicits.global

object Main {
  def main(args: Array[String]): Unit = {
    println("Main Application")
    println("Feed a sentence to wit.ai:")
    val sentence = System.console().readLine()

    println("Making request to wit.ai ...")

    val req = WS.client.url(Constants.wit).withHeaders(
      ("Authorization" -> Constants.key)
    ).withQueryString(
        ("v" -> "20150811"),
        ("q" -> sentence)
      )

    val response = req.get()

    response.map {
      res =>  {
        println(s"${res.body.toString}")
      }
    }.recover { case th => println(s"${th.getMessage}") }


  }
}

trait Functor[F[_]] {
  def map[A, B](a: F[A])(f: A => B): F[B]
}