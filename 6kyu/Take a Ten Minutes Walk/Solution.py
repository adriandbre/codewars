def is_valid_walk(walk):
    if len(walk) < 10 or len(walk) > 10:
        return False
        
    horizontal = 0 
    vertical = 0
    for direction in walk:
        if direction == 'n':
            vertical = vertical + 1
        elif direction == 'w':
            horizontal = horizontal + 1
        elif direction == 's':
            vertical = vertical - 1
        elif direction == 'e':
            horizontal = horizontal - 1
    
    return horizontal == 0 and vertical == 0