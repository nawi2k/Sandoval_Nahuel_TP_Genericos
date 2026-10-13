# 🛒 Enterprise Generic Architecture & Collection Processor (Java 25)

[![Java Version](https://img.shields.io/badge/Java-25-orange.svg)](https://www.oracle.com/java/)
[![Architecture](https://img.shields.io/badge/Architecture-Clean%20%26%20Decoupled-blue.svg)]()
[![Build](https://img.shields.io/badge/Build-Passing-brightgreen.svg)]()

## 📌 Executive Summary
This repository contains a production-ready demonstration of **Java Generics, Type Safety, and Collection Polymorphism**. The system implements an e-commerce domain layer featuring generic bounded types, generic search utility classes, custom sorting strategies via `Comparable` and `Comparator`, and structural type constraints.

Designed following **SOLID principles** (Single Responsibility, Open/Closed, and Dependency Inversion) to maximize code reusability, eliminate runtime `ClassCastException` risks, and minimize boilerplate casting.

---

## 🏗️ Architectural Overview & Core Concepts

```text
source/
└── casoPractico/
    ├── Identificable.java          # Generic key contract <K>
    ├── Producto.java               # Generic domain entity with bounded key <T>
    ├── Carrito.java                # Type-bounded container <T Producto<? extends>>
    ├── Pedido.java                 # Domain entity with Comparable<Pedido> implementation
    ├── ComparadorPorFecha.java     # Strategy pattern for dynamic sorting (Comparator<Pedido>)
    ├── Buscador.java               # Static generic lookup utility with wildcard constraints
    └── Main.java                   # Integration testing & execution driver