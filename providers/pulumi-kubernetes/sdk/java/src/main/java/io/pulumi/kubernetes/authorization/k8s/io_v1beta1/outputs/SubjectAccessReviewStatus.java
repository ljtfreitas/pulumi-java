// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubjectAccessReviewStatus {
    /**
     * Allowed is required. True if the action would be allowed, false otherwise.
     * 
     */
    private final Boolean allowed;
    /**
     * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
     * 
     */
    private final @Nullable Boolean denied;
    /**
     * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
     * 
     */
    private final @Nullable String evaluationError;
    /**
     * Reason is optional.  It indicates why a request was allowed or denied.
     * 
     */
    private final @Nullable String reason;

    @CustomType.Constructor
    private SubjectAccessReviewStatus(
        @CustomType.Parameter("allowed") Boolean allowed,
        @CustomType.Parameter("denied") @Nullable Boolean denied,
        @CustomType.Parameter("evaluationError") @Nullable String evaluationError,
        @CustomType.Parameter("reason") @Nullable String reason) {
        this.allowed = allowed;
        this.denied = denied;
        this.evaluationError = evaluationError;
        this.reason = reason;
    }

    /**
     * Allowed is required. True if the action would be allowed, false otherwise.
     * 
    */
    public Boolean getAllowed() {
        return this.allowed;
    }
    /**
     * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
     * 
    */
    public Optional<Boolean> getDenied() {
        return Optional.ofNullable(this.denied);
    }
    /**
     * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
     * 
    */
    public Optional<String> getEvaluationError() {
        return Optional.ofNullable(this.evaluationError);
    }
    /**
     * Reason is optional.  It indicates why a request was allowed or denied.
     * 
    */
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectAccessReviewStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowed;
        private @Nullable Boolean denied;
        private @Nullable String evaluationError;
        private @Nullable String reason;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectAccessReviewStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowed = defaults.allowed;
    	      this.denied = defaults.denied;
    	      this.evaluationError = defaults.evaluationError;
    	      this.reason = defaults.reason;
        }

        public Builder allowed(Boolean allowed) {
            this.allowed = Objects.requireNonNull(allowed);
            return this;
        }

        public Builder denied(@Nullable Boolean denied) {
            this.denied = denied;
            return this;
        }

        public Builder evaluationError(@Nullable String evaluationError) {
            this.evaluationError = evaluationError;
            return this;
        }

        public Builder reason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }
        public SubjectAccessReviewStatus build() {
            return new SubjectAccessReviewStatus(allowed, denied, evaluationError, reason);
        }
    }
}
