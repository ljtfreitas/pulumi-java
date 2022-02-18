// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KubernetesIPConfigurationResponse {
    /**
     * IP address of the Kubernetes node.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * Port of the Kubernetes node.
     * 
     */
    private final String port;

    @OutputCustomType.Constructor({"ipAddress","port"})
    private KubernetesIPConfigurationResponse(
        @Nullable String ipAddress,
        String port) {
        this.ipAddress = ipAddress;
        this.port = Objects.requireNonNull(port);
    }

    /**
     * IP address of the Kubernetes node.
     * 
     */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * Port of the Kubernetes node.
     * 
     */
    public String getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;
        private String port;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setPort(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public KubernetesIPConfigurationResponse build() {
            return new KubernetesIPConfigurationResponse(ipAddress, port);
        }
    }
}
