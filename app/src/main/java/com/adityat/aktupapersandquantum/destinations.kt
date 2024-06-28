package com.adityat.aktupapersandquantum


interface destinations {
    val route : String
}
object firstpaged : destinations {
    override val route = "Home"
}
object Questionpapers : destinations {
    override val route= "questionpaper"
}
object Firstyear : destinations {
    override val route ="firstyear"
}
object Computerscience : destinations {
    override val route ="computerscience"
}
object Serviceunavialble : destinations {
    override val route ="serviceunavailable"
}
object Quantum : destinations {
    override val route ="quantum"
}
