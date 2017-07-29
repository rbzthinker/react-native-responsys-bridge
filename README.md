
# react-native-responsys-bridge

## Getting started

`$ npm install react-native-responsys-bridge --save`

### Mostly automatic installation

`$ react-native link react-native-responsys-bridge`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-responsys-bridge` and add `RNResponsysBridge.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNResponsysBridge.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNResponsysBridgePackage;` to the imports at the top of the file
  - Add `new RNResponsysBridgePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-responsys-bridge'
  	project(':react-native-responsys-bridge').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-responsys-bridge/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-responsys-bridge')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNResponsysBridge.sln` in `node_modules/react-native-responsys-bridge/windows/RNResponsysBridge.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNResponsysBridge;` to the usings at the top of the file
  - Add `new RNResponsysBridgePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNResponsysBridge from 'react-native-responsys-bridge';

// TODO: What to do with the module?
RNResponsysBridge;
```
  