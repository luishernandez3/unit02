fun main() {
    val cookiesPerBag = 40
    val caloriesPerServing = 300
    val servingsPerBag = 10
    val totalCaloriesPerBag = caloriesPerServing * servingsPerBag
    val cookieseaten = 3
    val totalCaloriesConsumed = (cookieseaten / cookiesPerBag.toDouble()) * totalCaloriesPerBag
    
     println("Enter number of cookies eaten: $cookieseaten")
    println("Your calorie intake was: $totalCaloriesConsumed calories")
}
