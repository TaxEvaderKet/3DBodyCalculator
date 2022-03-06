import math
print("enter the width of the base, the length of the base and the height of the pyramid to start.")
class pyramid:
    BWid = input()
    BWid = float(BWid)
    BLen = input()
    BLen = float(BLen)
    height = input()
    height = float(height)
    base = BWid * BLen
    volume = (base * height) / 3



def main():
    print(pyramid.volume)
main()