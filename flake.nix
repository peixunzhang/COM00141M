
{

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
    flake-utils.url = "github:numtide/flake-utils";
  };

  outputs = { self, nixpkgs, flake-utils }:

    flake-utils.lib.simpleFlake {
      inherit self nixpkgs;
      name = "COM00141M";
      overlay = ./nix/overlay.nix;
      shell = ./nix/shell.nix;
      systems = [ "x86_64-linux" ];
    };
}
