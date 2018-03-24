/**
 * @author Vipin Gupta
 *
 * Mar 15, 2018
 */
package stack;
Applications of stacks

# Expression evaluation and syntax parsing
  1> Reverse Polish notation (RPN) : a mathematical notation in which operators follow their operands,
      in contrast to Polish notation (PN), in which operators precede their operands
# Backtracking
  2>  depth-first search, which finds all vertices of a graph that can be reached from a specified starting vertex
  3>   Other applications of backtracking involve searching through spaces that represent potential solutions to an optimization problem.
        Branch and bound is a technique for performing such backtracking searches without exhaustively searching all of the potential solutions in such a space.
          
# Compile time memory management
  4>   PostScript
  5>  Many virtual machines are also stack-oriented, including the p-code machine and the Java Virtual Machine
  6>  Almost all calling conventions‍—‌the ways in which subroutines receive their parameters and return results‍
  7>  nested or recursive function calls: This type of stack is used implicitly by the compiler to support 
    CALL and RETURN statements (or their equivalents) and is not manipulated directly by the programmer.
  8>  Some programming languages use the stack to store data that is local to a procedure. 
    Space for local data items is allocated from the stack when the procedure is entered, and is deallocated when the procedure exits.
      
# Efficient algorithms
  9> Graham scan, an algorithm for the convex hull of a two-dimensional system of points.
  10>  SMAWK algorithm for finding the row minima of a monotone matrix uses stacks in a similar way to Graham scan.
  11> All nearest smaller values, the problem of finding, for each number in an array, the closest preceding number that is smaller than it.
  12> The nearest-neighbor chain algorithm, a method for agglomerative hierarchical clustering based on maintaining a stack of clusters, 
      each of which is the nearest neighbor of its predecessor on the stack 
      
# Security
  13>  stack smashing attack that takes advantage of this type of implementation by providing oversized data input to a program that does not check the length of input
