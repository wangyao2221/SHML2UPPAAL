# SHML2UPPAAL
Transform file of SHM to UPPAAL

## Input File Demo(SHML File)
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

![](https://github.com/wangyao2221/SHML2UPPAAL/blob/master/TransformationEngine/assets/Eclipse%20Marketpalce%20-%20PyDEV.jpg)

## Execute SHM2UPPAAL.py
1. Copy SHML2UPPAAL to your project and then create input, output, temp folders in your project. And move your ecore model file to input folder.

2. Configure your run parameter as following picture

   ![](https://github.com/wangyao2221/SHML2UPPAAL/blob/master/TransformationEngine/assets/Configure%20run%20parameters%20-%201.jpg)

   ![](https://github.com/wangyao2221/SHML2UPPAAL/blob/master/Transf/ormationEngine/assetsConfigure%20run%20parameters%20-%202.jpg)

3. Click run and uppaal model file will be generated in ouput folder


