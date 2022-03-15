// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The Network Adapter configuration of a DataBox.
 * 
 */
public final class ApplianceNetworkConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplianceNetworkConfigurationResponse Empty = new ApplianceNetworkConfigurationResponse();

    /**
     * Mac Address.
     * 
     */
    @Import(name="macAddress", required=true)
      private final String macAddress;

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * Name of the network.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public ApplianceNetworkConfigurationResponse(
        String macAddress,
        String name) {
        this.macAddress = Objects.requireNonNull(macAddress, "expected parameter 'macAddress' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ApplianceNetworkConfigurationResponse() {
        this.macAddress = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplianceNetworkConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String macAddress;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplianceNetworkConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.macAddress = defaults.macAddress;
    	      this.name = defaults.name;
        }

        public Builder macAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ApplianceNetworkConfigurationResponse build() {
            return new ApplianceNetworkConfigurationResponse(macAddress, name);
        }
    }
}
