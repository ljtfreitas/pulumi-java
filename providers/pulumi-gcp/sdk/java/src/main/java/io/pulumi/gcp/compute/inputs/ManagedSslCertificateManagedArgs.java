// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ManagedSslCertificateManagedArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedSslCertificateManagedArgs Empty = new ManagedSslCertificateManagedArgs();

    /**
     * Domains for which a managed SSL certificate will be valid.  Currently,
     * there can be up to 100 domains in this list.
     * 
     */
    @Import(name="domains", required=true)
      private final Output<List<String>> domains;

    public Output<List<String>> getDomains() {
        return this.domains;
    }

    public ManagedSslCertificateManagedArgs(Output<List<String>> domains) {
        this.domains = Objects.requireNonNull(domains, "expected parameter 'domains' to be non-null");
    }

    private ManagedSslCertificateManagedArgs() {
        this.domains = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedSslCertificateManagedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> domains;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedSslCertificateManagedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
        }

        public Builder domains(Output<List<String>> domains) {
            this.domains = Objects.requireNonNull(domains);
            return this;
        }

        public Builder domains(List<String> domains) {
            this.domains = Output.of(Objects.requireNonNull(domains));
            return this;
        }
        public ManagedSslCertificateManagedArgs build() {
            return new ManagedSslCertificateManagedArgs(domains);
        }
    }
}
