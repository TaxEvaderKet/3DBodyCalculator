import math # by @TaxEvaderKet on GitHub
print("enter the radius and the height of your cone")
class cone: # I am not going to bother to concatenate floats and strings together, also yes, I like encapsulation
    radius = input()
    radius = float(radius)
    height = input()
    height = float(height)
    base = math.pi * math.pow(radius, 2)
    volume = base * height / 3



def main():
    print(cone.volume)
main()