// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScopedResourceSelectorRequirement {
    /**
     * Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
     * 
     * Possible enum values:
     *  - `"DoesNotExist"`
     *  - `"Exists"`
     *  - `"In"`
     *  - `"NotIn"`
     * 
     */
    private final String operator;
    /**
     * The name of the scope that the selector applies to.
     * 
     * Possible enum values:
     *  - `"BestEffort"` Match all pod objects that have best effort quality of service
     *  - `"CrossNamespacePodAffinity"` Match all pod objects that have cross-namespace pod (anti)affinity mentioned. This is a beta feature enabled by the PodAffinityNamespaceSelector feature flag.
     *  - `"NotBestEffort"` Match all pod objects that do not have best effort quality of service
     *  - `"NotTerminating"` Match all pod objects where spec.activeDeadlineSeconds is nil
     *  - `"PriorityClass"` Match all pod objects that have priority class mentioned
     *  - `"Terminating"` Match all pod objects where spec.activeDeadlineSeconds >=0
     * 
     */
    private final String scopeName;
    /**
     * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    private final @Nullable List<String> values;

    @OutputCustomType.Constructor({"operator","scopeName","values"})
    private ScopedResourceSelectorRequirement(
        String operator,
        String scopeName,
        @Nullable List<String> values) {
        this.operator = Objects.requireNonNull(operator);
        this.scopeName = Objects.requireNonNull(scopeName);
        this.values = values;
    }

    /**
     * Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
     * 
     * Possible enum values:
     *  - `"DoesNotExist"`
     *  - `"Exists"`
     *  - `"In"`
     *  - `"NotIn"`
     * 
     */
    public String getOperator() {
        return this.operator;
    }
    /**
     * The name of the scope that the selector applies to.
     * 
     * Possible enum values:
     *  - `"BestEffort"` Match all pod objects that have best effort quality of service
     *  - `"CrossNamespacePodAffinity"` Match all pod objects that have cross-namespace pod (anti)affinity mentioned. This is a beta feature enabled by the PodAffinityNamespaceSelector feature flag.
     *  - `"NotBestEffort"` Match all pod objects that do not have best effort quality of service
     *  - `"NotTerminating"` Match all pod objects where spec.activeDeadlineSeconds is nil
     *  - `"PriorityClass"` Match all pod objects that have priority class mentioned
     *  - `"Terminating"` Match all pod objects where spec.activeDeadlineSeconds >=0
     * 
     */
    public String getScopeName() {
        return this.scopeName;
    }
    /**
     * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    public List<String> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopedResourceSelectorRequirement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operator;
        private String scopeName;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopedResourceSelectorRequirement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.scopeName = defaults.scopeName;
    	      this.values = defaults.values;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setScopeName(String scopeName) {
            this.scopeName = Objects.requireNonNull(scopeName);
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public ScopedResourceSelectorRequirement build() {
            return new ScopedResourceSelectorRequirement(operator, scopeName, values);
        }
    }
}
