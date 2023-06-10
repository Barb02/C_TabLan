#!/bin/bash

RED="\033[0;31m"
GREEN="\033[0;32m"
NC="\033[0m"

echo "Executing the program"

if [ -e "../src/Output.java" ]; then
    java -cp ../src Output
    # java ../src/Output
    echo -e "${GREEN}DONE${NC}"
else
    echo -e "${RED}ERROR: Output.java file does not exist${NC}"
fi