initWord :: [a] -> String
initWord xs = "This list is " ++ case xs of [] -> "Empty."
                                            [x] -> "a singleton list."
                                            xs -> "a longer list."