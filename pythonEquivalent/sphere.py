import math
print("enter the radius of the sphere")
class sphere:
    radius = input()
    radius = float(radius)
    volume = math.pi * (radius * radius * radius)

# doin the same stuff but in python
def main():
    print(sphere.volume)
main()