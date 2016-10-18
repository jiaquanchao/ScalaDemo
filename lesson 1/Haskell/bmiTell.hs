bmiTell :: (RealFloat a) => a -> a -> String
bmiTell weight height
	| bmi <= skinny = "You're underweight."
	| bmi <= normal = "normal"
	| bmi <= fat    = "so fat"
	| otherwise     = "you're a whale"
	where bmi = weight / height ^ 2
          ( skinny, normal, fat ) = ( 18.5, 25.0, 30.0 )