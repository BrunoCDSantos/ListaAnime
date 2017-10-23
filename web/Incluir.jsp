<%-- 
    Document   : Inicial
    Created on : 11/10/2017, 15:11:41
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Lista Anime</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <link rel="stylesheet" href="estilos.css">
        <link href="Css/fundoIncluir.css" rel="stylesheet">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    </head>
    <body>
        
        <!-- Accent-colored raised button with ripple -->

        <div class="demo-layout-transparent mdl-layout mdl-js-layout">
            <header class="mdl-layout__header mdl-layout__header--transparent">
                <div class="mdl-layout__header-row">

                    <span class="mdl-layout-title">Menu</span>
                </div>
            </header>
            <div class="mdl-layout__drawer">

                <span class="mdl-layout-title">Menu</span>
                <nav class="mdl-navigation">
                    <a class="mdl-navigation__link" href="Inicial.jsp">Página Inicial</a>
                    <a class="mdl-navigation__link" href="Incluir.jsp">Incluir Anime</a>
                    <a class="mdl-navigation__link" href="Modificar.jsp">Modificar anime</a>
                    <a class="mdl-navigation__link" href="Excluir.jsp">Excluir Anime</a>
                    <a class="mdl-navigation__link" href="Pesquisar.jsp">Pesquisar Anime</a>
                    <a class="mdl-navigation__link" href="Visualizar.jsp">Visualizar Anime</a>
                    <a class="mdl-navigation__link" href="index.jsp">Logout</a>
                </nav>
            </div>

            <main class="mdl-layout__content">  <img src="assets/coollogo3.png" class="displayed"/>
                <div class="img_formato_3">
                    <img src="assets/coollogo_Vindo.png"/>
                </div>
                <div class="img_formato_4" style="text-align: left ">
                    <img src="assets/coollogo_Bem.png"/> 
                    <form action="#">
                        <div  style="margin-left: 40%;">

                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" >
                                <input class="mdl-textfield__input" type="text" style="color: #01adef">
                                <label class="mdl-textfield__label" style="color: #FFF">Nome do Anime...</label>
                            </div>

                        </div>

                    </form>
                    <form action="#">
                        <div  style="margin-left: 40%;">

                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" >
                                <input class="mdl-textfield__input" type="text" style="color: #01adef" >
                                <label class="mdl-textfield__label" style="color: #FFF">Autor do Anime...</label>
                            </div>

                        </div>

                    </form>
                    <form action="#">
                        <div  style="margin-left: 40%;">

                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" >
                                <input class="mdl-textfield__input" type="text" style="color: #01adef">
                                <label class="mdl-textfield__label" style="color: #FFF">Ano do Anime...</label>
                            </div>

                        </div>

                    </form>
                    <form action="#">
                        <div  style="margin-left: 40%;">

                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" >
                                <input class="mdl-textfield__input" type="text" style="color: #01adef">
                                <label class="mdl-textfield__label" style="color: #FFF">Genero do Anime...</label>
                            </div>

                        </div>

                    </form>
                    <form action="">
                    <div style="margin-left: 60%
                         ">
                        
                            <button id="demo-show-toast" class="mdl-button mdl-js-button mdl-button--raised" type="button" style="color: #FFF">Incluir</button>
                            <div id="demo-toast-example" class="mdl-js-snackbar mdl-snackbar">
                                <div class="mdl-snackbar__text"></div>
                                <button class="mdl-snackbar__action" type="button"></button>
                            </div>
                            <script>
                                (function () {
                                    'use strict';
                                    window['counter'] = 0;
                                    var snackbarContainer = document.querySelector('#demo-toast-example');
                                    var showToastButton = document.querySelector('#demo-show-toast');
                                    showToastButton.addEventListener('click', function () {
                                        'use strict';
                                        var data = {message: 'Adicionado com sucesso # ' };
                                        snackbarContainer.MaterialSnackbar.showSnackbar(data);
                                    });
                                }());
                            </script>
                      

                    </div>
                  </form>
                </div>
            </main>

        </div>

    </body>
</html>