// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.inputs.JitNetworkAccessPolicyVirtualMachineArgs;
import io.pulumi.azurenative.security.inputs.JitNetworkAccessRequestArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JitNetworkAccessPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final JitNetworkAccessPolicyArgs Empty = new JitNetworkAccessPolicyArgs();

    /**
     * The location where ASC stores the data of the subscription. can be retrieved from Get locations
     * 
     */
    @InputImport(name="ascLocation", required=true)
    private final Input<String> ascLocation;

    public Input<String> getAscLocation() {
        return this.ascLocation;
    }

    /**
     * Name of a Just-in-Time access configuration policy.
     * 
     */
    @InputImport(name="jitNetworkAccessPolicyName")
    private final @Nullable Input<String> jitNetworkAccessPolicyName;

    public Input<String> getJitNetworkAccessPolicyName() {
        return this.jitNetworkAccessPolicyName == null ? Input.empty() : this.jitNetworkAccessPolicyName;
    }

    /**
     * Kind of the resource
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="requests")
    private final @Nullable Input<List<JitNetworkAccessRequestArgs>> requests;

    public Input<List<JitNetworkAccessRequestArgs>> getRequests() {
        return this.requests == null ? Input.empty() : this.requests;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Configurations for Microsoft.Compute/virtualMachines resource type.
     * 
     */
    @InputImport(name="virtualMachines", required=true)
    private final Input<List<JitNetworkAccessPolicyVirtualMachineArgs>> virtualMachines;

    public Input<List<JitNetworkAccessPolicyVirtualMachineArgs>> getVirtualMachines() {
        return this.virtualMachines;
    }

    public JitNetworkAccessPolicyArgs(
        Input<String> ascLocation,
        @Nullable Input<String> jitNetworkAccessPolicyName,
        @Nullable Input<String> kind,
        @Nullable Input<List<JitNetworkAccessRequestArgs>> requests,
        Input<String> resourceGroupName,
        Input<List<JitNetworkAccessPolicyVirtualMachineArgs>> virtualMachines) {
        this.ascLocation = Objects.requireNonNull(ascLocation, "expected parameter 'ascLocation' to be non-null");
        this.jitNetworkAccessPolicyName = jitNetworkAccessPolicyName;
        this.kind = kind;
        this.requests = requests;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualMachines = Objects.requireNonNull(virtualMachines, "expected parameter 'virtualMachines' to be non-null");
    }

    private JitNetworkAccessPolicyArgs() {
        this.ascLocation = Input.empty();
        this.jitNetworkAccessPolicyName = Input.empty();
        this.kind = Input.empty();
        this.requests = Input.empty();
        this.resourceGroupName = Input.empty();
        this.virtualMachines = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitNetworkAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ascLocation;
        private @Nullable Input<String> jitNetworkAccessPolicyName;
        private @Nullable Input<String> kind;
        private @Nullable Input<List<JitNetworkAccessRequestArgs>> requests;
        private Input<String> resourceGroupName;
        private Input<List<JitNetworkAccessPolicyVirtualMachineArgs>> virtualMachines;

        public Builder() {
    	      // Empty
        }

        public Builder(JitNetworkAccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ascLocation = defaults.ascLocation;
    	      this.jitNetworkAccessPolicyName = defaults.jitNetworkAccessPolicyName;
    	      this.kind = defaults.kind;
    	      this.requests = defaults.requests;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualMachines = defaults.virtualMachines;
        }

        public Builder setAscLocation(Input<String> ascLocation) {
            this.ascLocation = Objects.requireNonNull(ascLocation);
            return this;
        }

        public Builder setAscLocation(String ascLocation) {
            this.ascLocation = Input.of(Objects.requireNonNull(ascLocation));
            return this;
        }

        public Builder setJitNetworkAccessPolicyName(@Nullable Input<String> jitNetworkAccessPolicyName) {
            this.jitNetworkAccessPolicyName = jitNetworkAccessPolicyName;
            return this;
        }

        public Builder setJitNetworkAccessPolicyName(@Nullable String jitNetworkAccessPolicyName) {
            this.jitNetworkAccessPolicyName = Input.ofNullable(jitNetworkAccessPolicyName);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setRequests(@Nullable Input<List<JitNetworkAccessRequestArgs>> requests) {
            this.requests = requests;
            return this;
        }

        public Builder setRequests(@Nullable List<JitNetworkAccessRequestArgs> requests) {
            this.requests = Input.ofNullable(requests);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setVirtualMachines(Input<List<JitNetworkAccessPolicyVirtualMachineArgs>> virtualMachines) {
            this.virtualMachines = Objects.requireNonNull(virtualMachines);
            return this;
        }

        public Builder setVirtualMachines(List<JitNetworkAccessPolicyVirtualMachineArgs> virtualMachines) {
            this.virtualMachines = Input.of(Objects.requireNonNull(virtualMachines));
            return this;
        }

        public JitNetworkAccessPolicyArgs build() {
            return new JitNetworkAccessPolicyArgs(ascLocation, jitNetworkAccessPolicyName, kind, requests, resourceGroupName, virtualMachines);
        }
    }
}
