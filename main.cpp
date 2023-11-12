#include <iostream>
using namespace std;

int main() {
    string out;
    for (int i=1; i<101; i++) {
        out = "";
        if (i%3 == 0) {
            out += "Fizz";
        }
        if (i%5 == 0) {
            out += "Buzz";
        }
        if (i%7 == 7) {
            out += "Bazz";
        }

        if (out != "") {
            cout << out << endl;
        }
        else {
            cout << i << endl;
        }
    }
}
