import csv
import numpy

country_name=[]
cases_confirmed=[]

with open("covid_data.csv", "r") as source: #Giving input file with the dataset from https://www.kaggle.com/datasets/imdevskp/corona-virus-report?resource=download
	reader = csv.reader(source)
	for r in reader:
		country_name.append(r[0]) #Filter only country names that is in row1
		cases_confirmed.append(r[1]) #Filter only cases confirmed that is in row2

country_name.pop(0) #remove string "Country/Region" from dataset
cases_confirmed.pop(0) #remove string "Confirmed" from dataset
cases_confirmed = list(map(int, cases_confirmed)) #Convert list cases_confirmed from string to int

#Convert Lists to numpy arrays for better view
country_name=numpy.array(country_name) 
cases_confirmed=numpy.array(cases_confirmed)
print("Enter \n1.For country_name array \n2.For cases_confirmed array")
choice=int(input("Enter the choice: "))
if choice==1:
	print(country_name)
elif choice==2:
	print(cases_confirmed)
else:
	print("ERROR: Incorrect choice.")

