// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRegisteredAsnArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegisteredAsnArgs Empty = new GetRegisteredAsnArgs();

    @InputImport(name="peeringName", required=true)
    private final String peeringName;

    public String getPeeringName() {
        return this.peeringName;
    }

    @InputImport(name="registeredAsnName", required=true)
    private final String registeredAsnName;

    public String getRegisteredAsnName() {
        return this.registeredAsnName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetRegisteredAsnArgs(
        String peeringName,
        String registeredAsnName,
        String resourceGroupName) {
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.registeredAsnName = Objects.requireNonNull(registeredAsnName, "expected parameter 'registeredAsnName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetRegisteredAsnArgs() {
        this.peeringName = null;
        this.registeredAsnName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegisteredAsnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String peeringName;
        private String registeredAsnName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegisteredAsnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeringName = defaults.peeringName;
    	      this.registeredAsnName = defaults.registeredAsnName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPeeringName(String peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }

        public Builder setRegisteredAsnName(String registeredAsnName) {
            this.registeredAsnName = Objects.requireNonNull(registeredAsnName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetRegisteredAsnArgs build() {
            return new GetRegisteredAsnArgs(peeringName, registeredAsnName, resourceGroupName);
        }
    }
}