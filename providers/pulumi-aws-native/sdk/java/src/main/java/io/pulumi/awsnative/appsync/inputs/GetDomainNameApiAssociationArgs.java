// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appsync.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDomainNameApiAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainNameApiAssociationArgs Empty = new GetDomainNameApiAssociationArgs();

    @InputImport(name="apiAssociationIdentifier", required=true)
        private final String apiAssociationIdentifier;

    public String getApiAssociationIdentifier() {
        return this.apiAssociationIdentifier;
    }

    public GetDomainNameApiAssociationArgs(String apiAssociationIdentifier) {
        this.apiAssociationIdentifier = Objects.requireNonNull(apiAssociationIdentifier, "expected parameter 'apiAssociationIdentifier' to be non-null");
    }

    private GetDomainNameApiAssociationArgs() {
        this.apiAssociationIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainNameApiAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiAssociationIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainNameApiAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiAssociationIdentifier = defaults.apiAssociationIdentifier;
        }

        public Builder setApiAssociationIdentifier(String apiAssociationIdentifier) {
            this.apiAssociationIdentifier = Objects.requireNonNull(apiAssociationIdentifier);
            return this;
        }
        public GetDomainNameApiAssociationArgs build() {
            return new GetDomainNameApiAssociationArgs(apiAssociationIdentifier);
        }
    }
}
