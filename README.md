# REST-API-CLIENT


NAME : A.BRITTO RAJ

INTERN ID : CT04DZ331

DOMAIN : JAVA

DURATION : 4 WEEKS

MENTOR : NEELA SANTHOSH KUMAR


# Java Weather API Demo

## Overview

This is a simple Java console application that fetches and displays live weather data from a public weather API.  

It demonstrates how to make HTTP requests, parse JSON responses, and present the data in a structured format.

The project is aimed at beginners who want to learn how to work with REST APIs in Java using java.net.http and JSON parsing with the Gson library.

## Features

- Fetch current weather data for a specified city
- Parse JSON response to extract temperature, humidity, wind speed, and weather conditions
- Display the weather information in a clean, readable format
- Uses a free API (wttr.in) — no API key required

## Technologies Used

- Java (Core Java)
- java.net.http.HttpClient (Java 11+)
- Gson library for JSON parsing

## How It Works

1. *User Input (City)* – The city name is specified in the code (can be made dynamic).
2. *API Request* – Sends an HTTP GET request to the free wttr.in API in JSON format.
3. *JSON Parsing* – Uses Gson to parse the JSON and extract required data.
4. *Display Data* – Prints weather details such as temperature, humidity, condition, and wind speed in a neat format.

## Running the Project in IntelliJ IDEA

1. Clone or download this repository.
2. Open the folder in IntelliJ IDEA.
3. Ensure you have Java 11 or higher installed.
4. Add the Gson dependency to your pom.xml (if using Maven).
5. Create a Java class named WeatherApp in the src directory.
6. Copy the
