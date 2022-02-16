// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MangedSslCertificateManagedGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MangedSslCertificateManagedGetArgs Empty = new MangedSslCertificateManagedGetArgs();

    @InputImport(name="domains", required=true)
    private final Input<List<String>> domains;

    public Input<List<String>> getDomains() {
        return this.domains;
    }

    public MangedSslCertificateManagedGetArgs(Input<List<String>> domains) {
        this.domains = Objects.requireNonNull(domains, "expected parameter 'domains' to be non-null");
    }

    private MangedSslCertificateManagedGetArgs() {
        this.domains = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MangedSslCertificateManagedGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> domains;

        public Builder() {
    	      // Empty
        }

        public Builder(MangedSslCertificateManagedGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
        }

        public Builder setDomains(Input<List<String>> domains) {
            this.domains = Objects.requireNonNull(domains);
            return this;
        }

        public Builder setDomains(List<String> domains) {
            this.domains = Input.of(Objects.requireNonNull(domains));
            return this;
        }

        public MangedSslCertificateManagedGetArgs build() {
            return new MangedSslCertificateManagedGetArgs(domains);
        }
    }
}