#!/bin/bash

RED="\033[0;31m"
GREEN="\033[0;32m"
NC="\033[0m"

fin=$1;

if ! [[ -r $1 ]]; then
    >&2 echo -e "${RED}Error: input file not found or is not readable.${NC}";
    exit 1;
fi
    
if [[ -z $2 ]]; then
    fout="Output";
else
    fout=$2;
fi

if [[ -r "${fout}.java" ]]; then
    echo -n "File ${fout}.java already exists. Removing... "
    rm "${fout}.java"
    echo -e "${GREEN}DONE${NC}"
fi

echo -n "Compiling the language's java files... "
# cd ..
# cd java_Examples/example1
# javac *.java;
cd ..
cd src
javac *.java;
echo -e "${GREEN}DONE${NC}"

echo "Compiling the program ${fin} to ${fout}.java"
rm Output.java >/dev/null 2>&1;
cat ../examples/$fin | java -ea TabLanMain > Output.java;
echo -e "${GREEN}DONE${NC}"
# aqui ainda estamos na src

#Compilation error
# if [[ $? -ne 0 ]]; then
#     echo -e "${RED}Compilation error, aborting compilation of the final program java file.${NC}"
# else
#     echo -n "Compiling the final program java file... "
#     javac ${fout}.java;
#     echo -e "${GREEN}DONE${NC}"
# fi
