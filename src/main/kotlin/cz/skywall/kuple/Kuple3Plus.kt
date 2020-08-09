package cz.skywall.kuple

operator fun <A, B, C, D> Kuple3<A, B, C>.plus(another: Kuple1<D>) = Kuple(this.first, this.second,
    this.third, another.first)

operator fun <A, B, C, D, E> Kuple3<A, B, C>.plus(another: Kuple2<D, E>) = Kuple(this.first,
    this.second, this.third, another.first, another.second)

operator fun <A, B, C, D, E, F> Kuple3<A, B, C>.plus(another: Kuple3<D, E, F>) = Kuple(this.first,
    this.second, this.third, another.first, another.second, another.third)

operator fun <A, B, C, D, E, F, G> Kuple3<A, B, C>.plus(another: Kuple4<D, E, F, G>) =
    Kuple(this.first, this.second, this.third, another.first, another.second, another.third,
    another.forth)

operator fun <A, B, C, D, E, F, G, H> Kuple3<A, B, C>.plus(another: Kuple5<D, E, F, G, H>) =
    Kuple(this.first, this.second, this.third, another.first, another.second, another.third,
    another.forth, another.fifth)

operator fun <A, B, C, D, E, F, G, H, I> Kuple3<A, B, C>.plus(another: Kuple6<D, E, F, G, H, I>) =
    Kuple(this.first, this.second, this.third, another.first, another.second, another.third,
    another.forth, another.fifth, another.sixth)

operator fun <A, B, C, D, E, F, G, H, I, J> Kuple3<A, B, C>.plus(another: Kuple7<D, E, F, G, H, I,
    J>) = Kuple(this.first, this.second, this.third, another.first, another.second, another.third,
    another.forth, another.fifth, another.sixth, another.seventh)
