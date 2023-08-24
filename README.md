
# Dungeon Crawl

<p align="center">
<img src="https://github.com/RehanyTamas/rgbplay_gif/blob/main/rgplay_gif_final.gif" width=75% height=75% >
</p>

[Roguelikes](https://en.wikipedia.org/wiki/Roguelike) are one of the oldest
types of video games. The earliest ones were made in the 70s, and they were inspired
a lot by tabletop RPGs.

In this team project we created a small top-down view video game with RPG mechanics, multiple rooms,enemies and traps.

## Used Technologies

- Java
- Maven

## Installation

This project requires that your machine is able run maven projects.

1. Download this repository to your machine
2. Navigate to the project directory
3. Compile
  ```sh
  mvn compile
  ```
4. Install
  ```sh
  mvn install
  ```
5. Start
  ```sh
  mvn exec:java -Dexec.mainClass=com.codecool.dungeoncrawl.App
  ```

## How to play

- Move with either AWSD or the arrow buttons
- To interact with either enemies or objects, simply bump into them
- Use keys to open locked doors
- Increase your stats by picking up items scaterred around the map 
  * weapons->attack 
  * shield->defense
  * heart->health

## Implemented features

- Movable player character with stats and an inventory
- Moving enemies with different behaviour depending on their type
- One fleshed out map
- Stat increasing items
- A trap that spawns enemies
- Unlockable doors
- A player fucosed camera
- Game over screen

## Features to be implemented

- Streamline traps
- More maps
- Victory screen
- Menu

## Contributors

- Zsolt Levai ([@zsoltlieber](https://github.com/zsoltlieber))
- Zoltan Farkas ([@FZF-Dev](https://github.com/FZF-Dev))
- Tamas Rehany ([@RehanyTamas](https://github.com/RehanyTamas))
