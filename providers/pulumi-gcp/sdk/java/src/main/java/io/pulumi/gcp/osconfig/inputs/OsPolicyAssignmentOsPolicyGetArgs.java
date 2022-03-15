// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyGetArgs Empty = new OsPolicyAssignmentOsPolicyGetArgs();

    /**
     * This flag determines the OS policy compliance status when none of the resource groups within the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported as compliant even if the policy has nothing to validate or enforce.
     * 
     */
    @Import(name="allowNoResourceGroupMatch")
      private final @Nullable Output<Boolean> allowNoResourceGroupMatch;

    public Output<Boolean> getAllowNoResourceGroupMatch() {
        return this.allowNoResourceGroupMatch == null ? Output.empty() : this.allowNoResourceGroupMatch;
    }

    /**
     * OS policy assignment description. Length of the description is limited to 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * Required. Policy mode Possible values: MODE_UNSPECIFIED, VALIDATION, ENFORCEMENT
     * 
     */
    @Import(name="mode", required=true)
      private final Output<String> mode;

    public Output<String> getMode() {
        return this.mode;
    }

    /**
     * Required. List of resource groups for the policy. For a particular VM, resource groups are evaluated in the order specified and the first resource group that is applicable is selected and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag `allow_no_resource_group_match`
     * 
     */
    @Import(name="resourceGroups", required=true)
      private final Output<List<OsPolicyAssignmentOsPolicyResourceGroupGetArgs>> resourceGroups;

    public Output<List<OsPolicyAssignmentOsPolicyResourceGroupGetArgs>> getResourceGroups() {
        return this.resourceGroups;
    }

    public OsPolicyAssignmentOsPolicyGetArgs(
        @Nullable Output<Boolean> allowNoResourceGroupMatch,
        @Nullable Output<String> description,
        Output<String> id,
        Output<String> mode,
        Output<List<OsPolicyAssignmentOsPolicyResourceGroupGetArgs>> resourceGroups) {
        this.allowNoResourceGroupMatch = allowNoResourceGroupMatch;
        this.description = description;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.resourceGroups = Objects.requireNonNull(resourceGroups, "expected parameter 'resourceGroups' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyGetArgs() {
        this.allowNoResourceGroupMatch = Output.empty();
        this.description = Output.empty();
        this.id = Output.empty();
        this.mode = Output.empty();
        this.resourceGroups = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowNoResourceGroupMatch;
        private @Nullable Output<String> description;
        private Output<String> id;
        private Output<String> mode;
        private Output<List<OsPolicyAssignmentOsPolicyResourceGroupGetArgs>> resourceGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNoResourceGroupMatch = defaults.allowNoResourceGroupMatch;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.mode = defaults.mode;
    	      this.resourceGroups = defaults.resourceGroups;
        }

        public Builder allowNoResourceGroupMatch(@Nullable Output<Boolean> allowNoResourceGroupMatch) {
            this.allowNoResourceGroupMatch = allowNoResourceGroupMatch;
            return this;
        }

        public Builder allowNoResourceGroupMatch(@Nullable Boolean allowNoResourceGroupMatch) {
            this.allowNoResourceGroupMatch = Output.ofNullable(allowNoResourceGroupMatch);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder mode(Output<String> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder mode(String mode) {
            this.mode = Output.of(Objects.requireNonNull(mode));
            return this;
        }

        public Builder resourceGroups(Output<List<OsPolicyAssignmentOsPolicyResourceGroupGetArgs>> resourceGroups) {
            this.resourceGroups = Objects.requireNonNull(resourceGroups);
            return this;
        }

        public Builder resourceGroups(List<OsPolicyAssignmentOsPolicyResourceGroupGetArgs> resourceGroups) {
            this.resourceGroups = Output.of(Objects.requireNonNull(resourceGroups));
            return this;
        }
        public OsPolicyAssignmentOsPolicyGetArgs build() {
            return new OsPolicyAssignmentOsPolicyGetArgs(allowNoResourceGroupMatch, description, id, mode, resourceGroups);
        }
    }
}
