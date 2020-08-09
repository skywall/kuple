package cz.skywall.kuple

operator fun <A, B, C, D, E, F, G, H, I> Kuple8<A, B, C, D, E, F, G, H>.plus(another: Kuple1<I>) =
    Kuple(this.first, this.second, this.third, this.forth, this.fifth, this.sixth, this.seventh,
    this.eighth, another.first)

operator fun <A, B, C, D, E, F, G, H, I, J> Kuple8<A, B, C, D, E, F, G, H>.plus(another: Kuple2<I,
    J>) = Kuple(this.first, this.second, this.third, this.forth, this.fifth, this.sixth,
    this.seventh, this.eighth, another.first, another.second)
