echo
echo "jar"
mkdir -p dist/
cd build
jar cfe ../dist/demo.jar Demo *class
cd ..
