package cz.skywall.kuple

operator fun <A, B, C, D, E, F, G> Kuple6<A, B, C, D, E, F>.plus(another: Kuple1<G>) =
    Kuple(this.first, this.second, this.third, this.forth, this.fifth, this.sixth, another.first)

operator fun <A, B, C, D, E, F, G, H> Kuple6<A, B, C, D, E, F>.plus(another: Kuple2<G, H>) =
    Kuple(this.first, this.second, this.third, this.forth, this.fifth, this.sixth, another.first,
    another.second)

operator fun <A, B, C, D, E, F, G, H, I> Kuple6<A, B, C, D, E, F>.plus(another: Kuple3<G, H, I>) =
    Kuple(this.first, this.second, this.third, this.forth, this.fifth, this.sixth, another.first,
    another.second, another.third)

operator fun <A, B, C, D, E, F, G, H, I, J> Kuple6<A, B, C, D, E, F>.plus(another: Kuple4<G, H, I,
    J>) = Kuple(this.first, this.second, this.third, this.forth, this.fifth, this.sixth,
    another.first, another.second, another.third, another.forth)
