# Harmadik hét:

## Láthatósági szintek

- public: mindenhonnan elérhető
- private: csak az osztályon belülről érhető el
- egy .java forrásfájlon belül csak egyetlen publikus láthatóságú osztály lehet

## Enkapszuláció, információelrejtés

- az objektum-orientált paradigma egyik alapelve
- nagyvonalakban: zárjuk egy egységbe az információt és az információhoz tartozó műveleteket/viselkedést
- információelrejtés: zárjuk el az adatokat a külvilág elől => privát láthatósági szint
- a private adattagokhoz való hozzáférést szabályozzuk getterekkel és setterekkel

## Getter, setter

- hozzáférést biztosítanak **private** adattagokhoz

```java
private String title;

public String getTitle(){
        return title;
        }

public void setTitle(String title){
        this.title=title;
        }
```

- generálható IDE segítségével is
- fontos az elnevezési konvenció: get, set, is (boolean típusú változó esetén) előszavak
- nem kötelező gettert és settert is írni egy attribútumhoz, lehet csak az egyiket

## Osztályváltozó, példányváltozó

| Példányváltozó  | Osztályváltozó          |
| -----------  | -----------    |
| nincs explicit kulcsszó           | **static** kulcsszó        |
| minden példánynak lesz belőle egy saját változója          | csak egy van belőle, s az az osztályé       |
| csakis a példányon keresztül lehet elérni           | csak az osztályon keresztül érhetjük el, pl: Movie.count hivatkozással|

## toString()

- az **Object** osztálytól örökölt metódus, amelyet felülírhatunk
- érdemes kitenni az **@Override** annotációt, amely egy jelzés a fordítónak, hogy felülírtunk egy metódust
- emberi fogyasztásra alkalmas String reprezentációt szolgáltat egy osztályról
- abban az esetben, ha nem írjuk felül a toString() metódust, kiíratásnál csak a példány memóriacímét fogjuk látni
- példa:

```java
 @Override
public String toString(){
        return String.format("Movie: %s (%d), rating: %f",this.title,this.year,this.rating);
}
```

## this

- az aktuális objektum referenciáját tartalmazza

## DRY elv - Don't Repeat Yourself!

### kód duplikáció

- ha ugyanaz a kódrészlet vagy logika többször megjelenik
- duplikált kódot érdemes kiszervezni külön metódusba s azt a metódust használni a duplikátumok helyett
- feleslegesen hosszabítja a kódot
- nemcsak a szemet zavarja, ha ugyanaz a kódrészlet több helyen megjelenik, hanem hibára is ad lehetőséget: ha
  megváltozik a logika, akkor az összes helyen át kell írni a kódot, ahol duplikátum van, ezt pedig el is lehet akár
  felejteni

### információismétlés

```java
public class Circle {
    private double radius;
    private double area;
    private double circumference;
}
```

- a fenti kódrészlet is megsérti a DRY elvet, pedig nem kód duplikációról van szó
- ha már ismerjük egy kör sugarát, nem szükséges eltárolni a területét és kerületét is, mivel azok számolhatók a sugár
  alapján
- ezért érdemesebb példánymetódusokat írni a két érték kiszámolására