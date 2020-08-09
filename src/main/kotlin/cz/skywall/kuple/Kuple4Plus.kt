package cz.skywall.kuple

operator fun <A, B, C, D, E> Kuple4<A, B, C, D>.plus(another: Kuple1<E>) = Kuple(this.first,
    this.second, this.third, this.forth, another.first)

operator fun <A, B, C, D, E, F> Kuple4<A, B, C, D>.plus(another: Kuple2<E, F>) = Kuple(this.first,
    this.second, this.third, this.forth, another.first, another.second)

operator fun <A, B, C, D, E, F, G> Kuple4<A, B, C, D>.plus(another: Kuple3<E, F, G>) =
    Kuple(this.first, this.second, this.third, this.forth, another.first, another.second,
    another.third)

operator fun <A, B, C, D, E, F, G, H> Kuple4<A, B, C, D>.plus(another: Kuple4<E, F, G, H>) =
    Kuple(this.first, this.second, this.third, this.forth, another.first, another.second,
    another.third, another.forth)

operator fun <A, B, C, D, E, F, G, H, I> Kuple4<A, B, C, D>.plus(another: Kuple5<E, F, G, H, I>) =
    Kuple(this.first, this.second, this.third, this.forth, another.first, another.second,
    another.third, another.forth, another.fifth)

operator fun <A, B, C, D, E, F, G, H, I, J> Kuple4<A, B, C, D>.plus(another: Kuple6<E, F, G, H, I,
    J>) = Kuple(this.first, this.second, this.third, this.forth, another.first, another.second,
    another.third, another.forth, another.fifth, another.sixth)
