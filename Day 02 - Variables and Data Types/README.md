# Day 02 - Variables and Data Types

## 📚 What You'll Learn Today

- Understanding variables and their purpose
- Learning about primitive data types in Java
- Declaring and initializing variables
- Understanding variable scope and naming conventions
- Working with different data types

## 🎯 Key Concepts

### What are Variables?
Variables are containers that store data values. They have a name, type, and value.

### Primitive Data Types
Java has 8 primitive data types:
- **byte**: 8-bit signed integer (-128 to 127)
- **short**: 16-bit signed integer (-32,768 to 32,767)
- **int**: 32-bit signed integer (-2^31 to 2^31-1)
- **long**: 64-bit signed integer (-2^63 to 2^63-1)
- **float**: 32-bit floating point
- **double**: 64-bit floating point
- **boolean**: true or false
- **char**: 16-bit Unicode character

### Variable Declaration Syntax
```java
dataType variableName = value;
```

### Naming Conventions
- Use camelCase for variable names
- Start with a letter, underscore, or dollar sign
- Cannot use Java keywords
- Names are case-sensitive

## 📁 Files in This Day

1. **VariableBasics.java** - Basic variable declaration and usage
2. **DataTypes.java** - All primitive data types with examples
3. **TypeConversion.java** - Converting between data types

## 🚀 How to Run

1. Compile: `javac VariableBasics.java`
2. Run: `java VariableBasics`

## 💡 Exercises

1. Create variables for your personal information (name, age, height)
2. Calculate the area of a circle using variables
3. Experiment with type conversion between different data types

## 🔍 Important Notes

- **Type Safety**: Java is strongly typed - you must declare variable types
- **Memory**: Different data types use different amounts of memory
- **Precision**: Be careful with floating-point arithmetic
- **Overflow**: Watch out for integer overflow with large numbers

## 📖 Additional Resources

- [Java Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Variable Naming Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html)

---

**Next Day**: Day 03 - Operators and Expressions 