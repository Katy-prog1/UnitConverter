# UnitConverter

**UnitConverter** is a simple Android application written in Java that allows users to convert between common units:

* Centimeters ↔ Meters
* Meters ↔ Kilometers
* Celsius ↔ Fahrenheit
* Fahrenheit ↔ Celsius
* Grams ↔ Kilograms

## Features

* Easy input of numeric values
* Dropdown (Spinner) to select conversion units
* Instant result display with formatted output
* Material Design UI components
* Responsive layout using ConstraintLayout

## Requirements

* Android Studio 2022.3 or later
* Android SDK API Level 21+
* Java 8+

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Katy-prog1/UnitConverter.git
   ```
2. Open the project in Android Studio.
3. Let Gradle sync and download dependencies.
4. Run the app on an emulator or physical device.

## Project Structure

```
UnitConverter/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/il/ac/tcb/unitconverter  # Java source code
│   │   │   └── res/                          # Layouts, strings, colors, etc.
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
├── gradle/                  # Gradle wrapper files
├── gradlew
├── gradlew.bat
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── .gitignore
└── README.md
```

## Usage

* Enter the value you want to convert.
* Tap the Spinner and choose the conversion type.
* Press **Convert** to see the result.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request.


