package com.tradeEngine.polygonTickersConverter.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class PolygonTickersConverterApplication

fun main(args: Array<String>) {
    runApplication<PolygonTickersConverterApplication>(*args)
}
