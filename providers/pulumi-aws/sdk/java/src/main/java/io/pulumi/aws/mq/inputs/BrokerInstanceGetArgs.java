// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BrokerInstanceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrokerInstanceGetArgs Empty = new BrokerInstanceGetArgs();

    @InputImport(name="consoleUrl")
    private final @Nullable Input<String> consoleUrl;

    public Input<String> getConsoleUrl() {
        return this.consoleUrl == null ? Input.empty() : this.consoleUrl;
    }

    @InputImport(name="endpoints")
    private final @Nullable Input<List<String>> endpoints;

    public Input<List<String>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    public BrokerInstanceGetArgs(
        @Nullable Input<String> consoleUrl,
        @Nullable Input<List<String>> endpoints,
        @Nullable Input<String> ipAddress) {
        this.consoleUrl = consoleUrl;
        this.endpoints = endpoints;
        this.ipAddress = ipAddress;
    }

    private BrokerInstanceGetArgs() {
        this.consoleUrl = Input.empty();
        this.endpoints = Input.empty();
        this.ipAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerInstanceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> consoleUrl;
        private @Nullable Input<List<String>> endpoints;
        private @Nullable Input<String> ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerInstanceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleUrl = defaults.consoleUrl;
    	      this.endpoints = defaults.endpoints;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder setConsoleUrl(@Nullable Input<String> consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }

        public Builder setConsoleUrl(@Nullable String consoleUrl) {
            this.consoleUrl = Input.ofNullable(consoleUrl);
            return this;
        }

        public Builder setEndpoints(@Nullable Input<List<String>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEndpoints(@Nullable List<String> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }
        public BrokerInstanceGetArgs build() {
            return new BrokerInstanceGetArgs(consoleUrl, endpoints, ipAddress);
        }
    }
}
