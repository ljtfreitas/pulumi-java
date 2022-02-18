// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDedicatedHostArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDedicatedHostArgs Empty = new GetDedicatedHostArgs();

    /**
     * The expand expression to apply on the operation.
     * 
     */
    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the dedicated host group.
     * 
     */
    @InputImport(name="hostGroupName", required=true)
    private final String hostGroupName;

    public String getHostGroupName() {
        return this.hostGroupName;
    }

    /**
     * The name of the dedicated host.
     * 
     */
    @InputImport(name="hostName", required=true)
    private final String hostName;

    public String getHostName() {
        return this.hostName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDedicatedHostArgs(
        @Nullable String expand,
        String hostGroupName,
        String hostName,
        String resourceGroupName) {
        this.expand = expand;
        this.hostGroupName = Objects.requireNonNull(hostGroupName, "expected parameter 'hostGroupName' to be non-null");
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDedicatedHostArgs() {
        this.expand = null;
        this.hostGroupName = null;
        this.hostName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String hostGroupName;
        private String hostName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedHostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.hostGroupName = defaults.hostGroupName;
    	      this.hostName = defaults.hostName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setHostGroupName(String hostGroupName) {
            this.hostGroupName = Objects.requireNonNull(hostGroupName);
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetDedicatedHostArgs build() {
            return new GetDedicatedHostArgs(expand, hostGroupName, hostName, resourceGroupName);
        }
    }
}
