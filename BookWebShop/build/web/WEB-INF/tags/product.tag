<%-- 
    Document   : product
    Created on : Feb 2, 2022, 8:39:16 PM
    Author     : User
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="product" type="Model.Product" required="true" %>

<%-- any content can be specified here e.g.: --%>

    <div class="product">
        <div class="shop-item">

            <img class="shop-item-image" src="${product.Images}">
            <span class="shop-item-title">The Vegetarian</span>
            <p class="shop-item-price">$14.99</p>
            <div class="shop-item-details">
                <button class="btn btn-warning shop-item-button" type="button">Add to Cart</button>
            </div>
        </div>
    </div>
