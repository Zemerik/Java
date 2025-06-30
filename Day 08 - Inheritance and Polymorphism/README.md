# Day 08 - Inheritance and Polymorphism

## 📚 What You'll Learn Today

- Understanding inheritance and its benefits
- Learning about method overriding
- Understanding polymorphism (compile-time and runtime)
- Working with super keyword
- Understanding the Object class

## 🎯 Key Concepts

### Inheritance
- **IS-A relationship**: Child class is a type of parent class
- **Code Reuse**: Inherit properties and methods from parent
- **Single Inheritance**: Java supports single inheritance for classes
- **Multiple Inheritance**: Achieved through interfaces

### Method Overriding
- Redefining method in child class
- Same signature as parent method
- Runtime polymorphism
- @Override annotation recommended

### Polymorphism
- **Compile-time**: Method overloading
- **Runtime**: Method overriding
- Same interface, different implementations
- Flexibility and extensibility

### Super Keyword
- Access parent class members
- Call parent constructor
- Resolve naming conflicts

## 📁 Files in This Day

1. **InheritanceBasics.java** - Basic inheritance examples
2. **MethodOverriding.java** - Method overriding demonstration
3. **Polymorphism.java** - Polymorphic behavior
4. **SuperKeyword.java** - Using super keyword

## 🚀 How to Run

1. Compile: `javac InheritanceBasics.java`
2. Run: `java InheritanceBasics`

## 💡 Exercises

1. Create a hierarchy of animals (Animal -> Dog, Cat, Bird)
2. Build a shape hierarchy with area calculation
3. Create employee hierarchy with salary calculation
4. Implement a vehicle hierarchy

## 🔍 Important Notes

- **Final Classes**: Cannot be inherited
- **Final Methods**: Cannot be overridden
- **Access Modifiers**: Child can't reduce visibility
- **Constructor Chaining**: Use super() to call parent constructor

## 📖 Additional Resources

- [Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [Polymorphism](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)

---

**Next Day**: Day 09 - Interfaces and Abstract Classes 