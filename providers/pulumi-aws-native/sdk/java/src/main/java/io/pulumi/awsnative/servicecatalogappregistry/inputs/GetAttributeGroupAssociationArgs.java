// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAttributeGroupAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAttributeGroupAssociationArgs Empty = new GetAttributeGroupAssociationArgs();

    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    public GetAttributeGroupAssociationArgs(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private GetAttributeGroupAssociationArgs() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttributeGroupAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttributeGroupAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetAttributeGroupAssociationArgs build() {
            return new GetAttributeGroupAssociationArgs(id);
        }
    }
}
