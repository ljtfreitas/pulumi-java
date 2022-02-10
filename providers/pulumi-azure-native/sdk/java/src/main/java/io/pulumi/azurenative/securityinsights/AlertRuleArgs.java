// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.AlertRuleKind;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertRuleArgs Empty = new AlertRuleArgs();

    @InputImport(name="kind", required=true)
    private final Input<Either<String,AlertRuleKind>> kind;

    public Input<Either<String,AlertRuleKind>> getKind() {
        return this.kind;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="ruleId")
    private final @Nullable Input<String> ruleId;

    public Input<String> getRuleId() {
        return this.ruleId == null ? Input.empty() : this.ruleId;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public AlertRuleArgs(
        Input<Either<String,AlertRuleKind>> kind,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleId,
        Input<String> workspaceName) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleId = ruleId;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private AlertRuleArgs() {
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleId = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,AlertRuleKind>> kind;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleId;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleId = defaults.ruleId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setKind(Input<Either<String,AlertRuleKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(Either<String,AlertRuleKind> kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setRuleId(@Nullable Input<String> ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public Builder setRuleId(@Nullable String ruleId) {
            this.ruleId = Input.ofNullable(ruleId);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public AlertRuleArgs build() {
            return new AlertRuleArgs(kind, resourceGroupName, ruleId, workspaceName);
        }
    }
}