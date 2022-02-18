// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.AssignedUserArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for a personal compute instance.
 * 
 */
public final class PersonalComputeInstanceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PersonalComputeInstanceSettingsArgs Empty = new PersonalComputeInstanceSettingsArgs();

    /**
     * A user explicitly assigned to a personal compute instance.
     * 
     */
    @InputImport(name="assignedUser")
    private final @Nullable Input<AssignedUserArgs> assignedUser;

    public Input<AssignedUserArgs> getAssignedUser() {
        return this.assignedUser == null ? Input.empty() : this.assignedUser;
    }

    public PersonalComputeInstanceSettingsArgs(@Nullable Input<AssignedUserArgs> assignedUser) {
        this.assignedUser = assignedUser;
    }

    private PersonalComputeInstanceSettingsArgs() {
        this.assignedUser = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersonalComputeInstanceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AssignedUserArgs> assignedUser;

        public Builder() {
    	      // Empty
        }

        public Builder(PersonalComputeInstanceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedUser = defaults.assignedUser;
        }

        public Builder setAssignedUser(@Nullable Input<AssignedUserArgs> assignedUser) {
            this.assignedUser = assignedUser;
            return this;
        }

        public Builder setAssignedUser(@Nullable AssignedUserArgs assignedUser) {
            this.assignedUser = Input.ofNullable(assignedUser);
            return this;
        }

        public PersonalComputeInstanceSettingsArgs build() {
            return new PersonalComputeInstanceSettingsArgs(assignedUser);
        }
    }
}
