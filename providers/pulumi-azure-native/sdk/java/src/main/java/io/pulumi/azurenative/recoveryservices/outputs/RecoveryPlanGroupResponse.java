// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.RecoveryPlanActionResponse;
import io.pulumi.azurenative.recoveryservices.outputs.RecoveryPlanProtectedItemResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecoveryPlanGroupResponse {
    /**
     * The end group actions.
     * 
     */
    private final @Nullable List<RecoveryPlanActionResponse> endGroupActions;
    /**
     * The group type.
     * 
     */
    private final String groupType;
    /**
     * The list of protected items.
     * 
     */
    private final @Nullable List<RecoveryPlanProtectedItemResponse> replicationProtectedItems;
    /**
     * The start group actions.
     * 
     */
    private final @Nullable List<RecoveryPlanActionResponse> startGroupActions;

    @OutputCustomType.Constructor({"endGroupActions","groupType","replicationProtectedItems","startGroupActions"})
    private RecoveryPlanGroupResponse(
        @Nullable List<RecoveryPlanActionResponse> endGroupActions,
        String groupType,
        @Nullable List<RecoveryPlanProtectedItemResponse> replicationProtectedItems,
        @Nullable List<RecoveryPlanActionResponse> startGroupActions) {
        this.endGroupActions = endGroupActions;
        this.groupType = Objects.requireNonNull(groupType);
        this.replicationProtectedItems = replicationProtectedItems;
        this.startGroupActions = startGroupActions;
    }

    /**
     * The end group actions.
     * 
     */
    public List<RecoveryPlanActionResponse> getEndGroupActions() {
        return this.endGroupActions == null ? List.of() : this.endGroupActions;
    }
    /**
     * The group type.
     * 
     */
    public String getGroupType() {
        return this.groupType;
    }
    /**
     * The list of protected items.
     * 
     */
    public List<RecoveryPlanProtectedItemResponse> getReplicationProtectedItems() {
        return this.replicationProtectedItems == null ? List.of() : this.replicationProtectedItems;
    }
    /**
     * The start group actions.
     * 
     */
    public List<RecoveryPlanActionResponse> getStartGroupActions() {
        return this.startGroupActions == null ? List.of() : this.startGroupActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RecoveryPlanActionResponse> endGroupActions;
        private String groupType;
        private @Nullable List<RecoveryPlanProtectedItemResponse> replicationProtectedItems;
        private @Nullable List<RecoveryPlanActionResponse> startGroupActions;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endGroupActions = defaults.endGroupActions;
    	      this.groupType = defaults.groupType;
    	      this.replicationProtectedItems = defaults.replicationProtectedItems;
    	      this.startGroupActions = defaults.startGroupActions;
        }

        public Builder setEndGroupActions(@Nullable List<RecoveryPlanActionResponse> endGroupActions) {
            this.endGroupActions = endGroupActions;
            return this;
        }

        public Builder setGroupType(String groupType) {
            this.groupType = Objects.requireNonNull(groupType);
            return this;
        }

        public Builder setReplicationProtectedItems(@Nullable List<RecoveryPlanProtectedItemResponse> replicationProtectedItems) {
            this.replicationProtectedItems = replicationProtectedItems;
            return this;
        }

        public Builder setStartGroupActions(@Nullable List<RecoveryPlanActionResponse> startGroupActions) {
            this.startGroupActions = startGroupActions;
            return this;
        }

        public RecoveryPlanGroupResponse build() {
            return new RecoveryPlanGroupResponse(endGroupActions, groupType, replicationProtectedItems, startGroupActions);
        }
    }
}
