// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BrokerInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrokerInstanceArgs Empty = new BrokerInstanceArgs();

    @Import(name="consoleUrl")
      private final @Nullable Output<String> consoleUrl;

    public Output<String> getConsoleUrl() {
        return this.consoleUrl == null ? Output.empty() : this.consoleUrl;
    }

    @Import(name="endpoints")
      private final @Nullable Output<List<String>> endpoints;

    public Output<List<String>> getEndpoints() {
        return this.endpoints == null ? Output.empty() : this.endpoints;
    }

    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    public BrokerInstanceArgs(
        @Nullable Output<String> consoleUrl,
        @Nullable Output<List<String>> endpoints,
        @Nullable Output<String> ipAddress) {
        this.consoleUrl = consoleUrl;
        this.endpoints = endpoints;
        this.ipAddress = ipAddress;
    }

    private BrokerInstanceArgs() {
        this.consoleUrl = Output.empty();
        this.endpoints = Output.empty();
        this.ipAddress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> consoleUrl;
        private @Nullable Output<List<String>> endpoints;
        private @Nullable Output<String> ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleUrl = defaults.consoleUrl;
    	      this.endpoints = defaults.endpoints;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder consoleUrl(@Nullable Output<String> consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }

        public Builder consoleUrl(@Nullable String consoleUrl) {
            this.consoleUrl = Output.ofNullable(consoleUrl);
            return this;
        }

        public Builder endpoints(@Nullable Output<List<String>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(@Nullable List<String> endpoints) {
            this.endpoints = Output.ofNullable(endpoints);
            return this;
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }
        public BrokerInstanceArgs build() {
            return new BrokerInstanceArgs(consoleUrl, endpoints, ipAddress);
        }
    }
}
