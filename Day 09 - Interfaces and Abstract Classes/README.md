# Day 09 - Interfaces and Abstract Classes

## 📚 What You'll Learn Today

- Understanding interfaces and their purpose
- Learning about abstract classes
- Understanding when to use interfaces vs abstract classes
- Working with default methods in interfaces
- Understanding multiple inheritance through interfaces

## 🎯 Key Concepts

### Interfaces
- **Contract**: Defines what a class must do
- **Multiple Implementation**: Class can implement multiple interfaces
- **Default Methods**: Java 8+ feature for interface methods with implementation
- **Static Methods**: Utility methods in interfaces

### Abstract Classes
- **Partial Implementation**: Can have concrete and abstract methods
- **Single Inheritance**: Class can extend only one abstract class
- **Constructor**: Can have constructors
- **State**: Can have instance variables

### When to Use What
- **Interface**: When you need multiple inheritance or pure contract
- **Abstract Class**: When you have common implementation to share
- **Interface**: For defining behavior
- **Abstract Class**: For defining what something is

### Default Methods
- Provide implementation in interfaces
- Backward compatibility
- Diamond problem resolution
- Can be overridden by implementing classes

## 📁 Files in This Day

1. **InterfaceBasics.java** - Basic interface examples
2. **AbstractClassBasics.java** - Abstract class examples
3. **DefaultMethods.java** - Default methods in interfaces
4. **MultipleInheritance.java** - Multiple inheritance through interfaces

## 🚀 How to Run

1. Compile: `javac InterfaceBasics.java`
2. Run: `java InterfaceBasics`

## 💡 Exercises

1. Create a Drawable interface with draw method
2. Build an abstract Shape class with concrete and abstract methods
3. Create a Payable interface with default tax calculation
4. Implement multiple interfaces in a single class

## 🔍 Important Notes

- **Interface Methods**: Public and abstract by default
- **Abstract Methods**: Must be implemented by concrete classes
- **Default Methods**: Can be overridden but not required
- **Diamond Problem**: Resolved by explicit override

## 📖 Additional Resources

- [Interfaces](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html)
- [Abstract Classes](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)

---

**Next Day**: Day 10 - Exception Handling 