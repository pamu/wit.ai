object Main {
  def main(args: Array[String]): Unit = {
    println("Main Application")
  }
}

trait Functor[F[_]] {
  def map[A, B](a: F[A])(f: A => B): F[B]
}