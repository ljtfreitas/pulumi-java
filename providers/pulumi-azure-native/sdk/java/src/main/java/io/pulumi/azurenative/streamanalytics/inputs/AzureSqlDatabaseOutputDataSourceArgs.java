// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an Azure SQL database output data source.
 * 
 */
public final class AzureSqlDatabaseOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSqlDatabaseOutputDataSourceArgs Empty = new AzureSqlDatabaseOutputDataSourceArgs();

    /**
     * The name of the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="database")
    private final @Nullable Input<String> database;

    public Input<String> getDatabase() {
        return this.database == null ? Input.empty() : this.database;
    }

    /**
     * The password that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * The name of the SQL server containing the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="server")
    private final @Nullable Input<String> server;

    public Input<String> getServer() {
        return this.server == null ? Input.empty() : this.server;
    }

    /**
     * The name of the table in the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="table")
    private final @Nullable Input<String> table;

    public Input<String> getTable() {
        return this.table == null ? Input.empty() : this.table;
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.Sql/Server/Database'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The user name that will be used to connect to the Azure SQL database. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="user")
    private final @Nullable Input<String> user;

    public Input<String> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    public AzureSqlDatabaseOutputDataSourceArgs(
        @Nullable Input<String> database,
        @Nullable Input<String> password,
        @Nullable Input<String> server,
        @Nullable Input<String> table,
        Input<String> type,
        @Nullable Input<String> user) {
        this.database = database;
        this.password = password;
        this.server = server;
        this.table = table;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.user = user;
    }

    private AzureSqlDatabaseOutputDataSourceArgs() {
        this.database = Input.empty();
        this.password = Input.empty();
        this.server = Input.empty();
        this.table = Input.empty();
        this.type = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlDatabaseOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> database;
        private @Nullable Input<String> password;
        private @Nullable Input<String> server;
        private @Nullable Input<String> table;
        private Input<String> type;
        private @Nullable Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlDatabaseOutputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.table = defaults.table;
    	      this.type = defaults.type;
    	      this.user = defaults.user;
        }

        public Builder setDatabase(@Nullable Input<String> database) {
            this.database = database;
            return this;
        }

        public Builder setDatabase(@Nullable String database) {
            this.database = Input.ofNullable(database);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setServer(@Nullable Input<String> server) {
            this.server = server;
            return this;
        }

        public Builder setServer(@Nullable String server) {
            this.server = Input.ofNullable(server);
            return this;
        }

        public Builder setTable(@Nullable Input<String> table) {
            this.table = table;
            return this;
        }

        public Builder setTable(@Nullable String table) {
            this.table = Input.ofNullable(table);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUser(@Nullable Input<String> user) {
            this.user = user;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = Input.ofNullable(user);
            return this;
        }

        public AzureSqlDatabaseOutputDataSourceArgs build() {
            return new AzureSqlDatabaseOutputDataSourceArgs(database, password, server, table, type, user);
        }
    }
}
