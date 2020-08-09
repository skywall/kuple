package cz.skywall.kuple

operator fun <A, B, C, D, E, F> Kuple5<A, B, C, D, E>.plus(another: Kuple1<F>) = Kuple(this.first,
    this.second, this.third, this.forth, this.fifth, another.first)

operator fun <A, B, C, D, E, F, G> Kuple5<A, B, C, D, E>.plus(another: Kuple2<F, G>) =
    Kuple(this.first, this.second, this.third, this.forth, this.fifth, another.first,
    another.second)

operator fun <A, B, C, D, E, F, G, H> Kuple5<A, B, C, D, E>.plus(another: Kuple3<F, G, H>) =
    Kuple(this.first, this.second, this.third, this.forth, this.fifth, another.first,
    another.second, another.third)

operator fun <A, B, C, D, E, F, G, H, I> Kuple5<A, B, C, D, E>.plus(another: Kuple4<F, G, H, I>) =
    Kuple(this.first, this.second, this.third, this.forth, this.fifth, another.first,
    another.second, another.third, another.forth)

operator fun <A, B, C, D, E, F, G, H, I, J> Kuple5<A, B, C, D, E>.plus(another: Kuple5<F, G, H, I,
    J>) = Kuple(this.first, this.second, this.third, this.forth, this.fifth, another.first,
    another.second, another.third, another.forth, another.fifth)
