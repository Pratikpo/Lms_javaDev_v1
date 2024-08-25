package com.lgi.lms.model.rowmapper;

import com.lgi.lms.dto.ModuleResponse;
import com.lgi.lms.dto.Permission;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModuleWithPermissionsRowMapper implements ResultSetExtractor<List<ModuleResponse>> {
    private final Map<Integer, ModuleResponse> moduleMap = new HashMap<>();

    @Override
    public List<ModuleResponse> extractData(ResultSet rs) throws SQLException {
        Map<Integer, ModuleResponse> moduleMap = new HashMap<>();

        while (rs.next()) {
            int moduleId = rs.getInt("moduleId");
            ModuleResponse module = moduleMap.get(moduleId);

            if (module == null) {
                module = new ModuleResponse();
                module.setId(moduleId);
                module.setModuleName(rs.getString("module_name"));
                module.setModuleCode(rs.getString("module_code"));
                module.setPermissions(new ArrayList<>());
                moduleMap.put(moduleId, module);
            }

            int permissionId = rs.getInt("permissionId");
            if (permissionId != 0) {
                Permission permission = new Permission();
                permission.setId(permissionId);
                permission.setPermissionName(rs.getString("permission_name"));
                permission.setPermissionCode(rs.getString("permission_code"));

                module.getPermissions().add(permission);
            }
        }

        return new ArrayList<>(moduleMap.values());
    }
}