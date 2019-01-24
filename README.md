# SHM2UPPAAL
Transform file of SHM to UPPAAL

## Input File Demo(SHM File)
input/travelagent.tshs_ecore

## Output File Demo(UPPAAL File)
output/travelagent.xml

# Usage
## Install python evnvironment 
First step is to install python3.6 on your computer and execute following command to install dependency

```
pip install xmltodict
```

## Install PyDEV plugins on your gemoc(or eclipss)
Install the PyDEV from toolbar -> Help -> Eclipse Marketplace on gemoc

![](D:\Program Files\WorkSpace\GemocStudio\Demo\SHM2UPPAAL\assets\Eclipse Marketpalce - PyDEV.jpg)

## Execute SHM2UPPAAL.py
1. Copy SHM2UPPAAL to your project and then create input, output, temp folders in your project. And move your ecore model file to input folder.

2. Configure your run parameter as following picture

   ![](D:\Program Files\WorkSpace\GemocStudio\Demo\SHM2UPPAAL\assets\Configure run parameters - 1.jpg)

   ![](D:\Program Files\WorkSpace\GemocStudio\Demo\SHM2UPPAAL\assets\Configure run parameters - 2.jpg)

3. Click run and uppaal model file will be generated in ouput folder


