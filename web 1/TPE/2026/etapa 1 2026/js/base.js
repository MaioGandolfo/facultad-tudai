'use strict'

document.addEventListener( 'DOMContentLoaded' , () => {
  const hamburgerButton = document.querySelector('.hamburger-menu');
  const mainNav = document.getElementById('main-nav');

  hamburgerButton.addEventListener( 'click' , () => {
      const isExpanded = hamburgerButton
      .getAttribute( 'aria-expanded' ) === 'true' ;
      hamburgerButton.setAttribute( 'aria-expanded' , !isExpanded ) ;
      mainNav.classList.toggle( 'nav-open' ) ; // Alterna la clase 'nav-open'
    } 
  ) ;

  // Cierra el menu si se hace clic fuera de el en dispositivos moviles
  document.addEventListener( 'click' , (event) => {
    if( !mainNav.contains( event.target ) &&
        !hamburgerButton.contains( event.target ) &&
        mainNav.classList.contains( 'nav-open' ) ) {
      hamburgerButton.setAttribute( 'aria-expanded' , 'false' ) ;
      mainNav.classList.remove( 'nav-open' ) ;
    }
  } ) ;
} ) ;
