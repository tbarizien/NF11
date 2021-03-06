# NF11 - TP5

*Attention*, `pour` n'est pas à considérer comme une instruction. Sinon, on pourrait déclarer une procédure en cours d'éxecution, dans un `répéte`ou bien même encore dans une autre `procédure`... à proscrire.
On préférera spécifier dans `Logo.g4` un programme comme étant :
1. Une liste optionnelle de déclarations
2. Une liste d'instructions

## La classe procédure
| Procédure |
| --------- |
| params: String[] |
| instructions: ParseTree |

On garde une référence vers un `ParseTree`, qui est classe mère d'un noeud de Contexte (ici d'une ListeInstructionContext).

Petit refactoring sûrement nécessaire pour l'empilement des variables : à l'appel d'une procédure, empiler la table de ses variables locales...
On considère donc maintenant *une pile de `SymTable`*.

## La déclaration des procédures
Elles sont stockées dans une map : clé:nom_procedure, valeur:procedure

## L'appel aux procédures
On ne peut pas, dans la grammaire, vérifier que le nombre d'arguments passés à l'appel d'une procédure correspond aux nombre d'arguments qu'elle attend.