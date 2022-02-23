// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appsync.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDomainNameArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainNameArgs Empty = new GetDomainNameArgs();

    @InputImport(name="domainName", required=true)
        private final String domainName;

    public String getDomainName() {
        return this.domainName;
    }

    public GetDomainNameArgs(String domainName) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
    }

    private GetDomainNameArgs() {
        this.domainName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public GetDomainNameArgs build() {
            return new GetDomainNameArgs(domainName);
        }
    }
}
