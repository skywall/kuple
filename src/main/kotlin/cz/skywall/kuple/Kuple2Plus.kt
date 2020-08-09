package cz.skywall.kuple

operator fun <A, B, C> Kuple2<A, B>.plus(another: Kuple1<C>) = Kuple(this.first, this.second,
    another.first)

operator fun <A, B, C, D> Kuple2<A, B>.plus(another: Kuple2<C, D>) = Kuple(this.first, this.second,
    another.first, another.second)

operator fun <A, B, C, D, E> Kuple2<A, B>.plus(another: Kuple3<C, D, E>) = Kuple(this.first,
    this.second, another.first, another.second, another.third)

operator fun <A, B, C, D, E, F> Kuple2<A, B>.plus(another: Kuple4<C, D, E, F>) = Kuple(this.first,
    this.second, another.first, another.second, another.third, another.forth)

operator fun <A, B, C, D, E, F, G> Kuple2<A, B>.plus(another: Kuple5<C, D, E, F, G>) =
    Kuple(this.first, this.second, another.first, another.second, another.third, another.forth,
    another.fifth)

operator fun <A, B, C, D, E, F, G, H> Kuple2<A, B>.plus(another: Kuple6<C, D, E, F, G, H>) =
    Kuple(this.first, this.second, another.first, another.second, another.third, another.forth,
    another.fifth, another.sixth)

operator fun <A, B, C, D, E, F, G, H, I> Kuple2<A, B>.plus(another: Kuple7<C, D, E, F, G, H, I>) =
    Kuple(this.first, this.second, another.first, another.second, another.third, another.forth,
    another.fifth, another.sixth, another.seventh)

operator fun <A, B, C, D, E, F, G, H, I, J> Kuple2<A, B>.plus(another: Kuple8<C, D, E, F, G, H, I,
    J>) = Kuple(this.first, this.second, another.first, another.second, another.third,
    another.forth, another.fifth, another.sixth, another.seventh, another.eighth)
