package com.xy.inf.acl;

import java.util.List;

public interface DdlAcl {
    List<String> showTables();

    String desc(String table);
}
