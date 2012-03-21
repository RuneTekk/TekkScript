#Structure
***

###**Table of Contents**

* Stack Structure
* Script Syntax
* Special Notes

##Stack Structure

The stack is exactly designed to be exactly like the Runescape client script system with a **String** and **Integer** 
stack that is manipulated from an integer Opcode and an operand object. The operand object can be either
a **String** or an **Integer** and respectedly come from their own stack.

##Script Syntax

The syntax for logic in the script is very lua like the syntax of Lua where logic blocks are clearly defined with a
logic keywords such as **if**, **elseif** or **else**. Using the **do** keyword is only required with **if**
and **elsif** to mark the end of the comparative statement.

###Examples of blocks

```
if a do
    #Block A
end

if a do
    #Block A
else 
    #Block B
end

if a do
    #Block A
elseif b do
    #Block B
else
    #Block C
end
```

Parameters must be encapsulted in **(** **)** parenthesis and be seperated with a space to define each parameter, 
Strings must be encapulsated in **"** **"** quotations to be correctly identified as a **String** object. The compiler
supports base 16 prefix numbers with the **0x(Number)** prefix.

###Example with methods 

```
print("Hello")        # > Hello
print(pow(5 2))       # > 25
```

##Special Notes

In the script there are maximums to the amount of each type of variable that can be introduced:

* 500 String variables
* 500 Integer variables