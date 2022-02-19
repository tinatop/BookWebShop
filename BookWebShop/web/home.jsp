<%-- 
    Document   : home
    Created on : Feb 2, 2022, 8:18:14 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib prefix="x" uri="/WEB-INF/tlds/newtag_library/" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"  crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"  crossorigin="anonymous"></script>
        <link rel="stylesheet" href="CSS/home.css">
    </head>
    <body>
        <header class="p-3 bg-dark text-white">
            <div class="container">
                <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">


                    <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                        <li><a href="#" class="nav-link px-2 text-secondary">Home</a></li>
                        <li class="nav-item dropdown ">
                            <a class="nav-link dropdown-toggle text-white" href="#" id="dropdown" data-bs-toggle="dropdown" aria-expanded="false" >Categories</a>
                            <ul class="dropdown-menu" aria-labelledby="dropdown">
                                <li><a class="dropdown-item" href="#">Contemporary</a></li>
                                <li><a class="dropdown-item" href="#">Science Fiction </a></li>
                                <li><a class="dropdown-item" href="#">Fantasy</a></li>
                            </ul>
                        </li>
                        <li><a href="#" class="nav-link px-2 text-white">Cart</a></li>
                    </ul>

                    <div class="text-end">
                        <button type="button" class="btn btn-outline-light me-2">Login</button>
                        <button type="button" class="btn btn-warning">Sign-up</button>
                    </div>
                </div>
            </div>
        </header>

        <main>
            <div class="position-relative overflow-hidden p-3 p-md-1 m-md-3 text-center bg-light">
                <div class="col-md-5 p-lg-5 mx-auto my-5">
                    <h1 class="display-4 fw-normal">“Never trust anyone who has not brought a book with them.”</h1>
                    <p class="lead fw-normal"> -Lemony Snicket, Horseradish</p>
                    <svg xmlns="http://www.w3.org/2000/svg" width="26" height="26" fill="currentColor" class="bi bi-book" viewBox="0 0 16 16">
                    <path d="M1 2.828c.885-.37 2.154-.769 3.388-.893 1.33-.134 2.458.063 3.112.752v9.746c-.935-.53-2.12-.603-3.213-.493-1.18.12-2.37.461-3.287.811V2.828zm7.5-.141c.654-.689 1.782-.886 3.112-.752 1.234.124 2.503.523 3.388.893v9.923c-.918-.35-2.107-.692-3.287-.81-1.094-.111-2.278-.039-3.213.492V2.687zM8 1.783C7.015.936 5.587.81 4.287.94c-1.514.153-3.042.672-3.994 1.105A.5.5 0 0 0 0 2.5v11a.5.5 0 0 0 .707.455c.882-.4 2.303-.881 3.68-1.02 1.409-.142 2.59.087 3.223.877a.5.5 0 0 0 .78 0c.633-.79 1.814-1.019 3.222-.877 1.378.139 2.8.62 3.681 1.02A.5.5 0 0 0 16 13.5v-11a.5.5 0 0 0-.293-.455c-.952-.433-2.48-.952-3.994-1.105C10.413.809 8.985.936 8 1.783z"/>
                    </svg>
                </div>

                <div class="product-device shadow-sm d-none d-md-block"></div>
                <div class="product-device product-device-2 shadow-sm d-none d-md-block"></div>
            </div>

            <section class="container content-section">

                <div class="products">
                    <ul>
                        <c:forEach items="${products}" var="item">
                            <li><x:product product="${item}" > </x:product></li>
                            <hr>
                        </c:forEach>
                    </ul>
                </div>            

                <!--  <div class="shop-item">

                      <img class="shop-item-image" src="Images/HMwebS.jpg">
                      <span class="shop-item-title">Norwegian Wood</span>
                      <p class="shop-item-price">$6.99</p>
                      <div class="shop-item-details">
                          <button class="btn btn-warning shop-item-button" type="button">Add to Cart</button>
                      </div>
                  </div>
                  <div class="shop-item">

                      <img class="shop-item-image" src="Images/VESwebS.jpg">
                      <span class="shop-item-title">Vicious</span>
                      <p class="shop-item-price">$12.99</p>
                      <div class="shop-item-details">
                          <button class="btn btn-warning shop-item-button" type="button">Add to Cart</button>
                      </div>
                  </div>
                  <div class="shop-item">

                      <img class="shop-item-image" src="Images/JRRTwebS.jpg">
                      <span class="shop-item-title">The Hobbit</span>
                      <p class="shop-item-price">$17.99</p>
                      <div class="shop-item-details">
                          <button class="btn btn-warning shop-item-button" type="button">Add to Cart</button>
                      </div>
                  </div>
                  <div class="shop-item">

                      <img class="shop-item-image" src="Images/MZwebS.jpg">
                      <span class="shop-item-title">The Book Thief</span>
                      <p class="shop-item-price">$19.99</p>
                      <div class="shop-item-details">
                          <button class="btn btn-warning shop-item-button" type="button">Add to Cart</button>
                      </div>
                  </div>
                  <div class="shop-item">

                      <img class="shop-item-image" src="Images/SJMwebS.jpg">
                      <span class="shop-item-title">Throne of Glass</span>
                      <p class="shop-item-price">$7.99</p>
                      <div class="shop-item-details">
                          <button class="btn btn-warning shop-item-button" type="button">Add to Cart</button>
                      </div>
                  </div>
                  <div class="shop-item">

                      <img class="shop-item-image" src="Images/SNwebS.jpg">
                      <span class="shop-item-title">Sleeping Giants</span>
                      <p class="shop-item-price">$8.99</p>
                      <div class="shop-item-details">
                          <button class="btn btn-warning shop-item-button" type="button">Add to Cart</button>
                      </div>
                  </div>
                  <div class="shop-item">

                      <img class="shop-item-image" src="Images/MWwebS.jpg">
                      <span class="shop-item-title">All Systems Red</span>
                      <p class="shop-item-price">$9.99</p>
                      <div class="shop-item-details">
                          <button class="btn btn-warning shop-item-button" type="button">Add to Cart</button>
                      </div>
                  </div>
              </div>-->
            </section>

        </main>

        <div class="container">
            <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
                <div class="col-md-4 d-flex align-items-center">
                    <a href="/" class="mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1">
                        <svg class="bi" width="30" height="24"><use xlink:href="#bootstrap"/></svg>
                    </a>
                    <span class="text-muted">&copy; 2022 BookShopMT</span>
                </div>

            </footer>
        </div>
    </body>
</html>
