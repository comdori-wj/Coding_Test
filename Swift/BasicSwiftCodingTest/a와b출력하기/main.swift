//
//  main.swift
//  a와b출력하기
//
//  Created by Wonji Ha on 2023/11/24.
//

import Foundation

let num = readLine()!.split(separator: " ").map{ Int($0)! }
print("a = \(num[0])\nb = \(num[1])")
