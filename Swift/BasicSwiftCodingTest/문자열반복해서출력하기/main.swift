//
//  main.swift
//  문자열반복해서출력하기
//
//  Created by Wonji Ha on 2023/11/24.
//

//import Foundation

let str = readLine()!.split(separator: " ").map{ $0 }
let n = Int(str[1])!
for _ in 1...n {
    print(str[0], terminator: "")
}
