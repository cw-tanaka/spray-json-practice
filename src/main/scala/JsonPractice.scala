import spray.json._

case class User(id: Long,
                name: String,
                age: Int)

object UserJsonProtocol extends DefaultJsonProtocol {
  implicit val userFormat = jsonFormat3(User)
}

object JsonPractice {
  def main(args: Array[String]) {
    import UserJsonProtocol._

    val json = Seq(
      User(1, "bob", 26),
      User(2, "john", 26),
      User(3, "smith", 26)
    ).toJson

    println(json.prettyPrint)
  }
}
