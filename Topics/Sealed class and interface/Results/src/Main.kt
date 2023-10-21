// write code here
sealed class Result {
    class Success(val message: String) : Result()
    class Error(val message: String) : Result()
}