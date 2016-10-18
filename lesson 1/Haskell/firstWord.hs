firstWord :: String -> String -> String
firstWord firstName lastName = [f] ++ ". " ++ [l] ++ ". "
	where (f:_) = firstName
	      (l:_) = lastName