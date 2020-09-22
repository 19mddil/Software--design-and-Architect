
### Decomposition


It means how whole objects contain part object or how whole objects relate to part objects.<br>
Depending on design it can relate part to whole by,
- Association- Lose interaction between two independednt object. To exist whole object do not depent on its part object or vice versa.
```java
public class Food{
			public eat(Drink juice){
				...
				...
			}
		}
```
- Aggregation- A week has a relationship or not heavily linked.Like whole object has a part object but do not cease to exist without the part or vice versa.
```java
public class Airline{
			private ArrayList<CrewMember> crew;
			public Airline(){
				crew = new ArrayList<CrewMember>();
			}
			public add(CrewMember crewMember){
				...
				...
			}
		}
```
- Composition-A strong whole object has a part relationship,if the whole objects loses its part object the whole cease to exist and part are only accessible by whole where contained part are exclusive to whole.
```java
public class Human{
			private Brain brain;
			public Human(){
				brain = new Brain();
			}
		}
```
	

