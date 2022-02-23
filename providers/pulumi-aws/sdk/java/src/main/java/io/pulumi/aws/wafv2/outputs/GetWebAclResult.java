// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetWebAclResult {
    /**
     * The Amazon Resource Name (ARN) of the entity.
     * 
     */
    private final String arn;
    /**
     * The description of the WebACL that helps with identification.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String scope;

    @OutputCustomType.Constructor({"arn","description","id","name","scope"})
    private GetWebAclResult(
        String arn,
        String description,
        String id,
        String name,
        String scope) {
        this.arn = Objects.requireNonNull(arn);
        this.description = Objects.requireNonNull(description);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.scope = Objects.requireNonNull(scope);
    }

    /**
     * The Amazon Resource Name (ARN) of the entity.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The description of the WebACL that helps with identification.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getScope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAclResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private String name;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAclResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetWebAclResult build() {
            return new GetWebAclResult(arn, description, id, name, scope);
        }
    }
}
