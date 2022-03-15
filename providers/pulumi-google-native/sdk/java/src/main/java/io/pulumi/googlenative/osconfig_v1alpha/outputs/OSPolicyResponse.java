// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyResourceGroupResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OSPolicyResponse {
    /**
     * This flag determines the OS policy compliance status when none of the resource groups within the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported as compliant even if the policy has nothing to validate or enforce.
     * 
     */
    private final Boolean allowNoResourceGroupMatch;
    /**
     * Policy description. Length of the description is limited to 1024 characters.
     * 
     */
    private final String description;
    /**
     * Policy mode
     * 
     */
    private final String mode;
    /**
     * List of resource groups for the policy. For a particular VM, resource groups are evaluated in the order specified and the first resource group that is applicable is selected and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag `allow_no_resource_group_match`
     * 
     */
    private final List<OSPolicyResourceGroupResponse> resourceGroups;

    @CustomType.Constructor
    private OSPolicyResponse(
        @CustomType.Parameter("allowNoResourceGroupMatch") Boolean allowNoResourceGroupMatch,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("resourceGroups") List<OSPolicyResourceGroupResponse> resourceGroups) {
        this.allowNoResourceGroupMatch = allowNoResourceGroupMatch;
        this.description = description;
        this.mode = mode;
        this.resourceGroups = resourceGroups;
    }

    /**
     * This flag determines the OS policy compliance status when none of the resource groups within the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported as compliant even if the policy has nothing to validate or enforce.
     * 
    */
    public Boolean getAllowNoResourceGroupMatch() {
        return this.allowNoResourceGroupMatch;
    }
    /**
     * Policy description. Length of the description is limited to 1024 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Policy mode
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * List of resource groups for the policy. For a particular VM, resource groups are evaluated in the order specified and the first resource group that is applicable is selected and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag `allow_no_resource_group_match`
     * 
    */
    public List<OSPolicyResourceGroupResponse> getResourceGroups() {
        return this.resourceGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowNoResourceGroupMatch;
        private String description;
        private String mode;
        private List<OSPolicyResourceGroupResponse> resourceGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNoResourceGroupMatch = defaults.allowNoResourceGroupMatch;
    	      this.description = defaults.description;
    	      this.mode = defaults.mode;
    	      this.resourceGroups = defaults.resourceGroups;
        }

        public Builder allowNoResourceGroupMatch(Boolean allowNoResourceGroupMatch) {
            this.allowNoResourceGroupMatch = Objects.requireNonNull(allowNoResourceGroupMatch);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder resourceGroups(List<OSPolicyResourceGroupResponse> resourceGroups) {
            this.resourceGroups = Objects.requireNonNull(resourceGroups);
            return this;
        }
        public OSPolicyResponse build() {
            return new OSPolicyResponse(allowNoResourceGroupMatch, description, mode, resourceGroups);
        }
    }
}
