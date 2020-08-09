package cz.skywall.kuple

operator fun <A, B, C, D, E, F, G, H, I, J> Kuple9<A, B, C, D, E, F, G, H,
    I>.plus(another: Kuple1<J>) = Kuple(this.first, this.second, this.third, this.forth, this.fifth,
    this.sixth, this.seventh, this.eighth, this.ninth, another.first)
