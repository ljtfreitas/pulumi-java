// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudidentity_v1beta1.inputs.DynamicGroupMetadataArgs;
import io.pulumi.googlenative.cloudidentity_v1beta1.inputs.EntityKeyArgs;
import io.pulumi.googlenative.cloudidentity_v1beta1.inputs.PosixGroupArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * Additional entity key aliases for a Group.
     * 
     */
    @InputImport(name="additionalGroupKeys")
      private final @Nullable Input<List<EntityKeyArgs>> additionalGroupKeys;

    public Input<List<EntityKeyArgs>> getAdditionalGroupKeys() {
        return this.additionalGroupKeys == null ? Input.empty() : this.additionalGroupKeys;
    }

    /**
     * An extended description to help users determine the purpose of a `Group`. Must not be longer than 4,096 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The display name of the `Group`.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Optional. Dynamic group metadata like queries and status.
     * 
     */
    @InputImport(name="dynamicGroupMetadata")
      private final @Nullable Input<DynamicGroupMetadataArgs> dynamicGroupMetadata;

    public Input<DynamicGroupMetadataArgs> getDynamicGroupMetadata() {
        return this.dynamicGroupMetadata == null ? Input.empty() : this.dynamicGroupMetadata;
    }

    /**
     * The `EntityKey` of the `Group`.
     * 
     */
    @InputImport(name="groupKey", required=true)
      private final Input<EntityKeyArgs> groupKey;

    public Input<EntityKeyArgs> getGroupKey() {
        return this.groupKey;
    }

    @InputImport(name="initialGroupConfig", required=true)
      private final Input<String> initialGroupConfig;

    public Input<String> getInitialGroupConfig() {
        return this.initialGroupConfig;
    }

    /**
     * One or more label entries that apply to the Group. Currently supported labels contain a key with an empty value. Google Groups are the default type of group and have a label with a key of `cloudidentity.googleapis.com/groups.discussion_forum` and an empty value. Existing Google Groups can have an additional label with a key of `cloudidentity.googleapis.com/groups.security` and an empty value added to them. **This is an immutable change and the security label cannot be removed once added.** Dynamic groups have a label with a key of `cloudidentity.googleapis.com/groups.dynamic`. Identity-mapped groups for Cloud Search have a label with a key of `system/groups/external` and an empty value.
     * 
     */
    @InputImport(name="labels", required=true)
      private final Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels;
    }

    /**
     * Immutable. The resource name of the entity under which this `Group` resides in the Cloud Identity resource hierarchy. Must be of the form `identitysources/{identity_source_id}` for external- identity-mapped groups or `customers/{customer_id}` for Google Groups. The `customer_id` must begin with "C" (for example, 'C046psxkn').
     * 
     */
    @InputImport(name="parent", required=true)
      private final Input<String> parent;

    public Input<String> getParent() {
        return this.parent;
    }

    /**
     * Optional. The POSIX groups associated with the `Group`.
     * 
     */
    @InputImport(name="posixGroups")
      private final @Nullable Input<List<PosixGroupArgs>> posixGroups;

    public Input<List<PosixGroupArgs>> getPosixGroups() {
        return this.posixGroups == null ? Input.empty() : this.posixGroups;
    }

    public GroupArgs(
        @Nullable Input<List<EntityKeyArgs>> additionalGroupKeys,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<DynamicGroupMetadataArgs> dynamicGroupMetadata,
        Input<EntityKeyArgs> groupKey,
        Input<String> initialGroupConfig,
        Input<Map<String,String>> labels,
        Input<String> parent,
        @Nullable Input<List<PosixGroupArgs>> posixGroups) {
        this.additionalGroupKeys = additionalGroupKeys;
        this.description = description;
        this.displayName = displayName;
        this.dynamicGroupMetadata = dynamicGroupMetadata;
        this.groupKey = Objects.requireNonNull(groupKey, "expected parameter 'groupKey' to be non-null");
        this.initialGroupConfig = Objects.requireNonNull(initialGroupConfig, "expected parameter 'initialGroupConfig' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.posixGroups = posixGroups;
    }

    private GroupArgs() {
        this.additionalGroupKeys = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.dynamicGroupMetadata = Input.empty();
        this.groupKey = Input.empty();
        this.initialGroupConfig = Input.empty();
        this.labels = Input.empty();
        this.parent = Input.empty();
        this.posixGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EntityKeyArgs>> additionalGroupKeys;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<DynamicGroupMetadataArgs> dynamicGroupMetadata;
        private Input<EntityKeyArgs> groupKey;
        private Input<String> initialGroupConfig;
        private Input<Map<String,String>> labels;
        private Input<String> parent;
        private @Nullable Input<List<PosixGroupArgs>> posixGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalGroupKeys = defaults.additionalGroupKeys;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.dynamicGroupMetadata = defaults.dynamicGroupMetadata;
    	      this.groupKey = defaults.groupKey;
    	      this.initialGroupConfig = defaults.initialGroupConfig;
    	      this.labels = defaults.labels;
    	      this.parent = defaults.parent;
    	      this.posixGroups = defaults.posixGroups;
        }

        public Builder setAdditionalGroupKeys(@Nullable Input<List<EntityKeyArgs>> additionalGroupKeys) {
            this.additionalGroupKeys = additionalGroupKeys;
            return this;
        }

        public Builder setAdditionalGroupKeys(@Nullable List<EntityKeyArgs> additionalGroupKeys) {
            this.additionalGroupKeys = Input.ofNullable(additionalGroupKeys);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setDynamicGroupMetadata(@Nullable Input<DynamicGroupMetadataArgs> dynamicGroupMetadata) {
            this.dynamicGroupMetadata = dynamicGroupMetadata;
            return this;
        }

        public Builder setDynamicGroupMetadata(@Nullable DynamicGroupMetadataArgs dynamicGroupMetadata) {
            this.dynamicGroupMetadata = Input.ofNullable(dynamicGroupMetadata);
            return this;
        }

        public Builder setGroupKey(Input<EntityKeyArgs> groupKey) {
            this.groupKey = Objects.requireNonNull(groupKey);
            return this;
        }

        public Builder setGroupKey(EntityKeyArgs groupKey) {
            this.groupKey = Input.of(Objects.requireNonNull(groupKey));
            return this;
        }

        public Builder setInitialGroupConfig(Input<String> initialGroupConfig) {
            this.initialGroupConfig = Objects.requireNonNull(initialGroupConfig);
            return this;
        }

        public Builder setInitialGroupConfig(String initialGroupConfig) {
            this.initialGroupConfig = Input.of(Objects.requireNonNull(initialGroupConfig));
            return this;
        }

        public Builder setLabels(Input<Map<String,String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Input.of(Objects.requireNonNull(labels));
            return this;
        }

        public Builder setParent(Input<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Input.of(Objects.requireNonNull(parent));
            return this;
        }

        public Builder setPosixGroups(@Nullable Input<List<PosixGroupArgs>> posixGroups) {
            this.posixGroups = posixGroups;
            return this;
        }

        public Builder setPosixGroups(@Nullable List<PosixGroupArgs> posixGroups) {
            this.posixGroups = Input.ofNullable(posixGroups);
            return this;
        }
        public GroupArgs build() {
            return new GroupArgs(additionalGroupKeys, description, displayName, dynamicGroupMetadata, groupKey, initialGroupConfig, labels, parent, posixGroups);
        }
    }
}
