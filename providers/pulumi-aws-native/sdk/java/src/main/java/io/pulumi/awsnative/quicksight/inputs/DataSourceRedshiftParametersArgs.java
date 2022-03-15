// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>Amazon Redshift parameters. The <code>ClusterId</code> field can be blank if
 *             <code>Host</code> and <code>Port</code> are both set. The <code>Host</code> and
 *             <code>Port</code> fields can be blank if the <code>ClusterId</code> field is set.</p>
 * 
 */
public final class DataSourceRedshiftParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceRedshiftParametersArgs Empty = new DataSourceRedshiftParametersArgs();

    /**
     * <p>Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are
     *             provided.</p>
     * 
     */
    @Import(name="clusterId")
      private final @Nullable Output<String> clusterId;

    public Output<String> getClusterId() {
        return this.clusterId == null ? Output.empty() : this.clusterId;
    }

    /**
     * <p>Database.</p>
     * 
     */
    @Import(name="database", required=true)
      private final Output<String> database;

    public Output<String> getDatabase() {
        return this.database;
    }

    /**
     * <p>Host. This field can be blank if <code>ClusterId</code> is provided.</p>
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Output.empty() : this.host;
    }

    /**
     * <p>Port. This field can be blank if the <code>ClusterId</code> is provided.</p>
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Double> port;

    public Output<Double> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    public DataSourceRedshiftParametersArgs(
        @Nullable Output<String> clusterId,
        Output<String> database,
        @Nullable Output<String> host,
        @Nullable Output<Double> port) {
        this.clusterId = clusterId;
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = host;
        this.port = port;
    }

    private DataSourceRedshiftParametersArgs() {
        this.clusterId = Output.empty();
        this.database = Output.empty();
        this.host = Output.empty();
        this.port = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRedshiftParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterId;
        private Output<String> database;
        private @Nullable Output<String> host;
        private @Nullable Output<Double> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRedshiftParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = Output.ofNullable(clusterId);
            return this;
        }

        public Builder database(Output<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder database(String database) {
            this.database = Output.of(Objects.requireNonNull(database));
            return this;
        }

        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = Output.ofNullable(host);
            return this;
        }

        public Builder port(@Nullable Output<Double> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Double port) {
            this.port = Output.ofNullable(port);
            return this;
        }
        public DataSourceRedshiftParametersArgs build() {
            return new DataSourceRedshiftParametersArgs(clusterId, database, host, port);
        }
    }
}
