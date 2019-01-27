#global variables
cas_number = "7732-18-5"
rho = 1000 #density
mu = 1 #viscosity
Tm = 273.15 #melting point
Tb = 373.13 #boiling point
k = 0.58 #thermal conductivity


def convert_to_kelvin(temperature, units): 
    #checking for valid inputs
    if ((type(temperature) == int) or (type(temperature) == float)):
        if (units == 'C'):
            return temperature + 273.15
        if (units == 'F'):
            return (temperature + 459.67)*(5/9)
        if (units=="K"):
            return temperature
    else:
        return None
       
def is_gas (temperature):
    if type(temperature) == int or type(temperature) == float:
        if temperature >= Tb:
            return True
        else:
            return False
    else:
        return None
        
            

def is_liquid (temperature): # >Tm and <Tb
    if type(temperature) == int or type(temperature) == float:
        if temperature>Tm and temperature<Tb:
            return True
        else:
            return False
    else:
        return None
    
def is_solid (temperature): # <= Tm
    if type(temperature) == int or type(temperature) == float:
        if temperature <= Tm:
            return True
        else:
            return False
    else:
        return None


def is_numerical(num_str):
    if type(num_str) != str:
        return None
    
    # check if there is a minus sign at the beginning of the string
    if '-' in num_str:
        # there is a minus sign in the string, split the string at the minus sign
        (left, right) = num_str.split('-')

        # check that the left string is empty
        if left != '':
            return(False)

        # reassign the right string to num_str for further "analysis"
        num_str = right
   
    # given that there is no minus sign in num_str at this point, check for the presence
    # a decimal point
    if '.' in num_str:
        (left, right) = num_str.split('.')
        
        if left.isnumeric() and right.isnumeric():
            return(True)
        else:
            return(False)
    else:
        # check if the remaining string is numeric
        return(num_str.isnumeric())


userunits = str(input("Desired units? "))

if userunits in ('K','C','F'):
    
    units = userunits
    
    usertemperature = (input("Desired temperature? "))
    
    if is_numerical(usertemperature) == True:
        
        temperature2 = float (usertemperature)
        
        userkelvin = convert_to_kelvin(temperature2, units)
                
        if (is_gas(userkelvin) == True):
            print ("Gas")
            
        elif (is_liquid(userkelvin) == True):
            print ("Liquid")
            
        elif (is_solid(userkelvin) == True):
            print ("Solid")
            
        else: 
            print ("Invalid input")
            
    else: 
        print ("Invalid input")
        
else:
    print ("Invalid input")
        
    
