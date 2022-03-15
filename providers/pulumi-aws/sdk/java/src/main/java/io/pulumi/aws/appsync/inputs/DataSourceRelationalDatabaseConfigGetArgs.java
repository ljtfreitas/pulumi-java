// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigHttpEndpointConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceRelationalDatabaseConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceRelationalDatabaseConfigGetArgs Empty = new DataSourceRelationalDatabaseConfigGetArgs();

    /**
     * The Amazon RDS HTTP endpoint configuration. See HTTP Endpoint Config.
     * 
     */
    @Import(name="httpEndpointConfig")
      private final @Nullable Output<DataSourceRelationalDatabaseConfigHttpEndpointConfigGetArgs> httpEndpointConfig;

    public Output<DataSourceRelationalDatabaseConfigHttpEndpointConfigGetArgs> getHttpEndpointConfig() {
        return this.httpEndpointConfig == null ? Output.empty() : this.httpEndpointConfig;
    }

    /**
     * Source type for the relational database. Valid values: `RDS_HTTP_ENDPOINT`.
     * 
     */
    @Import(name="sourceType")
      private final @Nullable Output<String> sourceType;

    public Output<String> getSourceType() {
        return this.sourceType == null ? Output.empty() : this.sourceType;
    }

    public DataSourceRelationalDatabaseConfigGetArgs(
        @Nullable Output<DataSourceRelationalDatabaseConfigHttpEndpointConfigGetArgs> httpEndpointConfig,
        @Nullable Output<String> sourceType) {
        this.httpEndpointConfig = httpEndpointConfig;
        this.sourceType = sourceType;
    }

    private DataSourceRelationalDatabaseConfigGetArgs() {
        this.httpEndpointConfig = Output.empty();
        this.sourceType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRelationalDatabaseConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DataSourceRelationalDatabaseConfigHttpEndpointConfigGetArgs> httpEndpointConfig;
        private @Nullable Output<String> sourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRelationalDatabaseConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpointConfig = defaults.httpEndpointConfig;
    	      this.sourceType = defaults.sourceType;
        }

        public Builder httpEndpointConfig(@Nullable Output<DataSourceRelationalDatabaseConfigHttpEndpointConfigGetArgs> httpEndpointConfig) {
            this.httpEndpointConfig = httpEndpointConfig;
            return this;
        }

        public Builder httpEndpointConfig(@Nullable DataSourceRelationalDatabaseConfigHttpEndpointConfigGetArgs httpEndpointConfig) {
            this.httpEndpointConfig = Output.ofNullable(httpEndpointConfig);
            return this;
        }

        public Builder sourceType(@Nullable Output<String> sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder sourceType(@Nullable String sourceType) {
            this.sourceType = Output.ofNullable(sourceType);
            return this;
        }
        public DataSourceRelationalDatabaseConfigGetArgs build() {
            return new DataSourceRelationalDatabaseConfigGetArgs(httpEndpointConfig, sourceType);
        }
    }
}
