#Structure
***

###**Table of Contents**

* Stack Structure
* Script Syntax

##Stack Structure

The stack is exactly designed to be exactly like the Runescape client script system with a **String** and **Integer** 
stack that is manipulated from an integer Opcode and an operand object. The operand object can be either
a **String** or an **Integer** and respectedly come from their own stack.

##Script Syntax

The syntax for logic in the script is very lua like the syntax of Lua where logic blocks are clearly defined with a
logic keywords such as **if**, **elseif** or **else**. Using the **do** keyword is only required with **if**
and **elsif** to mark the end of the comparative statement.

***Loops are not supported with scripts.***

###Example of an if block

```
if a do
    #Block A
end
```

###Example of an if-else block

```
if a do
    #Block A
else 
    #Block B
end
```

###Example of an if-elseif-else block

```
if a do
    #Block A
elsif b do
    #Block B
else
    #Block C
end
```