from types import new_class
import requests
import urllib.request
import time
from bs4 import BeautifulSoup

url = "https://wiki.52poke.com/zh-hans/%E7%A7%8D%E6%97%8F%E5%80%BC%E5%88%97%E8%A1%A8%EF%BC%88%E7%AC%AC%E4%BA%94%E4%B8%96%E4%BB%A3%EF%BC%89"
response = requests.get(url)
url2 = "https://wiki.52poke.com/wiki/%E7%89%B9%E6%80%A7%E5%88%97%E8%A1%A8%EF%BC%88%E6%8C%89%E5%85%A8%E5%9B%BD%E5%9B%BE%E9%89%B4%E7%BC%96%E5%8F%B7%EF%BC%89"
response2 = requests.get(url2)
url3 = "https://wiki.52poke.com/wiki/%E5%AE%9D%E5%8F%AF%E6%A2%A6%E5%88%97%E8%A1%A8%EF%BC%88%E6%8C%89%E5%AD%B5%E5%8C%96%E5%91%A8%E6%9C%9F%E5%88%86%E7%B1%BB%EF%BC%89"
response3 = requests.get(url3)
url4 = 'https://wiki.52poke.com/wiki/%E5%AE%9D%E5%8F%AF%E6%A2%A6%E5%88%97%E8%A1%A8%EF%BC%88%E6%8C%89%E6%8D%95%E8%8E%B7%E7%8E%87%E5%88%86%E7%B1%BB%EF%BC%89'
response4 = requests.get(url4)

soup = BeautifulSoup(response.text, "html.parser" )
ability = BeautifulSoup(response2.text, "html.parser")
eggs = BeautifulSoup(response3.text,'html.parser')
capRate = BeautifulSoup(response4.text,'html.parser')

a = soup.findAll("td")
b = ability.findAll("a")
c = eggs.findAll('a')
d = capRate.findAll('td')
types = ['一般','火','水','电','草','冰',
         '格斗','毒','地面','飞行','超能力',
         '虫','岩石','幽灵','龙','恶','钢','妖精']

eggGroups = ['怪兽','人型','水中1','水中3','虫','矿物',
            '飞行',	'不定形' ,'陆上','水中2' ,'妖精','百变怪',
            '植物','龙' ,'未发现 ','性别不明']
def t(str):
    return str.get_text().strip('\n');
index = 0
max_b_index = 2938

tempMap = dict()


for i in range(1,5550,11):
    id         =          t(a[i])
    name       =          t(a[i+2])
    hp         =          t(a[i+3])
    Attack     =          t(a[i+4])
    Defense    =          t(a[i+5])
    SPattack   =          t(a[i+6])
    SPdenfense =          t(a[i+7])
    Speed      =          t(a[i+8])
    tempMap[id] = ({
                    '名字':   name,
                    '属性':   None,
                    '属性2':  None,
                    'HP'  :   hp,
                    '攻击':   Attack,
                    '防御':   Defense,
                    '特攻':   SPattack,
                    '特防':   SPdenfense,
                    '速度':   Speed,
                    '特性':   None,
                    '特性2':  None,
                    '隐藏特性':None,
                    '蛋组1' : None,
                    '蛋组2' : None,
                    '捕获率' : 0,
                    '性别比例' : 0,
                  })
    index += 1
    
    

for pkm in tempMap.items():
    for i in range(28,max_b_index):
        if  b[i].get_text() == pkm[1]['名字']:
            j = i+1
            if b[j].get_text() in types:
                pkm[1]['属性'] = b[j].get_text()
                if b[j+1].get_text() in types:
                    j += 1
                    pkm[1]['属性2'] = b[j].get_text()
            else:
                break
            k = j+1
            pkm[1]['特性'] = b[k].get_text()
            k += 1
            if k < max_b_index:
                for pkm_test in tempMap.items():
                    if b[k].get_text() == pkm_test[1]['名字'] or b[k].get_text() == '第三世代':
                        pkm[1]['隐藏特性'] = None
                        break
                    elif b[k+1].get_text() == pkm_test[1]['名字'] or b[k+1].get_text() == '第三世代':
                        pkm[1]['隐藏特性'] = b[k].get_text()
                        break
                    elif b[k+2].get_text() == pkm_test[1]['名字'] or b[k+2].get_text() == '第三世代':
                        pkm[1]['特性2'] = b[k].get_text()
                        pkm[1]['隐藏特性'] = b[k+1].get_text()
                        break       
                    
for items in tempMap.keys():
    for y in range(22,2980):
        z = tempMap.get(items)
        if(c[y].get_text() == z['名字']):
            if(c[y+1].get_text() in eggGroups and c[y+2].get_text() in eggGroups):
                z['蛋组1'] = t(c[y+1])
                z['蛋组2'] = t(c[y+2])
                
            elif(c[y+1].get_text() in eggGroups and c[y+2].get_text() not in eggGroups):
                z['蛋组1'] = t(c[y+1])
                z['蛋组2'] = None
                
            elif(c[y+1].get_text() not in eggGroups and c[y+2].get_text() not in eggGroups):
                z['蛋组1'] = None
                z['蛋组2'] = None


for items in tempMap.keys():
    for i in range(3,3000,4):
        if(tempMap.get(items)['名字'] == t(d[i])):
            tempMap.get(items)['捕获率'] = t(d[i+1])

print(tempMap)