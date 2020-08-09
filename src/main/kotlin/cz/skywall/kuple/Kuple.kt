package cz.skywall.kuple

object Kuple {
  operator fun invoke() = Kuple0

  operator fun <A> invoke(first: A) = Kuple1(first)

  operator fun <A, B> invoke(first: A, second: B) = Kuple2(first, second)

  operator fun <A, B, C> invoke(
    first: A,
    second: B,
    third: C
  ) = Kuple3(first, second, third)

  operator fun <A, B, C, D> invoke(
    first: A,
    second: B,
    third: C,
    forth: D
  ) = Kuple4(first, second, third, forth)

  operator fun <A, B, C, D, E> invoke(
    first: A,
    second: B,
    third: C,
    forth: D,
    fifth: E
  ) = Kuple5(first, second, third, forth, fifth)

  operator fun <A, B, C, D, E, F> invoke(
    first: A,
    second: B,
    third: C,
    forth: D,
    fifth: E,
    sixth: F
  ) = Kuple6(first, second, third, forth, fifth, sixth)

  operator fun <A, B, C, D, E, F, G> invoke(
    first: A,
    second: B,
    third: C,
    forth: D,
    fifth: E,
    sixth: F,
    seventh: G
  ) = Kuple7(first, second, third, forth, fifth, sixth, seventh)

  operator fun <A, B, C, D, E, F, G, H> invoke(
    first: A,
    second: B,
    third: C,
    forth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H
  ) = Kuple8(first, second, third, forth, fifth, sixth, seventh, eighth)

  operator fun <A, B, C, D, E, F, G, H, I> invoke(
    first: A,
    second: B,
    third: C,
    forth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H,
    ninth: I
  ) = Kuple9(first, second, third, forth, fifth, sixth, seventh, eighth, ninth)

  operator fun <A, B, C, D, E, F, G, H, I, J> invoke(
    first: A,
    second: B,
    third: C,
    forth: D,
    fifth: E,
    sixth: F,
    seventh: G,
    eighth: H,
    ninth: I,
    tenth: J
  ) = Kuple10(first, second, third, forth, fifth, sixth, seventh, eighth, ninth, tenth)
}

object Kuple0

data class Kuple1<out A>(
  val first: A
) {
  override fun toString() = """($first)"""
}

fun <T> Kuple1<T>.toList() = listOf(first)

data class Kuple2<out A, out B>(
  val first: A,
  val second: B
) {
  override fun toString() = """($first, $second)"""
}

fun <T> Kuple2<T, T>.toList() = listOf(first, second)

data class Kuple3<out A, out B, out C>(
  val first: A,
  val second: B,
  val third: C
) {
  override fun toString() = """($first, $second, $third)"""
}

fun <T> Kuple3<T, T, T>.toList() = listOf(first, second, third)

data class Kuple4<out A, out B, out C, out D>(
  val first: A,
  val second: B,
  val third: C,
  val forth: D
) {
  override fun toString() = """($first, $second, $third, $forth)"""
}

fun <T> Kuple4<T, T, T, T>.toList() = listOf(first, second, third, forth)

data class Kuple5<out A, out B, out C, out D, out E>(
  val first: A,
  val second: B,
  val third: C,
  val forth: D,
  val fifth: E
) {
  override fun toString() = """($first, $second, $third, $forth, $fifth)"""
}

fun <T> Kuple5<T, T, T, T, T>.toList() = listOf(first, second, third, forth, fifth)

data class Kuple6<out A, out B, out C, out D, out E, out F>(
  val first: A,
  val second: B,
  val third: C,
  val forth: D,
  val fifth: E,
  val sixth: F
) {
  override fun toString() = """($first, $second, $third, $forth, $fifth, $sixth)"""
}

fun <T> Kuple6<T, T, T, T, T, T>.toList() = listOf(first, second, third, forth, fifth, sixth)

data class Kuple7<out A, out B, out C, out D, out E, out F, out G>(
  val first: A,
  val second: B,
  val third: C,
  val forth: D,
  val fifth: E,
  val sixth: F,
  val seventh: G
) {
  override fun toString() = """($first, $second, $third, $forth, $fifth, $sixth, $seventh)"""
}

fun <T> Kuple7<T, T, T, T, T, T, T>.toList() = listOf(first, second, third, forth, fifth, sixth,
    seventh)

data class Kuple8<out A, out B, out C, out D, out E, out F, out G, out H>(
  val first: A,
  val second: B,
  val third: C,
  val forth: D,
  val fifth: E,
  val sixth: F,
  val seventh: G,
  val eighth: H
) {
  override fun toString() =
      """($first, $second, $third, $forth, $fifth, $sixth, $seventh, $eighth)"""
}

fun <T> Kuple8<T, T, T, T, T, T, T, T>.toList() = listOf(first, second, third, forth, fifth, sixth,
    seventh, eighth)

data class Kuple9<out A, out B, out C, out D, out E, out F, out G, out H, out I>(
  val first: A,
  val second: B,
  val third: C,
  val forth: D,
  val fifth: E,
  val sixth: F,
  val seventh: G,
  val eighth: H,
  val ninth: I
) {
  override fun toString() =
      """($first, $second, $third, $forth, $fifth, $sixth, $seventh, $eighth, $ninth)"""
}

fun <T> Kuple9<T, T, T, T, T, T, T, T, T>.toList() = listOf(first, second, third, forth, fifth,
    sixth, seventh, eighth, ninth)

data class Kuple10<out A, out B, out C, out D, out E, out F, out G, out H, out I, out J>(
  val first: A,
  val second: B,
  val third: C,
  val forth: D,
  val fifth: E,
  val sixth: F,
  val seventh: G,
  val eighth: H,
  val ninth: I,
  val tenth: J
) {
  override fun toString() =
      """($first, $second, $third, $forth, $fifth, $sixth, $seventh, $eighth, $ninth, $tenth)"""
}

fun <T> Kuple10<T, T, T, T, T, T, T, T, T, T>.toList() = listOf(first, second, third, forth, fifth,
    sixth, seventh, eighth, ninth, tenth)
