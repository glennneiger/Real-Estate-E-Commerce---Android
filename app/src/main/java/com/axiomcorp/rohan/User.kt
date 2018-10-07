package com.axiomcorp.rohan.rees

internal class User {
    var email: String? = null
    var username: String? = null
    var firstName: String? = null
    var lastName: String? = null
    var contact: String? = null
    var userType: String? = null

    constructor() {
        this.userType = null
        this.contact = this.userType
        this.lastName = this.contact
        this.firstName = this.lastName
        this.username = this.firstName
        this.email = this.username
    }

    constructor(email: String?, username: String?, firstName: String?, lastName: String?, contact: String?, userType: String?) {
        this.email = email
        this.username = username
        this.firstName = firstName
        this.lastName = lastName
        this.contact = contact
        this.userType = userType
    }
}