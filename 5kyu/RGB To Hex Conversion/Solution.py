def rgb(r, g, b):
    color = ""
    RGB = [r, g, b]
    
    for hex in RGB:
        if hex > 255:
            hex = 255
        elif hex < 0:
            hex = 0

        color += '%02X' % hex


    return color