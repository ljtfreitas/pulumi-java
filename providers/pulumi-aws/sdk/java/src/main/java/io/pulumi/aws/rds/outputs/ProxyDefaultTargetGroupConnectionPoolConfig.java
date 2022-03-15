// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProxyDefaultTargetGroupConnectionPoolConfig {
    /**
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only applies when the proxy has opened its maximum number of connections and all connections are busy with client sessions.
     * 
     */
    private final @Nullable Integer connectionBorrowTimeout;
    /**
     * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with `SET` statements to make sure that each connection has identical settings such as time zone and character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You can also include multiple variables in a single `SET` statement, such as `SET x=1, y=2`.
     * 
     */
    private final @Nullable String initQuery;
    /**
     * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.
     * 
     */
    private final @Nullable Integer maxConnectionsPercent;
    /**
     * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.
     * 
     */
    private final @Nullable Integer maxIdleConnectionsPercent;
    /**
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is `EXCLUDE_VARIABLE_SETS`.
     * 
     */
    private final @Nullable List<String> sessionPinningFilters;

    @CustomType.Constructor
    private ProxyDefaultTargetGroupConnectionPoolConfig(
        @CustomType.Parameter("connectionBorrowTimeout") @Nullable Integer connectionBorrowTimeout,
        @CustomType.Parameter("initQuery") @Nullable String initQuery,
        @CustomType.Parameter("maxConnectionsPercent") @Nullable Integer maxConnectionsPercent,
        @CustomType.Parameter("maxIdleConnectionsPercent") @Nullable Integer maxIdleConnectionsPercent,
        @CustomType.Parameter("sessionPinningFilters") @Nullable List<String> sessionPinningFilters) {
        this.connectionBorrowTimeout = connectionBorrowTimeout;
        this.initQuery = initQuery;
        this.maxConnectionsPercent = maxConnectionsPercent;
        this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
        this.sessionPinningFilters = sessionPinningFilters;
    }

    /**
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only applies when the proxy has opened its maximum number of connections and all connections are busy with client sessions.
     * 
    */
    public Optional<Integer> getConnectionBorrowTimeout() {
        return Optional.ofNullable(this.connectionBorrowTimeout);
    }
    /**
     * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with `SET` statements to make sure that each connection has identical settings such as time zone and character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You can also include multiple variables in a single `SET` statement, such as `SET x=1, y=2`.
     * 
    */
    public Optional<String> getInitQuery() {
        return Optional.ofNullable(this.initQuery);
    }
    /**
     * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.
     * 
    */
    public Optional<Integer> getMaxConnectionsPercent() {
        return Optional.ofNullable(this.maxConnectionsPercent);
    }
    /**
     * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is expressed as a percentage of the max_connections setting for the RDS DB instance or Aurora DB cluster used by the target group.
     * 
    */
    public Optional<Integer> getMaxIdleConnectionsPercent() {
        return Optional.ofNullable(this.maxIdleConnectionsPercent);
    }
    /**
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is `EXCLUDE_VARIABLE_SETS`.
     * 
    */
    public List<String> getSessionPinningFilters() {
        return this.sessionPinningFilters == null ? List.of() : this.sessionPinningFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyDefaultTargetGroupConnectionPoolConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer connectionBorrowTimeout;
        private @Nullable String initQuery;
        private @Nullable Integer maxConnectionsPercent;
        private @Nullable Integer maxIdleConnectionsPercent;
        private @Nullable List<String> sessionPinningFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyDefaultTargetGroupConnectionPoolConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionBorrowTimeout = defaults.connectionBorrowTimeout;
    	      this.initQuery = defaults.initQuery;
    	      this.maxConnectionsPercent = defaults.maxConnectionsPercent;
    	      this.maxIdleConnectionsPercent = defaults.maxIdleConnectionsPercent;
    	      this.sessionPinningFilters = defaults.sessionPinningFilters;
        }

        public Builder connectionBorrowTimeout(@Nullable Integer connectionBorrowTimeout) {
            this.connectionBorrowTimeout = connectionBorrowTimeout;
            return this;
        }

        public Builder initQuery(@Nullable String initQuery) {
            this.initQuery = initQuery;
            return this;
        }

        public Builder maxConnectionsPercent(@Nullable Integer maxConnectionsPercent) {
            this.maxConnectionsPercent = maxConnectionsPercent;
            return this;
        }

        public Builder maxIdleConnectionsPercent(@Nullable Integer maxIdleConnectionsPercent) {
            this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
            return this;
        }

        public Builder sessionPinningFilters(@Nullable List<String> sessionPinningFilters) {
            this.sessionPinningFilters = sessionPinningFilters;
            return this;
        }
        public ProxyDefaultTargetGroupConnectionPoolConfig build() {
            return new ProxyDefaultTargetGroupConnectionPoolConfig(connectionBorrowTimeout, initQuery, maxConnectionsPercent, maxIdleConnectionsPercent, sessionPinningFilters);
        }
    }
}
