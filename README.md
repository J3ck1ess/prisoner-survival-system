# Prisoner Survival System (Josephus Problem)

A Java-based simulation of the classic Josephus problem.

## Features

- Dynamic input (number of prisoners & step size)
- Accurate Josephus elimination algorithm
- Real-time elimination logging
- Exception handling for invalid input
- Object-oriented layered design (Model / Service / Util)

## Tech Stack

- Java
- Collections (List, Set)
- OOP Design
- Exception Handling

## How It Works

- Prisoners are assigned unique random IDs
- They are arranged in a circle
- Every `step`-th prisoner is eliminated
- The process repeats until one survivor remains

## Run

Run `App.java`

## Example Output

====== Welcome to the Prisoner Survival System =====

Enter the number of prisoners:

50

Enter the step for eliminate:

4

Initial prisoners: [[38], [196], [105], [99], [52], [31], [1], [143], [190], [124], [84], [23], [5], [166], [71], [191], [59], [185], [104], [169], [54], [73], [47], [88], [131], [29], [175], [162], [83], [158], [3], [11], [183], [132], [18], [151], [13], [178], [79], [110], [111], [36], [140], [146], [180], [122], [118], [28], [144], [67]]

[INFO]2026-04-08 18:40:11 - Elimination number: 99 - Remaining number: 49

[INFO]2026-04-08 18:40:11 - Elimination number: 143 - Remaining number: 48

......

[INFO]2026-04-08 18:40:11 - Elimination number: 158 - Remaining number: 2

[INFO]2026-04-08 18:40:11 - Elimination number: 38 - Remaining number: 1

The final survivor:

ID: 118, First position: 47