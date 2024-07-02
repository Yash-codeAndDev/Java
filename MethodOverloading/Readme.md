# Method Overloading


## Automatic Type Promotion
* While resolving overloaded methods  when the exact match for a method argument is not found, so Java promotes the argument type to a larger type that is capable of handling the value.
* Java automatically promote the argument types according to certain rules. The order of promotion is typically from smaller to larger data types 

>[!Note] 
> Promotion Order
>   * byte → short → int → long → float → double
>   * char → int