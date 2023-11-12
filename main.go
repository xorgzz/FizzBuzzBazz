package main
import "fmt"

func main() {
    var out string
    for i:=1; i<100; i++ {
        out = ""
        if i%3 == 0 {
            out += "Fizz"
        }
        if i%5 == 0 {
            out += "Buzz"
        }
        if i%7 == 0 {
            out += "Bazz"
        }

        if out != "" {
            fmt.Println(out)
        } else {
            fmt.Println(i)
        }
    }
}
