object HighOrderFunction {



  def main(args: Array[String]): Unit = {

    val currentYear = 2020
    var birthYear = 1996

    print(birthDay(age,currentYear,birthYear));

  }

  def birthDay(theAge: Int => String, cYear: Int,bYear:Int) = theAge(cYear-bYear)

  def age(year:Int)= "Your age is: "+year

}
