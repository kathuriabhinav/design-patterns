# Design Patterns

A collection of Java implementations of design patterns

## 1) Strategy

```mermaid
classDiagram
    direction LR
    class ShoppingCart {
      -strategy : PaymentStrategy
      setStrategy(s)
      checkout(amount)
    }
    class PaymentStrategy {
      <<interface>>
      pay(amount)
    }
    class CreditCardPayment
    class PayPalPayment

    ShoppingCart --> PaymentStrategy : has a
    PaymentStrategy <|.. CreditCardPayment : algorithm A
    PaymentStrategy <|.. PayPalPayment : algorithm B
```

## 2) Observer

```mermaid
classDiagram
    direction LR
    class Subject {
      <<interface>>
      registerObserver(o)
      removeObserver(o)
      notifyObservers()
    }
    class WeatherStation {
      -observers : List~Observer~
      setWeather(data)
    }
    class Observer {
      <<interface>>
      update(data)
    }
    class WeatherDisplay

    Subject <|.. WeatherStation : concrete subject
    Observer <|.. WeatherDisplay : concrete observer
    WeatherStation --> Observer : notifies all
```

## 3) Decorator

```mermaid
classDiagram
    direction LR
    class Beverage {
      <<abstract>>
      cost()
    }
    class Espresso
    class CondimentDecorator {
      <<abstract>>
      -beverage : Beverage
      cost()
    }
    class Milk
    class Mocha

    Beverage <|-- Espresso : base object
    Beverage <|-- CondimentDecorator : same type
    CondimentDecorator <|-- Milk
    CondimentDecorator <|-- Mocha
    CondimentDecorator --> Beverage : wraps (has a)
```

## 4) Simple Factory

```mermaid
classDiagram
    direction LR
    class PizzaStore {
      -factory : PizzaFactory
      orderPizza(type)
    }
    class PizzaFactory {
      createPizza(type)
    }
    class Pizza

    PizzaStore --> PizzaFactory : has a
    PizzaFactory --> Pizza : creates
```

## 5) Factory Method

```mermaid
classDiagram
    direction LR
    class PizzaStore {
      orderPizza(type)
      #createPizza(type)
    }
    class ConcretePizzaStore {
      #createPizza(type)
    }
    class Pizza

    PizzaStore <|-- ConcretePizzaStore : overrides create step
    PizzaStore --> Pizza : order flow uses
```

## 6) Abstract Factory

```mermaid
classDiagram
    direction LR
    class PizzaStore
    class IngredientFactory {
      <<interface>>
      createDough()
      createSauce()
      createCheese()
    }
    class ConcreteIngredientFactory
    class Pizza {
      -ingredientFactory : IngredientFactory
      prepare()
    }

    PizzaStore --> IngredientFactory : has a
    IngredientFactory <|.. ConcreteIngredientFactory : family implementation
    Pizza --> IngredientFactory : requests ingredient family
```

## 7) Singleton

```mermaid
classDiagram
    direction LR
    class Client
    class Singleton {
      -instance
      -Singleton()
      getInstance()
    }

    Client --> Singleton : getInstance()
```

## 8) Command

```mermaid
classDiagram
    direction LR
    class RemoteControl {
      -slot : Command
      setCommand(c)
      pressButton()
    }
    class Command {
      <<interface>>
      execute()
    }
    class LightOnCommand
    class LightOffCommand
    class Light {
      on()
      off()
    }

    RemoteControl --> Command : has a / invokes
    Command <|.. LightOnCommand
    Command <|.. LightOffCommand
    LightOnCommand --> Light : calls on()
    LightOffCommand --> Light : calls off()
```

## 9) Adapter

```mermaid
classDiagram
    direction LR
    class MediaPlayer {
      <<target interface>>
      play(type,file)
    }
    class Mp4PlayerAdapter {
      -mp4 : Mp4Player
      play(type,file)
    }
    class VlcPlayerAdapter {
      -vlc : VlcPlayer
      play(type,file)
    }
    class Mp4Player
    class VlcPlayer

    MediaPlayer <|.. Mp4PlayerAdapter : target contract
    MediaPlayer <|.. VlcPlayerAdapter : target contract
    Mp4PlayerAdapter --> Mp4Player : delegates
    VlcPlayerAdapter --> VlcPlayer : delegates
```

## 10) Facade

```mermaid
classDiagram
    direction LR
    class HomeTheaterFacade {
      watchMovie()
      endMovie()
    }
    class TV
    class SoundSystem
    class StreamingPlayer
    class Lights

    HomeTheaterFacade --> TV : has a
    HomeTheaterFacade --> SoundSystem : has a
    HomeTheaterFacade --> StreamingPlayer : has a
    HomeTheaterFacade --> Lights : has a
```

## 11) Template Method

```mermaid
classDiagram
    direction LR
    class CaffeineBeverage {
      <<abstract>>
      prepareRecipe()
      #brew()
      #addCondiments()
    }
    class Tea
    class Coffee

    CaffeineBeverage <|-- Tea : overrides brew/addCondiments
    CaffeineBeverage <|-- Coffee : overrides brew/addCondiments
```

## Notation Guide

- `#` means `protected`
- `-` means `private`
- no prefix means `public`

```mermaid
classDiagram
    direction LR
    class Interface
    class ImplClass
    class ParentClass
    class ChildClass
    class Holder
    class Owned

    Interface <|.. ImplClass : implements
    ParentClass <|-- ChildClass : extends
    Holder --> Owned : has a
```
