// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClientAuthenticationTlsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClientAuthenticationTlsArgs Empty = new ClusterClientAuthenticationTlsArgs();

    /**
     * List of ACM Certificate Authority Amazon Resource Names (ARNs).
     * 
     */
    @InputImport(name="certificateAuthorityArns")
    private final @Nullable Input<List<String>> certificateAuthorityArns;

    public Input<List<String>> getCertificateAuthorityArns() {
        return this.certificateAuthorityArns == null ? Input.empty() : this.certificateAuthorityArns;
    }

    public ClusterClientAuthenticationTlsArgs(@Nullable Input<List<String>> certificateAuthorityArns) {
        this.certificateAuthorityArns = certificateAuthorityArns;
    }

    private ClusterClientAuthenticationTlsArgs() {
        this.certificateAuthorityArns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClientAuthenticationTlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> certificateAuthorityArns;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClientAuthenticationTlsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityArns = defaults.certificateAuthorityArns;
        }

        public Builder setCertificateAuthorityArns(@Nullable Input<List<String>> certificateAuthorityArns) {
            this.certificateAuthorityArns = certificateAuthorityArns;
            return this;
        }

        public Builder setCertificateAuthorityArns(@Nullable List<String> certificateAuthorityArns) {
            this.certificateAuthorityArns = Input.ofNullable(certificateAuthorityArns);
            return this;
        }
        public ClusterClientAuthenticationTlsArgs build() {
            return new ClusterClientAuthenticationTlsArgs(certificateAuthorityArns);
        }
    }
}
