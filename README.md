# FaweryChallenge_RadarCalculator

A Java-based Object-Oriented application that calculates speed limit and seatbelt violations for different vehicle types and generates fines accordingly.

---

## 🚘 Overview

The **Radar Calculator** system processes vehicle data recorded by road radars. It checks whether a driver has committed traffic violations such as:
* Exceeding speed limits based on vehicle type (Private Car, Bus, Truck).
* Failing to wear a seatbelt.

Violations are aggregated per vehicle plate number using a **Singleton Manager** (`CarViolations`), which tracks penalties and totals the fine amounts.

---

## 🏗️ Architecture & Features

* **Polymorphism & Abstraction:** Utilizes the `ICar` interface to handle speed rules dynamically across different car types (`PrivateCar`, `BusCar`, `TruckCar`).
* **Design Patterns:** Implements the **Singleton Pattern** in `CarViolations` to maintain a single central registry for all car violations and fines across the system.
* **Modular Packages:** Structured logically into `CarTypes` sub-packages (`CarTypes.PrivateCar`, `CarTypes.BusCar`, `CarTypes.TruckCar`).

---

## 📁 Project Structure

```text
FaweryChallenge_RadarCalculater/
├── Main.java               # Entry point of the application
├── Radar.java              # Simulates radar checks (Speed & Seatbelt)
├── CarViolations.java      # Singleton manager storing violations and fines
├── Fine.java               # Calculates total fines per plate number
├── CarTypes/
│   ├── ICar.java           # Vehicle interface
│   ├── ResultStruct.java   # Data structure for violation details & prices
│   ├── PrivateCar/
│   │   ├── PrivateCar.java
│   │   └── PrivateCarRules.java
│   ├── BusCar/
│   │   ├── BusCar.java
│   │   └── BusCarRules.java
│   └── TruckCar/
│       ├── TruckCar.java
│       └── TruckCarRules.java
└── README.md

📄 Example Output
![image](https://github.com/user-attachments/assets/6e290575-b812-4734-bf67-28257906d51a)
