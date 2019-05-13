package com.cgi.bootcamp.practice;

import com.cgi.bootcamp.practice.shapes.Shape;

import static com.cgi.bootcamp.practice.shapes.Shapes.circle;
import static com.cgi.bootcamp.practice.shapes.Shapes.rectangle;
import static com.cgi.bootcamp.practice.shapes.Shapes.square;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Verschiebe diese Klasse in das entsprechende Package im 'src' Verzeichnis des Projektes.
 * Wenn Du alle Aufgaben bisher korrekt ausgeführt hast, sollte das Programm kompilieren und sich ausführen lassen.
 * Sollte es Compile-Probleme geben, versuche Deinen Code compatibel zu machen.
 * Validiere die Ausgabe mit https://jsonlint.com/
 */
public class ShapeApp {
	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<>();
		shapes.add(square(5));
		shapes.add(rectangle(3, 4));
		shapes.add(circle(7));

		Optional<String> shapeSnippets = (Optional<String>) shapes.stream()
				.map(Shape::info)
				.reduce((a, b) -> a + ",\n" + b);

		shapeSnippets.ifPresent(snippets -> System.out.println("["+snippets+"]"));
	}
}
