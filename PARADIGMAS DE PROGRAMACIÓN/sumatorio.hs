sumatorio :: Integer -> Integer -> Integer
sumatorio a b
    |a < b = a + sumatorio (a + 1) b
    |a == b = b
    |otherwise = error "el primer argumento es mayor que el segundo"
