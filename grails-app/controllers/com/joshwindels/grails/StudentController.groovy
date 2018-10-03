package com.joshwindels.grails

class StudentController {

    def studentService

    def index() {
        respond studentService.list()
    }

    def show(Long id) {
        respond studentService.get(id)
    }

    def create(student) {
        respond studentService.save(student)
    }

    def save(student) {
        studentService.save(student)
        redirect action:"index", method:"GET"
    }

    def delete(id) {
        studentService.delete(id)
        redirect action:"index", method:"GET"
    }

}
