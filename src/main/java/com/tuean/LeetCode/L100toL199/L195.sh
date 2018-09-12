#1 awk '{if(NR == 10) print $0}' file.txt

#2 awk 'NR == 10' file.txt

#3 sed -n 10p file.txt

#4 tail -n +10 file.txt | head -n 1

#5 head -n 10 file.txt | tail -n +10
