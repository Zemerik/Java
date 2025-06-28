# Day 06 - Methods and Functions

## 📚 What You'll Learn Today

- Understanding method declaration and syntax
- Learning about parameters and return types
- Understanding method overloading
- Working with static and instance methods
- Understanding scope and lifetime of variables

## 🎯 Key Concepts

### Method Structure
```java
accessModifier returnType methodName(parameters) {
    // method body
    return value; // if returnType is not void
}
```

### Method Types
- **Instance Methods**: Belong to objects, can access instance variables
- **Static Methods**: Belong to class, can't access instance variables
- **Void Methods**: Don't return any value
- **Return Methods**: Return a specific data type

### Method Overloading
- Multiple methods with same name but different parameters
- Different number, type, or order of parameters
- Compile-time polymorphism

### Parameter Passing
- **Pass by Value**: Primitive types are copied
- **Pass by Reference**: Objects are passed by reference
- **Varargs**: Variable number of arguments

## 📁 Files in This Day

1. **MethodBasics.java** - Basic method declaration and usage
2. **MethodOverloading.java** - Method overloading examples
3. **StaticMethods.java** - Static vs instance methods
4. **ParameterPassing.java** - How parameters are passed

## 🚀 How to Run

1. Compile: `javac MethodBasics.java`
2. Run: `java MethodBasics`

## 💡 Exercises

1. Create a calculator class with methods for basic operations
2. Write methods to find factorial and fibonacci numbers
3. Create a utility class with static methods
4. Implement method overloading for different data types

## 🔍 Important Notes

- **Method Naming**: Use camelCase, descriptive names
- **Single Responsibility**: Each method should do one thing well
- **Return Early**: Use early returns to reduce nesting
- **Documentation**: Use JavaDoc for public methods

## 📖 Additional Resources

- [Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [Method Overloading](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)

---

**Next Day**: Day 07 - Object-Oriented Programming Basics 