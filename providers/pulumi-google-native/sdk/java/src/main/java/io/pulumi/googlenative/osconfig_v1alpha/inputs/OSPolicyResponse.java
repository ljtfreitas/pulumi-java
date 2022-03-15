// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceGroupResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An OS policy defines the desired state configuration for a VM.
 * 
 */
public final class OSPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResponse Empty = new OSPolicyResponse();

    /**
     * This flag determines the OS policy compliance status when none of the resource groups within the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported as compliant even if the policy has nothing to validate or enforce.
     * 
     */
    @Import(name="allowNoResourceGroupMatch", required=true)
      private final Boolean allowNoResourceGroupMatch;

    public Boolean getAllowNoResourceGroupMatch() {
        return this.allowNoResourceGroupMatch;
    }

    /**
     * Policy description. Length of the description is limited to 1024 characters.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Policy mode
     * 
     */
    @Import(name="mode", required=true)
      private final String mode;

    public String getMode() {
        return this.mode;
    }

    /**
     * List of resource groups for the policy. For a particular VM, resource groups are evaluated in the order specified and the first resource group that is applicable is selected and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag `allow_no_resource_group_match`
     * 
     */
    @Import(name="resourceGroups", required=true)
      private final List<OSPolicyResourceGroupResponse> resourceGroups;

    public List<OSPolicyResourceGroupResponse> getResourceGroups() {
        return this.resourceGroups;
    }

    public OSPolicyResponse(
        Boolean allowNoResourceGroupMatch,
        String description,
        String mode,
        List<OSPolicyResourceGroupResponse> resourceGroups) {
        this.allowNoResourceGroupMatch = Objects.requireNonNull(allowNoResourceGroupMatch, "expected parameter 'allowNoResourceGroupMatch' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.resourceGroups = Objects.requireNonNull(resourceGroups, "expected parameter 'resourceGroups' to be non-null");
    }

    private OSPolicyResponse() {
        this.allowNoResourceGroupMatch = null;
        this.description = null;
        this.mode = null;
        this.resourceGroups = List.of();
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
