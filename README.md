# 📦 Package Sorter

A simple Java application that classifies and dispatches package

## 🚀 Objective

Sort packages into three categories:

- STANDARD: Packages that are neither bulky nor heavy.
- SPECIAL: Packages that are either bulky or heavy.
- REJECTED: Packages that are both bulky and heavy.

## 📐 Classification Rules

- A package is considered bulky if:
  - Any of its dimensions (width, height, or length) is ≥ 150 cm, or
  - Its volume (width × height × length) ≥ 1,000,000 cm³

- A package is considered heavy if:
  - Its mass ≥ 20 kg


### Run the Program

```bash
javac PackageSorter.java
java PackageSorter
