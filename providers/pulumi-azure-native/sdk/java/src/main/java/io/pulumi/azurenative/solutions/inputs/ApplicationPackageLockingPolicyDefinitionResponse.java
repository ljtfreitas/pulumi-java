// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed application locking policy.
 * 
 */
public final class ApplicationPackageLockingPolicyDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationPackageLockingPolicyDefinitionResponse Empty = new ApplicationPackageLockingPolicyDefinitionResponse();

    /**
     * The deny assignment excluded actions.
     * 
     */
    @Import(name="allowedActions")
      private final @Nullable List<String> allowedActions;

    public List<String> getAllowedActions() {
        return this.allowedActions == null ? List.of() : this.allowedActions;
    }

    /**
     * The deny assignment excluded data actions.
     * 
     */
    @Import(name="allowedDataActions")
      private final @Nullable List<String> allowedDataActions;

    public List<String> getAllowedDataActions() {
        return this.allowedDataActions == null ? List.of() : this.allowedDataActions;
    }

    public ApplicationPackageLockingPolicyDefinitionResponse(
        @Nullable List<String> allowedActions,
        @Nullable List<String> allowedDataActions) {
        this.allowedActions = allowedActions;
        this.allowedDataActions = allowedDataActions;
    }

    private ApplicationPackageLockingPolicyDefinitionResponse() {
        this.allowedActions = List.of();
        this.allowedDataActions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPackageLockingPolicyDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedActions;
        private @Nullable List<String> allowedDataActions;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationPackageLockingPolicyDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedActions = defaults.allowedActions;
    	      this.allowedDataActions = defaults.allowedDataActions;
        }

        public Builder allowedActions(@Nullable List<String> allowedActions) {
            this.allowedActions = allowedActions;
            return this;
        }

        public Builder allowedDataActions(@Nullable List<String> allowedDataActions) {
            this.allowedDataActions = allowedDataActions;
            return this;
        }
        public ApplicationPackageLockingPolicyDefinitionResponse build() {
            return new ApplicationPackageLockingPolicyDefinitionResponse(allowedActions, allowedDataActions);
        }
    }
}
