# Strategy Pattern Implementation

## The Problem

Imagine you're building an e-commerce system that needs to process payments. You face these challenges:
1. Different payment methods (Credit Card, PayPal, etc.) have different processing logic
2. New payment methods need to be added frequently
3. Payment processing logic might change for existing methods
4. You want to avoid complex if-else statements or switch cases

Without the Strategy pattern, you might:
- Create a large PaymentProcessor class with methods for each payment type
- Use complex conditional logic to handle different payment methods
- Need to modify existing code every time you add a new payment method
- Risk breaking existing payment processing when adding new methods

## How Strategy Pattern Solves It

The Strategy pattern provides an elegant solution by:
1. Defining a family of algorithms (payment strategies)
2. Encapsulating each algorithm in a separate class
3. Making the algorithms interchangeable
4. Allowing new strategies to be added without changing existing code

Think of it like choosing a route on a map:
- You have multiple ways to reach a destination (different strategies)
- You can switch between routes without changing your destination
- New routes can be added without affecting existing ones
- Each route has its own specific instructions

## Real-World Examples

1. **Payment Processing**: Different payment methods (Credit Card, PayPal, Bitcoin)
2. **Compression Algorithms**: Different compression strategies (ZIP, RAR, 7Z)
3. **Sorting Algorithms**: Different sorting strategies (QuickSort, MergeSort, BubbleSort)
4. **Navigation Systems**: Different route calculation strategies (Fastest, Shortest, Scenic)

## Components in Our Implementation

1. `PaymentStrategy.java` (Strategy Interface)
   - Defines the contract for all payment strategies
   - Ensures all payment methods follow the same interface

2. `CreditCardStrategy.java` (Concrete Strategy)
   - Implements credit card payment processing
   - Contains specific logic for credit card payments

3. `PayPalStrategy.java` (Concrete Strategy)
   - Implements PayPal payment processing
   - Contains specific logic for PayPal payments

4. `PaymentProcessor.java` (Context)
   - Uses the payment strategy
   - Can switch between different payment strategies
   - Delegates payment processing to the selected strategy

5. `StrategyPatternDemo.java`
   - Demonstrates the pattern in action
   - Shows how to use different payment strategies

## How It Works

1. The PaymentProcessor (context) accepts a PaymentStrategy
2. When processing a payment:
   - PaymentProcessor delegates to the current strategy
   - The strategy handles the specific payment method
   - Different strategies can be swapped at runtime

## Key Benefits

1. **Open/Closed Principle**: New payment methods can be added without modifying existing code
2. **Single Responsibility**: Each strategy class handles one payment method
3. **Eliminates Conditional Logic**: No need for complex if-else statements
4. **Runtime Flexibility**: Payment methods can be changed at runtime

## When to Use

- When you have a family of related algorithms
- When you need to switch between different algorithms at runtime
- When you want to avoid complex conditional statements
- When you need to add new algorithms without changing existing code

## How to Run

```bash
javac *.java
java StrategyPatternDemo
```

## Example Output

```
=== Processing payment with Credit Card ===
Processing payment of $100.0 using Credit Card
Card Number: ****-****-****-3456
Name: John Doe
Expiry Date: 12/25

=== Processing payment with PayPal ===
Processing payment of $50.0 using PayPal
PayPal Email: john.doe@example.com
``` 