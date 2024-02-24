package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		// 3 libros con valores directos
		Libro lib1 = new Libro ("Titulo1","Autor1",2001,"Editory",12.32f);
		Libro lib2 = new Libro ("Titulo2","Autor2",1010,"Editory",36.56f);
		Libro lib3 = new Libro ("Titulo3","Autor3",2020,"Editory",76.34f);
		
		//llamado a constructor
		//mostrar datos de los libros sin usar toString
		System.out.println("\nLibro 1");
		System.out.println("Titulo: "+lib1.getTitulo());
		System.out.println("Autor: "+lib1.getAutor());
		System.out.println("Año publicacion: "+lib1.getAñoPublicacion());
		System.out.println("Editorial: "+lib1.getEditorial());
		System.out.println("Precio: "+lib1.getPrecio());
		
		System.out.println("\nLibro 2");
		System.out.println("Titulo: "+lib2.getTitulo());
		System.out.println("Autor: "+lib2.getAutor());
		System.out.println("Año publicacion: "+lib2.getAñoPublicacion());
		System.out.println("Editorial: "+lib2.getEditorial());
		System.out.println("Precio: "+lib2.getPrecio());
		
		System.out.println("\nLibro 3");
		System.out.println("Titulo: "+lib3.getTitulo());
		System.out.println("Autor: "+lib3.getAutor());
		System.out.println("Año publicacion: "+lib3.getAñoPublicacion());
		System.out.println("Editorial: "+lib3.getEditorial());
		System.out.println("Precio: "+lib3.getPrecio());
		
		//precioConIva
		final float IVA=21F;
		
		System.out.println("\nPrecios con iva");
		System.out.println(Libro.PrecioConIva(lib1.getPrecio(), IVA));
		System.out.println(Libro.PrecioConIva(lib2.getPrecio(), IVA));
		System.out.println(Libro.PrecioConIva(lib3.getPrecio(), IVA));
	}

}
