package cz.skywall.kuple.generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import java.io.File

val PARAMETERS_LETTERS = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")
val TYPE_VARIABLES_NAMES = PARAMETERS_LETTERS.map { TypeVariableName(it) }
val ORDERS = listOf("first", "second", "third", "forth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth")

const val PACKAGE_NAME = "cz.skywall.kuple"
const val MAX_KUPLE_ORDER = 10

fun main() {
    val kupleFileSpec = generateKupleFileSpec()

    (1..9).forEach {
        val kuplePlusFileSpec = generateKuplePlusFileSpec(it)
        kuplePlusFileSpec.writeTo(File("src/main/kotlin/"))
    }

    kupleFileSpec.writeTo(File("src/main/kotlin/"))
}

fun generateKuplePlusFileSpec(n: Int): FileSpec {
    return FileSpec.builder(PACKAGE_NAME, "Kuple${n}Plus")
        .apply {
            (1..MAX_KUPLE_ORDER-n).forEach {
                addFunction(generateKuplePlusFunctionSpec(n, it))
            }
        }
        .build()
}

fun generateKuplePlusFunctionSpec(n: Int, another: Int): FunSpec {
    val receiverParameterTypeNames = TYPE_VARIABLES_NAMES.take(n)
    val parameterTypeNames = TYPE_VARIABLES_NAMES.drop(n).take(another)

    val receiver = ClassName(PACKAGE_NAME, "Kuple$n")
        .parameterizedBy(receiverParameterTypeNames)
    val functionParameter = ClassName(PACKAGE_NAME, "Kuple$another")
        .parameterizedBy(parameterTypeNames)

    val returnedObjectParameters = ORDERS.take(n).map { "this.$it" } + ORDERS.take(another).map { "another.$it" }

    return FunSpec.builder("plus")
        .receiver(receiver)
        .addTypeVariables(TYPE_VARIABLES_NAMES.take(n + another))
        .addModifiers(KModifier.OPERATOR)
        .addParameter(ParameterSpec("another", functionParameter))
        .addStatement("return Kuple("+ returnedObjectParameters.joinToString(", ") +")")
        .build()
}

private fun generateKupleFileSpec(): FileSpec {
    val kupleTypeSpec = TypeSpec.objectBuilder("Kuple")
        .addFunction(kuple0InvokeSpec())
        .apply {
            (1..MAX_KUPLE_ORDER).forEach {
                addFunction(kupleNInvokeSpec(it))
            }
        }
        .build()

    return FileSpec.builder(PACKAGE_NAME, "Kuple")
        .addType(kupleTypeSpec)
        .addType(TypeSpec.objectBuilder("Kuple0").build())
        .apply {
            (1..MAX_KUPLE_ORDER).forEach {
                addType(kupleNTypeSpec(it))
                addFunction(kupleNToListSpec(it))
            }
        }
        .build()
}

private fun kupleNInvokeSpec(n: Int): FunSpec {
    val constructorParametersSpec = ORDERS.take(n).mapIndexed { index, order ->
        ParameterSpec(order, TYPE_VARIABLES_NAMES[index])
    }

    val kupleClassName = ClassName(PACKAGE_NAME, "Kuple$n")

    return FunSpec.builder("invoke")
        .addModifiers(KModifier.OPERATOR)
        .addStatement("return %T(" + ORDERS.take(n).joinToString(", ") + ")", kupleClassName)
        .addParameters(constructorParametersSpec)
        .addTypeVariables(TYPE_VARIABLES_NAMES.take(n))
        .build()
}

private fun kupleNTypeSpec(n: Int): TypeSpec {
    val constructorParametersSpec = ORDERS.take(n).mapIndexed { index, order ->
        ParameterSpec(order, TYPE_VARIABLES_NAMES[index])
    }

    val propertiesSpec = ORDERS.take(n).mapIndexed { index, order ->
        PropertySpec.builder(order, TYPE_VARIABLES_NAMES[index])
            .initializer(order)
            .build()
    }

    val toStringFunSpec = FunSpec.builder("toString")
        .addModifiers(KModifier.OVERRIDE)
        .addStatement("return %P", "(\$" + ORDERS.take(n).joinToString(", \$") + ")")
        .build()

    return TypeSpec.classBuilder("Kuple$n")
        .addTypeVariables(PARAMETERS_LETTERS.map { TypeVariableName(it, KModifier.OUT) }.take(n))
        .primaryConstructor(
            FunSpec.constructorBuilder()
                .addParameters(constructorParametersSpec)
                .build()
        )
        .addProperties(propertiesSpec)
        .addModifiers(KModifier.DATA)
        .addFunction(toStringFunSpec)
        .build()
}

private fun kupleNToListSpec(n: Int): FunSpec {
    val parameterTypeNames = MutableList(n) { TypeVariableName("T") }

    val receiver = ClassName(PACKAGE_NAME, "Kuple$n").parameterizedBy(parameterTypeNames)
    return FunSpec.builder("toList")
        .receiver(receiver)
        .addTypeVariable(TypeVariableName("T"))
        .addStatement("return listOf(" + ORDERS.take(n).joinToString(", ") + ")")
        .build()
}

private fun kuple0InvokeSpec(): FunSpec {
    return FunSpec.builder("invoke")
        .addModifiers(KModifier.OPERATOR)
        .addStatement("return %T", ClassName(PACKAGE_NAME, "Kuple0"))
        .build()
}
