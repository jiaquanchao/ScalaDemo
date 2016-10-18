jiecheng :: (Integral a) => a -> a
jiecheng 0 = 1
jiecheng n = n * jiecheng(n-1)