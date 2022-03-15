// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceElasticsearchConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceElasticsearchConfigArgs Empty = new DataSourceElasticsearchConfigArgs();

    /**
     * HTTP URL.
     * 
     */
    @Import(name="endpoint", required=true)
      private final Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint;
    }

    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    public DataSourceElasticsearchConfigArgs(
        Output<String> endpoint,
        @Nullable Output<String> region) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.region = region;
    }

    private DataSourceElasticsearchConfigArgs() {
        this.endpoint = Output.empty();
        this.region = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceElasticsearchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endpoint;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceElasticsearchConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.region = defaults.region;
        }

        public Builder endpoint(Output<String> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Output.of(Objects.requireNonNull(endpoint));
            return this;
        }

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public DataSourceElasticsearchConfigArgs build() {
            return new DataSourceElasticsearchConfigArgs(endpoint, region);
        }
    }
}
