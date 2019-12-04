# Design Patterns

### Factory Pattern
Create object without exposing the creation logic to the client and refer to newly created object using a common interface.

Allows you to create objects without specifying the exact class of object that will be created.



### Singleton Pattern
Single class which is responsible to create an object whil making sure that only single object gets created. 
You have only one instance of that class throughout the lifecycle of the application.

For example Chess: you only want one board for the whole game.

### Observer Pattern
One-to-many dependency between objects so that when one object changes state, all the dependents are notificed.

Observer -> Interested in updates
Subject -> Acts

Observer will subscribe to the Subjects methods, or values and change accordingly.

Similar to BehaviourSubject in Angular.


