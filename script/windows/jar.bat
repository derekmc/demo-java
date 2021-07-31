echo
echo "jar"
mkdir dist\
cd build
jar cfe ..\dist\demo.jar Demo *class
cd ..
dir dist\
