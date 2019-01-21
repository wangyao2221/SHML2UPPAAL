# -*- coding: utf-8 -*-
import xmltodict,json

def parse_xml(xml_file):
    xml=open(xml_file,"r")
    xml_string=xml.read()
    xml.close()
    return xmltodict.parse(xml_string)

def write_xml(xml_dic,path):
    xml_string=xmltodict.unparse(xml_dic, pretty=True)
    out_xml=open(path,"w")
    out_xml.write(xml_string)
    out_xml.close()
   
    
def json_format_dumps(json_obj):
    return json.dumps(json_obj,indent=4, separators=(',', ':'))


def json_rename_single_node(json_obj,node_name,new_name):
    if json_obj.keys().__contains__(node_name) == False:
        return 
    
    content = json_obj[node_name]
    json_obj.__delitem__(node_name)
    json_obj[new_name] = content
    
    return json_obj


def get_node_by_attr_path(json_obj,attr_path):
    if len(attr_path) == 0: 
        return json_obj
        
    attr_path_arr = attr_path.split(".")
    
    node = json_obj
    for i in range(len(attr_path_arr)):
        attr_name = attr_path_arr[i]
        if attr_name == "":
            continue
#        print(attr_name)
        if node.keys().__contains__(attr_name):
            node = node[attr_name]
        else:
            return
    
    return node
    

def json_rename_node(json_obj,attr_path,node_name,new_name):
    node = get_node_by_attr_path(json_obj,attr_path)
        
    if node == None:
        return
    
    if(isinstance(node,list)):
        for i in range(len(node)):
            json_rename_single_node(node[i],node_name,new_name)
    else:
            json_rename_single_node(node,node_name,new_name)

    return json_obj


def json_single_node_attr_2_content(json_obj,node_name,attr_names,separator=" "):
    if json_obj.keys().__contains__(node_name) == False:
        return
            
    attr_len = len(attr_names)
    content = ""
    
    for i in range(attr_len):
        attr_name = attr_names[i]
        _attr_name = "@" + attr_name
        attr_value = json_obj[node_name][_attr_name]
        
        if json_obj[node_name].keys().__contains__(_attr_name) == False:
            continue
        
        if(i == 0):
            content = content + attr_value
        else:
            content = content + separator + attr_value
            
        json_obj[node_name].__delitem__(_attr_name)
    
    json_obj[node_name]["#text"] = content
            
    return json_obj


def json_node_attr_2_content(json_obj,attr_path,node_name,attr_names,separator=" "):
    node = get_node_by_attr_path(json_obj,attr_path)
        
    if node == None:
        return
    
    if(isinstance(node,list)):
        for i in range(len(node)):
            json_single_node_attr_2_content(node[i],node_name,attr_names)
    else:
            json_single_node_attr_2_content(node,node_name,attr_names)

    return json_obj

    
def json_attr_2_node(json_obj,attr_path,attr_names):
    nodes = get_node_by_attr_path(json_obj,attr_path)
    
    if nodes == None:
        return
    
    for node in nodes:
        for attr_name in attr_names:
            _attr_name = "@" + attr_name
            if node.keys().__contains__(_attr_name):
                attr_value = node[_attr_name]
                node[attr_name] = attr_value
                node.__delitem__(_attr_name)
        
    return json_obj

def json_attr_2_node_with_label(json_obj,attr_path,attr_names,labels):
    nodes = get_node_by_attr_path(json_obj,attr_path)
    
    if nodes == None:
        return
    
    for node in nodes:
        for attr_name,label in zip(attr_names,labels):
            _attr_name = "@" + attr_name
            if node.__contains__(_attr_name):
                attr_value = node[_attr_name]
                if not label == "": 
                    key = "@" + label
                    json_obj = {key:attr_value}
                    node[attr_name] = json_obj
                else:
                    node[attr_name] = {}
                node.__delitem__(_attr_name)
            
    return json_obj

def is_attr():
    # TODO 添加是否是标签里的属性
    return True


def is_node():
    # TODO 添加是否是标签
    return True