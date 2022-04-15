// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigCaOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigCaOptionsGetArgs Empty = new AuthorityConfigX509ConfigCaOptionsGetArgs();

    /**
     * When true, the "CA" in Basic Constraints extension will be set to true.
     * 
     */
    @Import(name="isCa", required=true)
      private final Output<Boolean> isCa;

    public Output<Boolean> isCa() {
        return this.isCa;
    }

    /**
     * Refers to the "path length constraint" in Basic Constraints extension. For a CA certificate, this value describes the depth of
     * subordinate CA certificates that are allowed. If this value is less than 0, the request will fail.
     * 
     */
    @Import(name="maxIssuerPathLength")
      private final @Nullable Output<Integer> maxIssuerPathLength;

    public Output<Integer> maxIssuerPathLength() {
        return this.maxIssuerPathLength == null ? Codegen.empty() : this.maxIssuerPathLength;
    }

    /**
     * When true, the "CA" in Basic Constraints extension will be set to false.
     * If both `is_ca` and `non_ca` are unset, the extension will be omitted from the CA certificate.
     * 
     */
    @Import(name="nonCa")
      private final @Nullable Output<Boolean> nonCa;

    public Output<Boolean> nonCa() {
        return this.nonCa == null ? Codegen.empty() : this.nonCa;
    }

    /**
     * When true, the "path length constraint" in Basic Constraints extension will be set to 0.
     * if both `max_issuer_path_length` and `zero_max_issuer_path_length` are unset,
     * the max path length will be omitted from the CA certificate.
     * 
     */
    @Import(name="zeroMaxIssuerPathLength")
      private final @Nullable Output<Boolean> zeroMaxIssuerPathLength;

    public Output<Boolean> zeroMaxIssuerPathLength() {
        return this.zeroMaxIssuerPathLength == null ? Codegen.empty() : this.zeroMaxIssuerPathLength;
    }

    public AuthorityConfigX509ConfigCaOptionsGetArgs(
        Output<Boolean> isCa,
        @Nullable Output<Integer> maxIssuerPathLength,
        @Nullable Output<Boolean> nonCa,
        @Nullable Output<Boolean> zeroMaxIssuerPathLength) {
        this.isCa = Objects.requireNonNull(isCa, "expected parameter 'isCa' to be non-null");
        this.maxIssuerPathLength = maxIssuerPathLength;
        this.nonCa = nonCa;
        this.zeroMaxIssuerPathLength = zeroMaxIssuerPathLength;
    }

    private AuthorityConfigX509ConfigCaOptionsGetArgs() {
        this.isCa = Codegen.empty();
        this.maxIssuerPathLength = Codegen.empty();
        this.nonCa = Codegen.empty();
        this.zeroMaxIssuerPathLength = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigCaOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> isCa;
        private @Nullable Output<Integer> maxIssuerPathLength;
        private @Nullable Output<Boolean> nonCa;
        private @Nullable Output<Boolean> zeroMaxIssuerPathLength;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigCaOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCa = defaults.isCa;
    	      this.maxIssuerPathLength = defaults.maxIssuerPathLength;
    	      this.nonCa = defaults.nonCa;
    	      this.zeroMaxIssuerPathLength = defaults.zeroMaxIssuerPathLength;
        }

        public Builder isCa(Output<Boolean> isCa) {
            this.isCa = Objects.requireNonNull(isCa);
            return this;
        }
        public Builder isCa(Boolean isCa) {
            this.isCa = Output.of(Objects.requireNonNull(isCa));
            return this;
        }
        public Builder maxIssuerPathLength(@Nullable Output<Integer> maxIssuerPathLength) {
            this.maxIssuerPathLength = maxIssuerPathLength;
            return this;
        }
        public Builder maxIssuerPathLength(@Nullable Integer maxIssuerPathLength) {
            this.maxIssuerPathLength = Codegen.ofNullable(maxIssuerPathLength);
            return this;
        }
        public Builder nonCa(@Nullable Output<Boolean> nonCa) {
            this.nonCa = nonCa;
            return this;
        }
        public Builder nonCa(@Nullable Boolean nonCa) {
            this.nonCa = Codegen.ofNullable(nonCa);
            return this;
        }
        public Builder zeroMaxIssuerPathLength(@Nullable Output<Boolean> zeroMaxIssuerPathLength) {
            this.zeroMaxIssuerPathLength = zeroMaxIssuerPathLength;
            return this;
        }
        public Builder zeroMaxIssuerPathLength(@Nullable Boolean zeroMaxIssuerPathLength) {
            this.zeroMaxIssuerPathLength = Codegen.ofNullable(zeroMaxIssuerPathLength);
            return this;
        }        public AuthorityConfigX509ConfigCaOptionsGetArgs build() {
            return new AuthorityConfigX509ConfigCaOptionsGetArgs(isCa, maxIssuerPathLength, nonCa, zeroMaxIssuerPathLength);
        }
    }
}
