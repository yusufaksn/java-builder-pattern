# Java SQL Builder Example

A simple Java **Builder Pattern** example to create SQL queries using chainable methods.

---

## Features
- Add dynamic `WHERE` conditions
- Add `ORDER BY` clause
- Chainable API (`.where(...).orderBy(...).toString()`)

---

## Usage

```java
Builder builder = new Builder("products");

String query = builder
        .where("id", ">", "20")
        .where("colour", "=", "blue")
        .orderBy("id", "desc")
        .toString();

System.out.println(query);
