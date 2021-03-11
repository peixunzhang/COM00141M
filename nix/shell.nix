{ pkgs ? import <nixpkgs> }:
pkgs.mkShell {
  buildInputs = with pkgs; [ openjdk11 eclipses.eclipse-java];
}
