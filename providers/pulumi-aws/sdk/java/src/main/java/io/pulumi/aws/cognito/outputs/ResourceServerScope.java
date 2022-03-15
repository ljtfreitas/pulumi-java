// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceServerScope {
    /**
     * The scope description.
     * 
     */
    private final String scopeDescription;
    /**
     * The scope name.
     * 
     */
    private final String scopeName;

    @CustomType.Constructor
    private ResourceServerScope(
        @CustomType.Parameter("scopeDescription") String scopeDescription,
        @CustomType.Parameter("scopeName") String scopeName) {
        this.scopeDescription = scopeDescription;
        this.scopeName = scopeName;
    }

    /**
     * The scope description.
     * 
    */
    public String getScopeDescription() {
        return this.scopeDescription;
    }
    /**
     * The scope name.
     * 
    */
    public String getScopeName() {
        return this.scopeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceServerScope defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scopeDescription;
        private String scopeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceServerScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scopeDescription = defaults.scopeDescription;
    	      this.scopeName = defaults.scopeName;
        }

        public Builder scopeDescription(String scopeDescription) {
            this.scopeDescription = Objects.requireNonNull(scopeDescription);
            return this;
        }

        public Builder scopeName(String scopeName) {
            this.scopeName = Objects.requireNonNull(scopeName);
            return this;
        }
        public ResourceServerScope build() {
            return new ResourceServerScope(scopeDescription, scopeName);
        }
    }
}
