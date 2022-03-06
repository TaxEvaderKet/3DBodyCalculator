"""
essentially, this is just a knockoff version of my java project but since I got bored I made this
by @TaxEvaderKet on GitHub

"""



import math
print("enter the height and the radius of your cylinder")
class cylinder:
    radius = input()
    height = input()
    height = float(height)
    radius = float(radius)
    base = math.pi * math.pow(radius, 2)
    volume = base * height


def main():
    print(cylinder.volume)
main()