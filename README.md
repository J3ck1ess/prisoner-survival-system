# Prisoner Survival System (Josephus Problem)

A Java simulation of the classic Josephus problem.

## Description

- 100 prisoners are assigned unique random IDs (1–200)
- They stand in a line based on initial position
- In each round:
    - Prisoners in odd positions are eliminated
    - Remaining prisoners are re-indexed
- The process continues until only one survivor remains

## Features

- Object-oriented design (Model / Service / Util)
- Unique ID generation (HashSet)
- Iterative elimination logic
- Clear separation of responsibilities

## Tech Stack

- Java
- Collections (List, Set)
- OOP design

## Run

Run `App.java`

## Output Example

The remaining number of players in this round: 50
The remaining number of players in this round: 25
......
The remaining number of players in this round: 3
The remaining number of players in this round: 1

The final survivor:
ID: 181, Position: 64