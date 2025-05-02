# Observer Pattern Implementation

## The Problem

Imagine you're building a weather monitoring system. You need to:
1. Collect weather data from sensors
2. Display this data in multiple ways (current conditions, statistics, forecasts)
3. Allow new types of displays to be added without changing existing code
4. Ensure all displays stay in sync with the latest data

Without the Observer pattern, you might:
- Hard-code each display to directly access the weather data
- Need to modify the weather data class every time you add a new display
- Risk displays getting out of sync with the data
- Create tight coupling between the data and its displays

## How Observer Pattern Solves It

The Observer pattern provides an elegant solution by:
1. Separating the weather data (Subject) from its displays (Observers)
2. Establishing a one-to-many relationship where one subject can notify many observers
3. Allowing observers to register/unregister dynamically
4. Ensuring all observers are automatically updated when data changes

Think of it like a newsletter subscription system:
- The newsletter publisher (Subject) maintains a list of subscribers (Observers)
- When new content is published, all subscribers automatically receive the update
- Subscribers can join or leave the subscription list at any time

## Real-World Examples

1. **Social Media Feeds**: When someone posts an update, all their followers (observers) automatically see the new post
2. **Stock Market**: When stock prices change, all subscribed traders and systems are notified
3. **Weather Apps**: When weather conditions change, all weather apps (observers) update their displays
4. **Event Handling**: In GUI applications, when a button is clicked, all registered event handlers are notified

## Components in Our Implementation

1. `Subject.java` (Publisher)
   - Defines the contract for the subject that others want to observe
   - Maintains a list of observers
   - Provides methods to add/remove observers
   - Notifies all observers when its state changes

2. `Observer.java` (Subscriber)
   - Defines the contract for objects that want to be notified of changes
   - Contains the update method that gets called when the subject changes

3. `WeatherData.java` (Concrete Publisher)
   - Implements the Subject interface
   - Maintains weather measurements (temperature, humidity, pressure)
   - Notifies all observers when measurements change

4. `CurrentConditionsDisplay.java` (Concrete Subscriber)
   - Implements the Observer interface
   - Displays current weather conditions
   - Gets automatically updated when weather data changes

5. `ObserverPatternDemo.java`
   - Demonstrates the pattern in action
   - Creates a weather station and display
   - Simulates weather changes

## How It Works

1. The WeatherData (subject) maintains a list of observers
2. When a new display (observer) is created, it registers itself with WeatherData
3. When weather measurements change:
   - WeatherData updates its internal state
   - WeatherData notifies all registered observers
   - Each observer (like CurrentConditionsDisplay) updates its display

## Key Benefits

1. **Loose Coupling**: The subject doesn't need to know anything about its observers except that they implement the Observer interface
2. **Dynamic Relationships**: Observers can be added or removed at runtime
3. **Broadcast Communication**: One subject can notify many observers
4. **Open for Extension**: New types of displays can be added without modifying existing code

## When to Use

- When changes to one object require changing others, and you don't know how many objects need to be changed
- When an object should be able to notify other objects without making assumptions about those objects
- When you need to create a one-to-many dependency between objects

## How to Run

```bash
javac *.java
java ObserverPatternDemo
```

## Example Output

```
First measurement:
Current conditions: 80.0F degrees and 65.0% humidity

Second measurement:
Current conditions: 82.0F degrees and 70.0% humidity

Third measurement:
Current conditions: 78.0F degrees and 90.0% humidity
``` 