@main def Test = {
  assert(isTupleN[Tuple1[Int]])
  assert(isTupleN[(Int, Int)])
  assert(isTupleN[(Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])
  assert(isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)])

  type Tup = (Int, Int)
  assert(isTupleN[Tup])

  assert(!isTupleN[(Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int, Int)]) // No tuple 23
  assert(!isTupleN[Tuple])
  assert(!isTupleN[EmptyTuple])
  assert(!isTupleN[NonEmptyTuple])
  assert(!isTupleN[Int *: Tuple])

  assert(!isTupleN[Any])
  assert(!isTupleN[Int])
  assert(!isTupleN[Object])
  assert(!isTupleN[Nothing])
}
