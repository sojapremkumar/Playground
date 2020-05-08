#include <iostream>
#include <string.h>
void removeAll(char * str, char * toRemove);
int main()
{
    char str[50];
    char toRemove[]=" the";
    gets(str);
    gets(toRemove);
    removeAll(str, toRemove);
    std::cout<<str;
    return 0;
}
void removeAll(char * str, char * toRemove)
{
    int i, j, stringLen, toRemoveLen;
    int found;
 
    stringLen   = strlen(str);      
    toRemoveLen = strlen(toRemove); 
    for(i=0; i <= stringLen - toRemoveLen; i++)
    {
        found = 1;
        for(j=0; j<toRemoveLen; j++)
        {
            if(str[i + j] != toRemove[j])
            {
                found = 0;
                break;
            }
        }
        if(str[i + j] != ' ' && str[i + j] != '\t' && str[i + j] != '\n' && str[i + j] != '\0') 
        {
            found = 0;
        }
        if(found == 1)
        {
            for(j=i; j<=stringLen - toRemoveLen; j++)
            {
                str[j] = str[j + toRemoveLen];
            }
            stringLen = stringLen - toRemoveLen;
            i--;
        }
    }
}