package tadp.ageofempires

object AgeApp extends App {

  def leerDeLaBase(q: String): Any = {
    //"algoritmo loco"
    new Guerrero(30, 5)
  }

  val atila = leerDeLaBase("dame atila gato!")
    .asInstanceOf[Guerrero]
  val conan = new Guerrero(15, 6)
  atila.atacarA(conan)

  val unaMuralla = new Muralla(2)

  atila.atacarA(unaMuralla)

  println(unaMuralla.energia)

}













