# SEM-1-EXAM-3

# 3. Anonymiseret tekst

I denne opgave skal du lave et program som kan loade en tekst og fjerne studerendes navne og erstatte dem med "den studerende".

`“Katrine trak sit spørgsmål kl. 10”` bliver således til

`“Den studerende trak sit spørgsmål kl. 10”`.

1.	Lav en klasse StringHandler og giv den metoden replaceText(). Metoden skal som parametre tage:

- Den originale tekst som skal anonymiseres:
- En samling (liste) af navne der skal erstattes:

  **navne:** _Anders, Katrine, Joakim, Stine_


Metoden skal returnere den anonymiserede version af teksten.
**_Hint:_** du kan bruge metoder fra String-klassen

2.	Lav en tekstfil med en liste af ikke-anonymiseret tekst

```
     Katrine fik karakteren 7
     Stine udeblev fra timen
     Joakim fremlagde for klassen
     Joakim kom for sent
     Anders fik ny gruppe
     Anders afleverede for sent
```

3.	Lav en klasse Main med en main-metode, hvor du loader teksten.


4.  Instantier StringHandler og kald replaceText med hele eller dele af den loadede tekst, som argument.