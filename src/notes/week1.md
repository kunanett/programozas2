# IDE használat (Java)
- [Visual Studio Setup Linux alatt](https://www.youtube.com/watch?v=-lRIw5sH2Eo)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
# C ismétlés
## Primitív típusok
---
- integer típusok: **short, int, long**
- floating point típusok: **float, double**
- karakter típus: **char**
- logikai típus (nincs beépített): **bool**
```C
#include <stdbool.h>
int main()
{
    bool arr[2] = { true, false };
    return 0;
}
```
## Tömb
---
- indexelés **0**-tól indul
- deklarálás után már nem lehet megváltoztatni a tömb típusát és méretét
- egy tömb elemei egymás mellett vannak tárolva a memóriában

```C
int array[5] = {1, 2, 3, 4, 5};
printf("%d", array[9])
```
- mi fog történni?

## String
---
- C-ben nincs string típus
- karakter tömb
- minden stringet a **\0** termináló karakter zár
- stringkezelő függvények, pl: strlen(), strcpy(), strcmp()
```C
#include <string.h>
```
- pointerekkel manipulálható
- értékük változhat (**mutable**)

## Control flow
---
### Elágaztató utsítások
#### If utasítás
```C
if (test expression) 
{
   // code that runs if expression is true
}
else{
    //code that runs if expression is false
}
```
#### Switch utasítás
```C
switch (expression)
​{
    case constant1:
      // statements
      break;

    case constant2:
      // statements
      break;
    .
    .
    .
    default:
      // default statements
}
```
### Ciklusok
- for ciklus
```C
for (initializationStatement; testExpression; updateStatement)
{
    // statements inside the body of loop
}
```
- while ciklus
```C
while (testExpression) {
  // the body of the loop 
}
```
- do while ciklus
```C
do {
  // the body of the loop
}
while (testExpression);
```
- break 
- continue

## Struktúra
---
- általunk definiált adattípus
- több különböző típust csoportosít egyetlen adattípusba
- definíció:
```C
struct Student {
  char name[50];
  char neptunCode[6];
  float grade;
};
```
- deklarálás, hivatkozás adattagra:
```C
Student student;
student.name = "Zsuzsi"
student.grade = 4.8
```




## Hasznos linkek
---
- [primitívek](https://www.decodejava.com/data-types-in-c.htm)
- [bool típus](https://www.geeksforgeeks.org/bool-in-c/)
- [tömb](https://www.programiz.com/c-programming/c-arrays)
- [string](https://www.programiz.com/c-programming/c-strings)
- [if utasítás](https://www.programiz.com/c-programming/c-if-else-statement)
- [switch utasítás](https://www.programiz.com/c-programming/c-switch-case-statement)
- [ciklusok](https://www.tutorialspoint.com/cprogramming/c_loops.htm)
- [struct](https://www.programiz.com/c-programming/c-structures)
  