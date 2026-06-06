# UML Diagrams

## 1. Class Diagram

Diagram ini menggambarkan struktur kelas, interface, dan hubungan antar komponen.

```plantuml
@startuml
skinparam classAttributeIconSize 0

interface Resizeable {
  + {abstract} resize(x: double): void
}

abstract class BangunDatar {
  # jumlahSisi: int
  # x: int
  # y: int
  + BangunDatar(sisi: int)
  + pindahkan(x: int, y: int): void
  + {abstract} draw(): void
  + {abstract} resize(): void
  + getJumlahSisi(): int
  + {abstract} getLuas(): double
  + {abstract} getKeliling(): double
}

class Kotak {
  - panjang: double
  - lebar: double
  + Kotak(panjang: double, lebar: double)
  + draw(): void
  + resize(): void
  + resize(x: double): void
  + getLuas(): double
  + getKeliling(): double
}

class Segitiga {
  - alas: double
  - tinggi: double
  + Segitiga(alas: double, tinggi: double)
  + draw(): void
  + resize(): void
  + getLuas(): double
  + getKeliling(): double
}

BangunDatar <|-- Kotak
BangunDatar <|-- Segitiga
Resizeable <|.. Kotak
@enduml
```

## 2. Sequence Diagram

Diagram ini menggambarkan alur eksekusi pada `MainResizeable`.

```plantuml
@startuml
actor User
participant "MainResizeable" as Main
participant "kotak: Kotak" as K

User -> Main : execute main()
create K
Main -> K : new Kotak(4, 5)
activate K
K --> Main : instance created
deactivate K

Main -> K : getLuas()
activate K
K --> Main : 20.0
deactivate K

Main -> K : getKeliling()
activate K
K --> Main : 18.0
deactivate K

Main -> K : resize(2.0)
activate K
note right of K : panjang = 4 * 2\nlebar = 5 * 2
K --> Main : updated dimensions
deactivate K

Main -> K : getLuas()
activate K
K --> Main : 80.0
deactivate K

Main -> K : getKeliling()
activate K
K --> Main : 36.0
deactivate K

Main --> User : Display results
@enduml
```
