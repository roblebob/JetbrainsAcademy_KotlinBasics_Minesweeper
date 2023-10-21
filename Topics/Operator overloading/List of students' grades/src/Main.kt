// define the function
operator fun List<Double>.invoke(markLimit: Double): Double = this.filter { it > markLimit }.average()