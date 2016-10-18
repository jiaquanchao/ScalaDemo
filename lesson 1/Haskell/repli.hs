repli :: (Num i, Ord i) => i -> a -> [a]
repli n x
	| n <= 0 = []
	| otherwise = x:repli (n-1) x