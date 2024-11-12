nivel_de_magia(auror, 4).
nivel_de_magia(profesor, 3).
nivel_de_magia(estudiante, 1).
nivel_de_magia(comandante, 3).
nivel_de_magia(seguidor, 2).

mago_tiene_varita(auror, sauco).
mago_tiene_varita(profesor, roble_oscuro).
mago_tiene_varita(seguidor, vid).
mago_tiene_varita(estudiante, acebo).
mago_tiene_varita(comandante, roble_oscuro).

poder_varita(Varita, Poder) :-
    mago_tiene_varita(Mago, Varita),
    nivel_de_magia(Mago, Poder).

varita_personaje(Personaje, Varita) :-
    mago_tiene_varita(Personaje, Varita).

poder_de_varita_personaje(Personaje, Poder) :-
    varita_personaje(Personaje, Varita),
    poder_varita(Varita, Poder).

mejor_varita(Vencedor, Derrotado) :-
    poder_de_varita_personaje(Vencedor, PoderVencedor),
    poder_de_varita_personaje(Derrotado, PoderDerrotado),
    ( PoderDerrotado > PoderVencedor).

    







