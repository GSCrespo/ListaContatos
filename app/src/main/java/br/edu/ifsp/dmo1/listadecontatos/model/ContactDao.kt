package br.edu.ifsp.dmo1.listadecontatos.model

import java.util.LinkedList

object ContactDao {

    private val dataset = LinkedList<Contact>()

    fun insert(contact: Contact){

        dataset.add(Contact(contact.name,contact.phone))

        // metodo sortWith que pode receber um comparador especifico, no caso
        // comparar os nomes, para deixa-los em ordem crescente
        // é possivel adicionar mais comparações, caso os nomes sejam iguais e comparar por numero
        dataset.sortWith(compareBy { it.name })


        // aqui está ordenando a lista toda a cada inserção nova de um contato
    }

    fun findAll():List<Contact>{
        return ArrayList(dataset)

        //dataset.sortedBy { it.name }
        // neste caso com o codigo acima, apenas ordena a lista quando for mostrar os itens na tela
    }

}