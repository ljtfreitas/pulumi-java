// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssignmentPrincipalArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignmentPrincipalArgs Empty = new AssignmentPrincipalArgs();

    @InputImport(name="principalId", required=true)
    private final Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId;
    }

    @InputImport(name="principalMetadata")
    private final @Nullable Input<Map<String,String>> principalMetadata;

    public Input<Map<String,String>> getPrincipalMetadata() {
        return this.principalMetadata == null ? Input.empty() : this.principalMetadata;
    }

    @InputImport(name="principalType", required=true)
    private final Input<String> principalType;

    public Input<String> getPrincipalType() {
        return this.principalType;
    }

    public AssignmentPrincipalArgs(
        Input<String> principalId,
        @Nullable Input<Map<String,String>> principalMetadata,
        Input<String> principalType) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.principalMetadata = principalMetadata;
        this.principalType = Objects.requireNonNull(principalType, "expected parameter 'principalType' to be non-null");
    }

    private AssignmentPrincipalArgs() {
        this.principalId = Input.empty();
        this.principalMetadata = Input.empty();
        this.principalType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentPrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> principalId;
        private @Nullable Input<Map<String,String>> principalMetadata;
        private Input<String> principalType;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentPrincipalArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.principalMetadata = defaults.principalMetadata;
    	      this.principalType = defaults.principalType;
        }

        public Builder setPrincipalId(Input<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Input.of(Objects.requireNonNull(principalId));
            return this;
        }

        public Builder setPrincipalMetadata(@Nullable Input<Map<String,String>> principalMetadata) {
            this.principalMetadata = principalMetadata;
            return this;
        }

        public Builder setPrincipalMetadata(@Nullable Map<String,String> principalMetadata) {
            this.principalMetadata = Input.ofNullable(principalMetadata);
            return this;
        }

        public Builder setPrincipalType(Input<String> principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }

        public Builder setPrincipalType(String principalType) {
            this.principalType = Input.of(Objects.requireNonNull(principalType));
            return this;
        }

        public AssignmentPrincipalArgs build() {
            return new AssignmentPrincipalArgs(principalId, principalMetadata, principalType);
        }
    }
}