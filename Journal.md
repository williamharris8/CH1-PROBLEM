# Journal
PHASE1
-Choosing **private** is the most restrictive access modifier. This will protect data integrity. 

PHASE2- Super calls VaultItem's constructor. itemName and itemValue are private so that's how to do this.

PHASE3- When FragileItem is created with an invalid value, its constructors first line runs VaultItems constructor. That stops the object from being built. This is good handling so an invalid item wont exist in the system at all.

PHASE 4- Doubling the number of items this way will quadruple number of comparisons. It grows with the square of the input size.