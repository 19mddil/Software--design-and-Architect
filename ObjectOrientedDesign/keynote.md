### Keynotes on object oriented modeling.
- Superclasses are generlised classes and subclasses are specialized classes.
- Protected(in uml uses a #) accessmodifier means attribute is accessesible
	- in encapsulating class itself	
	- to all subclasses
	- to all other classes under the same package(namespace)
- Diamond sign identifies the whole part object in UML design.
	- If diamond is filled its called aggregation relation to part objects from whole objects.
	- If diamond is not filled its called composition relation to part objects from whole objects.
- If the Superclass has explicit constructor, the subclass constructor must call its superclass's constructor by `super()`.