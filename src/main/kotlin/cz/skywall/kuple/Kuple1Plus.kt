package cz.skywall.kuple

operator fun <A, B> Kuple1<A>.plus(another: Kuple1<B>) = Kuple(this.first, another.first)

operator fun <A, B, C> Kuple1<A>.plus(another: Kuple2<B, C>) = Kuple(this.first, another.first,
    another.second)

operator fun <A, B, C, D> Kuple1<A>.plus(another: Kuple3<B, C, D>) = Kuple(this.first,
    another.first, another.second, another.third)

operator fun <A, B, C, D, E> Kuple1<A>.plus(another: Kuple4<B, C, D, E>) = Kuple(this.first,
    another.first, another.second, another.third, another.forth)

operator fun <A, B, C, D, E, F> Kuple1<A>.plus(another: Kuple5<B, C, D, E, F>) = Kuple(this.first,
    another.first, another.second, another.third, another.forth, another.fifth)

operator fun <A, B, C, D, E, F, G> Kuple1<A>.plus(another: Kuple6<B, C, D, E, F, G>) =
    Kuple(this.first, another.first, another.second, another.third, another.forth, another.fifth,
    another.sixth)

operator fun <A, B, C, D, E, F, G, H> Kuple1<A>.plus(another: Kuple7<B, C, D, E, F, G, H>) =
    Kuple(this.first, another.first, another.second, another.third, another.forth, another.fifth,
    another.sixth, another.seventh)

operator fun <A, B, C, D, E, F, G, H, I> Kuple1<A>.plus(another: Kuple8<B, C, D, E, F, G, H, I>) =
    Kuple(this.first, another.first, another.second, another.third, another.forth, another.fifth,
    another.sixth, another.seventh, another.eighth)

operator fun <A, B, C, D, E, F, G, H, I, J> Kuple1<A>.plus(another: Kuple9<B, C, D, E, F, G, H, I,
    J>) = Kuple(this.first, another.first, another.second, another.third, another.forth,
    another.fifth, another.sixth, another.seventh, another.eighth, another.ninth)
