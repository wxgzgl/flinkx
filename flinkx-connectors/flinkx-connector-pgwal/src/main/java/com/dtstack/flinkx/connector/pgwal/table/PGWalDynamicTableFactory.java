/*
 *    Copyright 2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.dtstack.flinkx.connector.pgwal.table;


import com.dtstack.flinkx.connector.jdbc.JdbcDialect;
import com.dtstack.flinkx.connector.jdbc.table.JdbcDynamicTableFactory;

/**
 *
 */
public class PGWalDynamicTableFactory extends JdbcDynamicTableFactory {
    @Override
    public String factoryIdentifier() {
        return "pgwal-x";
    }

    @Override
    protected JdbcDialect getDialect() {
        return new PostgresqlDialect();
    }
}
