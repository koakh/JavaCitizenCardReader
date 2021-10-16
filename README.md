# README

Portuguese Citizen Card reader Project with Armbian 20.10 Arm-64 focal current_5.9.0

- Notes: '/home/mario/Dropbox/Aplicativos/Notable/notes/Armbian : TX9 Pro and MagicSee.md'

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).

## Launch project

open vscode and launch debugger or just press F5

get the command from terminal, this can be launched

/usr/bin/env /usr/lib/jvm/java-11-openjdk-arm64/bin/java -agentlib:jdwp=transport=dt_socket,server=n,suspend=y,address=localhost:33405 -Djava.library.path=/usr/local/lib -Dfile.encoding=UTF-8 App 
