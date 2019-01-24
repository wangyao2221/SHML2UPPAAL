# -*- coding: utf-8 -*-

import XmlTransform as xt
import collections
import sys, getopt


def remove_some_useless(tshs):
    tshs["TSHS_Ecore:System"].__delitem__("@name")
    tshs["TSHS_Ecore:System"].__delitem__("@xmi:version")
    tshs["TSHS_Ecore:System"].__delitem__("@xmlns:xmi")
    tshs["TSHS_Ecore:System"].__delitem__("@xmlns:xsi")
    tshs["TSHS_Ecore:System"].__delitem__("@xmlns:TSHS_Ecore")
    tshss = tshs["TSHS_Ecore:System"]["tshss"]
    
    for ts in tshss:
        i = 0
        ownedstates = ts["ownedstates"]
        ownedtransitions = ts["ownedtransitions"]
        
        for s in ownedstates:
            s["@id"] = "id" + str(i) ## 为state添加id
            i += 1
            
            ## 删除state上UPPAAL不需要的属性
            if s.keys().__contains__("@outgoingct"):
                s.__delitem__("@outgoingct")
            if s.keys().__contains__("@incomingpt"):
                s.__delitem__("@incomingpt")
            if s.keys().__contains__("@incomingct"):
                s.__delitem__("@incomingct")
            if s.keys().__contains__("@outgoingpt"):
                s.__delitem__("@outgoingpt")
            if s.keys().__contains__("@slaveode"):
                s["@slaveode"] = s["@slaveode"].replace("//@tshss.1/@ownedodes.","")        
        
        for t in ownedtransitions:
            ## 删除transition上UPPAAL不需要的属性
            if t.keys().__contains__("@xsi:type"):
                t.__delitem__("@xsi:type")

def modify_some_attr(tshs):
    tshss = tshs["TSHS_Ecore:System"]["tshss"]
    tshss_size = len(tshss)
    
    for i in range(tshss_size):
        ts = tshss[i]
        ts_name = "//@tshss." + str(i)
        
        ownedtransitions = ts["ownedtransitions"]
        replace_source = ts_name + "/@ownedstates."
        ts["@initialstate"] = ts["@initialstate"].replace(replace_source,"id")
#        print(replace_source)
        
        for t in ownedtransitions:        
            if t.keys().__contains__("@triggerevent"):
                t["@triggerevent"] = t["@triggerevent"].replace("//@globalevents.","")
            if t.keys().__contains__("@csrc"):
                t["@csrc"] = t["@csrc"].replace(replace_source,"id")
                xt.json_rename_node(t,"","@csrc","@source")
            if t.keys().__contains__("@ctgt"):
                t["@ctgt"] = t["@ctgt"].replace(replace_source,"id")
                xt.json_rename_node(t,"","@ctgt","@target")
            if t.keys().__contains__("@psrc"):
                t["@psrc"] = t["@psrc"].replace(replace_source,"id")
                xt.json_rename_node(t,"","@psrc","@source")
            if t.keys().__contains__("@ptgt"):
                t["@ptgt"] = t["@ptgt"].replace(replace_source,"id")
                xt.json_rename_node(t,"","@ptgt","@target")

def rename_nodes(tshs):
    xt.json_rename_node(tshs,"TSHS_Ecore:System.tshss","ownedstates","location")
    xt.json_rename_node(tshs,"TSHS_Ecore:System.tshss","ownedtransitions","transition")
    xt.json_rename_node(tshs,"TSHS_Ecore:System.tshss","@initialstate","@init")
    xt.json_rename_node(tshs,"TSHS_Ecore:System","tshss","template")
    xt.json_rename_node(tshs,"","TSHS_Ecore:System","nta")

def attrs_2_nodes(tshs):
    xt.json_attr_2_node(tshs,"nta.template",["name"])
    xt.json_attr_2_node_with_label(tshs,"nta.template",["init"],["ref"])
    
    tshss = tshs["nta"]["template"]
    
    for ts in tshss:
        xt.json_attr_2_node(ts,"location",["name"])
        xt.json_attr_2_node_with_label(ts,"transition",["source","target"],["ref","ref"])
        xt.json_rename_node(ts,"transition","action","label")
        xt.json_attr_2_node_with_label(ts,"location",["urgent"],[""])
        xt.json_attr_2_node_with_label(ts,"location",["commited"],[""])
        
#        ts["transition"]["action"]["kind"] = assign


def preprocess(tshs):
    tshss = tshs["TSHS_Ecore:System"]["tshss"]
    
    # 将一些tshss Dict转换为List，因为源文件转换为json时一种标签在同一级下只出现一次时dict类型，多个则是list类型
    if type(tshss) == collections.OrderedDict:
        tshss_list = []
        tshss_list.append(tshss)
        tshs["TSHS_Ecore:System"]["tshss"] = tshss_list
        
    events = tshs["TSHS_Ecore:System"]["globalevents"]
    
    if type(events) == collections.OrderedDict:
        event_list = []
        event_list.append(events)
        tshs["TSHS_Ecore:System"]["globalevents"] = event_list
        
    clocks = tshs["TSHS_Ecore:System"]["globalclocks"]
    
    if type(clocks) == collections.OrderedDict:
        clock_list = []
        clock_list.append(clocks)
        tshs["TSHS_Ecore:System"]["globalclocks"] = clock_list
       
    tshss = tshs["TSHS_Ecore:System"]["tshss"]
    
    # 将一些ownedtransitions Dict转换为List
    for ts in tshss:
        ownedtransitions = ts["ownedtransitions"]
        if type(ownedtransitions) == collections.OrderedDict:
            ownedtransitions_list = []
            ownedtransitions_list.append(ownedtransitions)
            ts["TSHS_Ecore:System"]["tshss"]["ownedtransitions"] = ownedtransitions_list
            
    tshss = tshs["TSHS_Ecore:System"]["tshss"]
    
    # 添加transition的label
    for ts in tshss:
        ownedtransitions = ts["ownedtransitions"]
        for t in ownedtransitions:
            labels = []
            labels.append({"@kind":"select"})
            labels.append({"@kind":"guard"})
            labels.append({"@kind":"synchronisation"})
            labels.append({"@kind":"assignment"})
            
            t["label"] = labels
            
#            if t["@xsi:type"] == "TSHS_Ecore:ComTransition":
#                labels.append({"@kind":"guard"})
#                labels.append({"@kind":"synchronisation"})
#            elif t["@xsi:type"] == "TSHS_Ecore:ProbTransition":
#                labels.append({"@kind":"probability"})
            
def generate_transition_label(tshs):
    tshs["TSHS_Ecore:System"]["declaration"] = ""
    tshss = tshs["TSHS_Ecore:System"]["tshss"]
    
    for ts in tshss:
        ownedtransitions = ts["ownedtransitions"]
        for t in ownedtransitions:
            if t.__contains__("ownedguard"):
                guard = t["ownedguard"]
                
                labels = t["label"]
                if t.keys().__contains__("@action"):
                    assignment_content = t["@action"]
                    labels[3]["#text"] = assignment_content
                    t.__delitem__("@action")
                
                if guard.keys().__contains__("@tcondition"):
                    guard_content = guard["@tcondition"]
                    labels[1]["#text"] = guard_content
                    
                ## TODO 其他label
                t.__delitem__("ownedguard")

def generate_state_label_content(tshs):
    tshss = tshs["TSHS_Ecore:System"]["tshss"]
    
    for ts in tshss:
        ts["declaration"] = ""
        ownedstates = ts["ownedstates"]
        ownedtransitions = ts["ownedtransitions"]
        ownedodes = None
        
        if ts.__contains__("ownedodes"):
            ownedodes = ts["ownedodes"]
            ts["declaration"] = "hybrid clock E;"
        
        if not ownedodes == None:
            for state in ownedstates:
                labels = []
                labels.append({"@kind":"invariant"})
                
                if state.__contains__("@slaveode"):
                    function_index = int(state["@slaveode"])
                    
                    invariant_content = ""
                    invariant_content = invariant_content + "E'==" + ownedodes[function_index]["function"]["fright"]["@name"] ## 添加变化率
                    
                    ## 添加上限
                    for t in ownedtransitions:
                        if state["@id"] == t["@source"]:
                            if t["label"][1].__contains__("#text"):
                                guards = t["label"][1]["#text"].split("&&")
                                for guard in guards:
                                    if guard.find("<") >= 0:
                                        invariant_content = invariant_content + "&&" + guard.replace("=","")
                    
                    labels[0]["#text"] = invariant_content
                    state["label"] = labels
                    state.__delitem__("@slaveode")
    
def generate_events(tshs):
    tshss = tshs["nta"]["template"]
    events = tshs["nta"]["globalevents"]
    
    for ts in tshss:
        ownedtransitions = ts["transition"]
        for t in ownedtransitions:
            labels = t["label"]
        
            if t.keys().__contains__("@triggerevent"):
                event_index = t["@triggerevent"]
                event = events[int(event_index)]["@name"]
                if event[0:2] == "s_":
                    event = event[2:] + "!"
                if event[0:2] == "r_":
                    event = event[2:] + "?"
                if labels[2].keys().__contains__("#text") != True:
                    labels[2]["#text"] = event
                else:
                    labels[2]["#text"] = labels[2]["#text"] + "," + event
                t.__delitem__("@triggerevent")
            
def generate_declare(tshs):
    events = tshs["nta"]["globalevents"]
    clocks = tshs["nta"]["globalclocks"]
    declare_content = tshs["nta"]["declaration"]
    
    for event in events:
        name = event["@name"]
        if name[0:2] == "s_":
            name = name[2:]
            declare_content = declare_content + "broadcast chan " + name + ";"
    
    for clock in clocks:
        name = clock["@name"]
        declare_content = declare_content + "clock " + name + ";"
        
    tshs["nta"]["declaration"] = declare_content
            
    tshs["nta"].__delitem__("globalevents")
    tshs["nta"].__delitem__("globalclocks")
    
def generate_probability_transition(tshs):
    tshss = tshs["nta"]["template"]
    
    for ts in tshss:
        branch_point_list = []
        location_size = len(ts["location"])
        transitions = ts["transition"]
        for transition in transitions:
            if transition.keys().__contains__("@probability"):
                source_ref = transition["source"]["@ref"]
                labels = transition["label"]
                
                branch_point_id = "id" + str(location_size)
                location_size += 1
                
                branch_point_list.append({"@id":branch_point_id})
                trans = transition_instance(source_ref,branch_point_id,labels)
                transitions.append(trans)
                
                for transition_ in transitions:
                    if source_ref == transition_["source"]["@ref"] and transition_.keys().__contains__("@probability"):
                        transition_["source"]["@ref"] = branch_point_id
                        temp_labels = []
                        label_probability = {"@kind":"probability"}
                        label_probability["#text"] = transition_["@probability"][2:]
                        transition_.__delitem__("@probability")
                        temp_labels.append(labels[0])
                        temp_labels.append(labels[3])
                        temp_labels.append(label_probability)
                        transition_["label"] = temp_labels
#                        probability
                        
        ts["branchpoint"] = branch_point_list
                        
def transition_instance(source,target,labels):
    transition = {}
    transition["source"] = {}
    transition["source"]["@ref"] = source
    transition["target"] = {}
    transition["target"]["@ref"] = target

    temps_labels = []
    temps_labels.append(labels[1])
    temps_labels.append(labels[2])
    transition["label"] = temps_labels

    return transition

def arrange_order(tshs):
    ## 对template里的元素排序
    templates = tshs["nta"]["template"]
    for template in templates:
        arrange_template_order(template)
        
        locations = template["location"]
        transitions = template["transition"]
        
        for location in locations:
            arrange_location_order(location)
            
        for transition in transitions:
            arrange_transition_order(transition)
    

def arrange_template_order(template):
    declaration = template["declaration"]
    locations = template["location"]
    transitions = template["transition"]
    name = template["name"]
    init = template["init"]
    branchpoints = template["branchpoint"]
    
    template.clear()
    
    template["name"] = name
    template["declaration"] = declaration
    template["location"] = locations
    template["branchpoint"] = branchpoints
    template["init"] = init
    template["transition"] = transitions
    
def arrange_transition_order(transition):
    source = transition["source"]
    target = transition["target"]
    labels = transition["label"]
    
    transition.clear()
    
    transition["source"] = source
    transition["target"] = target 
    transition["label"] = labels

def arrange_location_order(state):
    id_ = state["@id"]
    name = state["name"]
    label = None
    urgent = None
    if state.__contains__("label"):
        label = state["label"]
        
    if state.__contains__("urgent"):
        urgent = state["urgent"]
    
    state.clear()
    
    state["@id"] = id_
    state["name"] = name 
    if not label == None:
        state["label"] = label
        
    if not urgent == None:
        state["urgent"] = urgent
    
def add_system_define(tshs):
    templates = tshs["nta"]["template"]
    
    systems = ""
    
    for template in templates:
        if len(systems) == 0:
            systems = systems + template["name"]
        else:
            systems = systems + "," + template["name"]
    
    tshs["nta"]["system"] = "system " + systems + ";"
    
def tshs2uppaal(input_path,output_path):
    temp_path = "temp/tshs_temp.xml"
    
    tshs = xt.parse_xml("input/travelagent.tshs_ecore")
    preprocess(tshs)
    generate_transition_label(tshs)
    
    remove_some_useless(tshs)
    modify_some_attr(tshs)
    generate_state_label_content(tshs)
    xt.write_xml(tshs,temp_path)
    
    rename_nodes(tshs)
    attrs_2_nodes(tshs)
    generate_events(tshs)
    generate_declare(tshs)
    generate_probability_transition(tshs)
    arrange_order(tshs)
    add_system_define(tshs)
    
    xt.write_xml(tshs,output_path)

def main(argv=None):
    opts, args = getopt.getopt(sys.argv[1:], "hi:o:")
    input_path=""
    output_path=""
    for op, value in opts:
        if op == "-i":
            input_path = value
        elif op == "-o":
            output_path = value
        elif op == "-h":
            usage()
            sys.exit()
    
    tshs2uppaal(input_path, output_path)

if __name__ == "__main__":
    sys.exit(main())
