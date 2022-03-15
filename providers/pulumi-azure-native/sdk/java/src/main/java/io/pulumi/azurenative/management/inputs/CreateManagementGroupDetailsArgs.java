// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.inputs;

import io.pulumi.azurenative.management.inputs.CreateParentGroupInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The details of a management group used during creation.
 * 
 */
public final class CreateManagementGroupDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateManagementGroupDetailsArgs Empty = new CreateManagementGroupDetailsArgs();

    /**
     * (Optional) The ID of the parent management group used during creation.
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<CreateParentGroupInfoArgs> parent;

    public Output<CreateParentGroupInfoArgs> getParent() {
        return this.parent == null ? Output.empty() : this.parent;
    }

    public CreateManagementGroupDetailsArgs(@Nullable Output<CreateParentGroupInfoArgs> parent) {
        this.parent = parent;
    }

    private CreateManagementGroupDetailsArgs() {
        this.parent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateManagementGroupDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CreateParentGroupInfoArgs> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateManagementGroupDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parent = defaults.parent;
        }

        public Builder parent(@Nullable Output<CreateParentGroupInfoArgs> parent) {
            this.parent = parent;
            return this;
        }

        public Builder parent(@Nullable CreateParentGroupInfoArgs parent) {
            this.parent = Output.ofNullable(parent);
            return this;
        }
        public CreateManagementGroupDetailsArgs build() {
            return new CreateManagementGroupDetailsArgs(parent);
        }
    }
}
