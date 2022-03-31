package com.moulouk.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moulouk.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
