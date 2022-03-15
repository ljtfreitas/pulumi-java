// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeClassStrategyOptions {
    /**
     * allowedRuntimeClassNames is an allowlist of RuntimeClass names that may be specified on a pod. A value of "*" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
     * 
     */
    private final List<String> allowedRuntimeClassNames;
    /**
     * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
     * 
     */
    private final @Nullable String defaultRuntimeClassName;

    @CustomType.Constructor
    private RuntimeClassStrategyOptions(
        @CustomType.Parameter("allowedRuntimeClassNames") List<String> allowedRuntimeClassNames,
        @CustomType.Parameter("defaultRuntimeClassName") @Nullable String defaultRuntimeClassName) {
        this.allowedRuntimeClassNames = allowedRuntimeClassNames;
        this.defaultRuntimeClassName = defaultRuntimeClassName;
    }

    /**
     * allowedRuntimeClassNames is an allowlist of RuntimeClass names that may be specified on a pod. A value of "*" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
     * 
    */
    public List<String> getAllowedRuntimeClassNames() {
        return this.allowedRuntimeClassNames;
    }
    /**
     * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
     * 
    */
    public Optional<String> getDefaultRuntimeClassName() {
        return Optional.ofNullable(this.defaultRuntimeClassName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeClassStrategyOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedRuntimeClassNames;
        private @Nullable String defaultRuntimeClassName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeClassStrategyOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRuntimeClassNames = defaults.allowedRuntimeClassNames;
    	      this.defaultRuntimeClassName = defaults.defaultRuntimeClassName;
        }

        public Builder allowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
            this.allowedRuntimeClassNames = Objects.requireNonNull(allowedRuntimeClassNames);
            return this;
        }

        public Builder defaultRuntimeClassName(@Nullable String defaultRuntimeClassName) {
            this.defaultRuntimeClassName = defaultRuntimeClassName;
            return this;
        }
        public RuntimeClassStrategyOptions build() {
            return new RuntimeClassStrategyOptions(allowedRuntimeClassNames, defaultRuntimeClassName);
        }
    }
}
