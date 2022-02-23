// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management;

import io.pulumi.azurenative.management.inputs.CreateManagementGroupDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementGroupArgs Empty = new ManagementGroupArgs();

    /**
     * The details of a management group used during creation.
     * 
     */
    @InputImport(name="details")
        private final @Nullable Input<CreateManagementGroupDetailsArgs> details;

    public Input<CreateManagementGroupDetailsArgs> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    /**
     * The friendly name of the management group. If no value is passed then this  field will be set to the groupId.
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Management Group ID.
     * 
     */
    @InputImport(name="groupId")
        private final @Nullable Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId == null ? Input.empty() : this.groupId;
    }

    /**
     * The name of the management group. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ManagementGroupArgs(
        @Nullable Input<CreateManagementGroupDetailsArgs> details,
        @Nullable Input<String> displayName,
        @Nullable Input<String> groupId,
        @Nullable Input<String> name) {
        this.details = details;
        this.displayName = displayName;
        this.groupId = groupId;
        this.name = name;
    }

    private ManagementGroupArgs() {
        this.details = Input.empty();
        this.displayName = Input.empty();
        this.groupId = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CreateManagementGroupDetailsArgs> details;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> groupId;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.displayName = defaults.displayName;
    	      this.groupId = defaults.groupId;
    	      this.name = defaults.name;
        }

        public Builder setDetails(@Nullable Input<CreateManagementGroupDetailsArgs> details) {
            this.details = details;
            return this;
        }

        public Builder setDetails(@Nullable CreateManagementGroupDetailsArgs details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setGroupId(@Nullable Input<String> groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = Input.ofNullable(groupId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public ManagementGroupArgs build() {
            return new ManagementGroupArgs(details, displayName, groupId, name);
        }
    }
}
