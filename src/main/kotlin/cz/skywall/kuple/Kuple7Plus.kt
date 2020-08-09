package cz.skywall.kuple

operator fun <A, B, C, D, E, F, G, H> Kuple7<A, B, C, D, E, F, G>.plus(another: Kuple1<H>) =
    Kuple(this.first, this.second, this.third, this.forth, this.fifth, this.sixth, this.seventh,
    another.first)

operator fun <A, B, C, D, E, F, G, H, I> Kuple7<A, B, C, D, E, F, G>.plus(another: Kuple2<H, I>) =
    Kuple(this.first, this.second, this.third, this.forth, this.fifth, this.sixth, this.seventh,
    another.first, another.second)

operator fun <A, B, C, D, E, F, G, H, I, J> Kuple7<A, B, C, D, E, F, G>.plus(another: Kuple3<H, I,
    J>) = Kuple(this.first, this.second, this.third, this.forth, this.fifth, this.sixth,
    this.seventh, another.first, another.second, another.third)
