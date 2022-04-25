package com.example.myscrollappkt.model

class Member(val profile: Int, val fullname: String) {

    override fun toString(): String {
        return "Member { " +
                "profile=" + profile +
                ",  fullName='" + fullname + '\''
    }
}
