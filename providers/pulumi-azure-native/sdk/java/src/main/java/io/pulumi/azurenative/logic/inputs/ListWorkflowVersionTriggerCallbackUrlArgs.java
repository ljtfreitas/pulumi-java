// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.KeyType;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListWorkflowVersionTriggerCallbackUrlArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListWorkflowVersionTriggerCallbackUrlArgs Empty = new ListWorkflowVersionTriggerCallbackUrlArgs();

    /**
     * The key type.
     * 
     */
    @InputImport(name="keyType")
        private final @Nullable Either<String,KeyType> keyType;

    public Either<String,KeyType> getKeyType() {
        return this.keyType == null ? null : this.keyType;
    }

    /**
     * The expiry time.
     * 
     */
    @InputImport(name="notAfter")
        private final @Nullable String notAfter;

    public Optional<String> getNotAfter() {
        return this.notAfter == null ? Optional.empty() : Optional.ofNullable(this.notAfter);
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workflow trigger name.
     * 
     */
    @InputImport(name="triggerName", required=true)
        private final String triggerName;

    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * The workflow versionId.
     * 
     */
    @InputImport(name="versionId", required=true)
        private final String versionId;

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * The workflow name.
     * 
     */
    @InputImport(name="workflowName", required=true)
        private final String workflowName;

    public String getWorkflowName() {
        return this.workflowName;
    }

    public ListWorkflowVersionTriggerCallbackUrlArgs(
        @Nullable Either<String,KeyType> keyType,
        @Nullable String notAfter,
        String resourceGroupName,
        String triggerName,
        String versionId,
        String workflowName) {
        this.keyType = keyType;
        this.notAfter = notAfter;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.triggerName = Objects.requireNonNull(triggerName, "expected parameter 'triggerName' to be non-null");
        this.versionId = Objects.requireNonNull(versionId, "expected parameter 'versionId' to be non-null");
        this.workflowName = Objects.requireNonNull(workflowName, "expected parameter 'workflowName' to be non-null");
    }

    private ListWorkflowVersionTriggerCallbackUrlArgs() {
        this.keyType = null;
        this.notAfter = null;
        this.resourceGroupName = null;
        this.triggerName = null;
        this.versionId = null;
        this.workflowName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkflowVersionTriggerCallbackUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<String,KeyType> keyType;
        private @Nullable String notAfter;
        private String resourceGroupName;
        private String triggerName;
        private String versionId;
        private String workflowName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkflowVersionTriggerCallbackUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyType = defaults.keyType;
    	      this.notAfter = defaults.notAfter;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.triggerName = defaults.triggerName;
    	      this.versionId = defaults.versionId;
    	      this.workflowName = defaults.workflowName;
        }

        public Builder setKeyType(@Nullable Either<String,KeyType> keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder setNotAfter(@Nullable String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTriggerName(String triggerName) {
            this.triggerName = Objects.requireNonNull(triggerName);
            return this;
        }

        public Builder setVersionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }

        public Builder setWorkflowName(String workflowName) {
            this.workflowName = Objects.requireNonNull(workflowName);
            return this;
        }
        public ListWorkflowVersionTriggerCallbackUrlArgs build() {
            return new ListWorkflowVersionTriggerCallbackUrlArgs(keyType, notAfter, resourceGroupName, triggerName, versionId, workflowName);
        }
    }
}
