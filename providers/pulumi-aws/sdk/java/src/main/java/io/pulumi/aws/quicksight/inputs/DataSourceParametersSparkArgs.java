// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersSparkArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersSparkArgs Empty = new DataSourceParametersSparkArgs();

    /**
     * The host to which to connect.
     * 
     */
    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> getHost() {
        return this.host;
    }

    /**
     * The warehouse to which to connect.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    public DataSourceParametersSparkArgs(
        Output<String> host,
        Output<Integer> port) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceParametersSparkArgs() {
        this.host = Output.empty();
        this.port = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersSparkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> host;
        private Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersSparkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder host(Output<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder host(String host) {
            this.host = Output.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }
        public DataSourceParametersSparkArgs build() {
            return new DataSourceParametersSparkArgs(host, port);
        }
    }
}
