maxi :: (Ord a) => [a] -> a
maxi [] = error "an empty list!"
maxi [x] = x
maxi (x:xs) = max x (maxi xs)