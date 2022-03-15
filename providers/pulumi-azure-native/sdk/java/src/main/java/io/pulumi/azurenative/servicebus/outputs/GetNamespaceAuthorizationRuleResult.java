// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNamespaceAuthorizationRuleResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The rights associated with the rule.
     * 
     */
    private final List<String> rights;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetNamespaceAuthorizationRuleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rights") List<String> rights,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.rights = rights;
        this.type = type;
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The rights associated with the rule.
     * 
    */
    public List<String> getRights() {
        return this.rights;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceAuthorizationRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private List<String> rights;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceAuthorizationRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.rights = defaults.rights;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder rights(List<String> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetNamespaceAuthorizationRuleResult build() {
            return new GetNamespaceAuthorizationRuleResult(id, name, rights, type);
        }
    }
}
