# Class-13: Java Collections Framework
**By Mahfuz Mia**
*Made with Gemini*

---

## What is Collections Framework
A collection is an object that represents a group of objects. A collections framework is a unified architecture for representing and manipulating collections, enabling them to be manipulated independently of implementation details.

The Java Collections Framework (JCF) provides:
* A set of interfaces and classes that implement them.
* Standardized methods part of the `java.util` package.
* Tools to store, search, sort, and organize data easily.

---

## Core Interfaces in the Collections Framework

| Interface | Common Classes | Description |
| :--- | :--- | :--- |
| **List** | ArrayList, LinkedList | Ordered collection that allows duplicates. |
| **Set** | HashSet, TreeSet, LinkedHashSet | Collection of unique elements. |
| **Map** | HashMap, TreeMap, LinkedHashMap | Stores key-value pairs with unique keys. |

---

## Benefits of the Framework
1. **Reduces programming effort**: Provides data structures and algorithms out-of-the-box.
2. **Increases performance**: Offers high-performance implementations that can be easily swapped.
3. **Interoperability**: Establishes a common language to pass collections between APIs.
4. **Reduces learning effort**: Eliminates the need to learn multiple ad hoc APIs.
5. **Fosters software reuse**: Standardizes interfaces and algorithms.

---

## Traversing Collections
There are three main ways to traverse a collection:
1. **Aggregate Operations (Streams)**: Introduced in JDK 8; uses lambda expressions and can be parallelized.
2. **For-each Construct**: Simple, readable loop; best for simple iteration.
3. **Iterators**: Provides fine control and allows for safe element removal during iteration.

---

## Bulk Operations
These operations perform actions on an entire collection:
* `containsAll(Collection<?>)`: Returns true if the target contains all elements.
* `addAll(Collection<? extends E>)`: Adds all elements to the target.
* `removeAll(Collection<?>)`: Removes all matching elements.
* `retainAll(Collection<?>)`: Keeps only elements present in both collections.
* `clear()`: Removes all elements.

---

## Comparison of Implementations

### List Interface
* **ArrayList**: Resizable array, fast random access, slower insertions/deletions in the middle.
* **LinkedList**: Doubly-linked list, efficient for frequent insertions/deletions.

### Set Interface
* **HashSet**: Unique elements, no specific order, allows null.
* **LinkedHashSet**: Unique elements, maintains insertion order.
* **TreeSet**: Unique elements, maintained in sorted order.

### Map Interface
* **HashMap**: Key-value pairs, fast $O(1)$ access, one null key allowed.
* **LinkedHashMap**: Maintains insertion order.
* **TreeMap**: Sorted by keys, no null keys allowed.

---

## When to Use Map vs Set

### Use Set When:
* You need unique elements only.
* Duplicates are not allowed.
* The focus is on existence or membership checks (e.g., storing unique IDs).

### Use Map When:
* You need key-value association.
* Each key is unique, but values can be duplicated.
* You want fast lookup by a specific key (e.g., Employee ID → Name).

---
**Quick Tip:**
- **Set** = Collection of unique items.
- **Map** = Collection of unique keys + associated values.